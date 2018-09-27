package com.nekisse;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainThreadd {
    private Socket socket;

    private ServerSocket serverSocket;

    private DataInputStream inputStream;
    private DataOutputStream outputStream;

    public void serverSetting() {


        try {

            serverSocket = new ServerSocket(5000);
            System.out.println("서버대기중");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
