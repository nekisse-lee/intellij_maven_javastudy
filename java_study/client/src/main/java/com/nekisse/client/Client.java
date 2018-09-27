package com.nekisse.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2018. 9. 26..
 */
public class Client {

    public void connectToServer(String serverIP, int port) {
        Socket socket = new Socket();
        InetSocketAddress socketAddress = new InetSocketAddress(serverIP, port);
        try {
            socket.connect(socketAddress);

            Reader reader = new Reader(socket);
            Writer writer = new Writer(socket);

            Thread readerThread = new Thread(reader);
            Thread writerThread = new Thread(writer);

            readerThread.start();
            writerThread.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
