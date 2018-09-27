package com.nekisse;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(5000);
        Socket socket = serverSocket.accept();

        ReceiveThread receiveThread = new ReceiveThread();
        receiveThread.setSocket(socket);

        receiveThread.start();
    }
}
