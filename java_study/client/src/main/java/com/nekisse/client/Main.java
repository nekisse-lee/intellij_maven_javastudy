package com.nekisse.client;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2018. 9. 26..
 */
public class Main {

    private static final String SERVER_IP = "192.168.35.90";
    private static final int PORT = 5000;

    public static void main(String[] args) {
        Client client = new Client();
        client.connectToServer(SERVER_IP, PORT);
    }

}
