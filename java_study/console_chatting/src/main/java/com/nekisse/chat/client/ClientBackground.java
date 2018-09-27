package com.nekisse.chat.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientBackground {
    Scanner scanner = new Scanner(System.in);
    private Socket socket;

    private PrintWriter printWriter;
    private DataInputStream in;
    private DataOutputStream out;
    private ClientGui gui;

    public void setGui(ClientGui gui) {
        this.gui = gui;
    }

    public void connect() {
        try {
            socket = new Socket("127.0.0.1", 7777);
            System.out.println("서버연결됨.");
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
            printWriter = new PrintWriter(out);

            while (true) {
//                out.writeUTF(scanner.nextLine());
                 printWriter.println(scanner.nextLine());
//                out.flush();
                printWriter.flush();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ClientBackground clientBackground = new ClientBackground();
        clientBackground.connect();

    }
}
