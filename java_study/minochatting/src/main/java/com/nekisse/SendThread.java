package com.nekisse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread {

    Socket socket;

    @Override
    public void run() {
        super.run();

        try {
            PrintWriter sendWriter = new PrintWriter(socket.getOutputStream());
            String sendStr;

            while (true) {

//                sendWriter.
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
