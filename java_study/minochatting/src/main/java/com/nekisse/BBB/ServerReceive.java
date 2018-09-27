package com.nekisse.BBB;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerReceive extends Thread {
    Socket socket;
    DataInputStream inputStream;
    DataOutputStream outputStream;

    public ServerReceive(Socket socket) {
        this.socket = socket;

        try {
            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        String port = "";

    }
}

