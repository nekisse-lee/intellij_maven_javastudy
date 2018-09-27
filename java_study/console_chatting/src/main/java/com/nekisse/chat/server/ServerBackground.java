package com.nekisse.chat.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerBackground extends Thread {

    // 메세지를 주고 받아야함
    // 하기전에
    private ServerSocket serverSocket;
    private Socket socket;
    //    private DataInputStream in;
    private BufferedReader bf;
    private DataInputStream inputStream;
    private DataOutputStream out;
//    private ServerGui gui;


//    public final void setGui(ServerGui gui) {
//        this.gui = gui;
//    }

    public void setting() {
        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("서버 대기중...");
            socket = serverSocket.accept();

            System.out.println(socket.getInetAddress() + "에서 접속했습니다.");

            out = new DataOutputStream(socket.getOutputStream());
            bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            inputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                String msg = bf.readLine();
                System.out.println("클라이언트로부터의 메시지 : " + msg);
//            String inputmsg = inputStream.readUTF();
//            System.out.println("inputmsg = " + inputmsg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ServerBackground serverBackground = new ServerBackground();
        serverBackground.setting();

    }

}