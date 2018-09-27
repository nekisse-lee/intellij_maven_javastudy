package com.nekisse.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2018. 9. 26..
 */
public class Reader implements Runnable {

    private Socket serverSocket;
    private boolean isRunning = true;

    Reader(Socket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public void run() {
        try (InputStream inputStream = serverSocket.getInputStream()) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (isRunning) {
                String msg = bufferedReader.readLine();
                System.out.println(msg);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

