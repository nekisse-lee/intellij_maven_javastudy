package tyrant;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class TyrantMap {
  public static final int OPERATION_PREFIX = 0xC8;
  public static final int OPERATION_PUT = 0x10;
  public static final int OPERATION_GET = 0x30;
  private DataInputStream reader;
  private DataOutputStream writer;
  private Socket socket;



  public void open() throws IOException {
    socket = new Socket("localhost", 1978);
    writer = new DataOutputStream(socket.getOutputStream());
    reader = new DataInputStream(socket.getInputStream());
  }

  public void put(String key, String value) throws IOException {
    writeHeader(OPERATION_PUT);
    writeKeyValue(key, value);
    verifyStatus();
  }

  public byte[] get(String key) throws IOException {
    writeHeader(OPERATION_GET);
    writeKey(key, key.getBytes());
    verifyStatus();
    return readResults();
  }

  private byte[] readResults() throws IOException {
    int length = reader.readInt();
    byte[] resutls = new byte[length];
    reader.read(resutls);
    return resutls;
  }

  private void writeKey(String key, byte[] bytes) throws IOException {
    writer.writeInt(key.length());
    writer.write(bytes);
  }

  public void close() throws IOException {
    socket.close();
  }

  private void verifyStatus() throws IOException {
    int status = reader.read();
    assertThat(status, is(0));
  }

  private void writeKeyValue(String key, String value) throws IOException {
    writer.writeInt(key.length());
    writeKey(value, key.getBytes());
    writer.write(value.getBytes());
  }

  private void writeHeader(int operationCode) throws IOException {
    writer.write(OPERATION_PREFIX);
    writer.write(operationCode);
  }
}
