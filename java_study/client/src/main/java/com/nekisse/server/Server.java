package com.nekisse.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2018. 9. 26..
 */
public class Server {

    List<Socket> clientSockets = new ArrayList<>();

    public void start() {
        while (true) {
            try {
                ServerSocket serverSocket = new ServerSocket(5000);
                Socket clientSocket = serverSocket.accept();

                clientSockets.add(clientSocket);
                Thread receivedThread = new Thread(new Received(clientSocket, clientSockets));
                receivedThread.start();
            } catch (Exception e) { }
        }
    }
}
