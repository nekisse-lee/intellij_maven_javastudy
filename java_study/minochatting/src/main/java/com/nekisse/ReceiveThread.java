package com.nekisse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread extends Thread {

    private Socket socket;


    @Override
    public void run() {
        super.run();

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String receviveStr;

            while (true) {
                receviveStr = bufferedReader.readLine();
                if (receviveStr == null) {
                    System.out.println("연결끊김");
                    break;

                } else {
                    System.out.println(receviveStr);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setSocket(Socket socket) {
        this.socket = socket;

    }
}
