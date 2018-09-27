package com.nekisse;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        super();
        this.socket = socket;
    }


    @Override
    public void run() {
        System.out.println(socket.getInetAddress() + "에서 접속했습니다.");

        BufferedReader bf;
        try {
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = bf.readLine();
            System.out.println("클라이언트로부터의 메시지 : " + msg);
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
