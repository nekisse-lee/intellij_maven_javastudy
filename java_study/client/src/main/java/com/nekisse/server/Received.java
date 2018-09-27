package com.nekisse.server;

import java.io.*;
import java.net.Socket;
import java.util.List;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2018. 9. 26..
 */
public class Received implements Runnable {

    private Socket socket;
    private List<Socket> otherSockets;

    public Received(Socket socket, List<Socket> otherSockets) {
        this.socket = socket;
        this.otherSockets = otherSockets;
    }

    @Override
    public void run() {
        System.out.println(socket.getInetAddress() + "님이 접속 하셨습니다.");
        try (InputStream inputStream = socket.getInputStream()) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String msg;
            while ((msg = bufferedReader.readLine()) != null) {
                sendToAll(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendToAll(String msg) {
        otherSockets.forEach(socket -> {
            try {
                PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                writer.println(msg);
                writer.flush();
            } catch (Exception e) { }
        });
    }

}
