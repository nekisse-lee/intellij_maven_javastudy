package com.nekisse.chat.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientGui  extends  JFrame implements ActionListener {
    private JTextArea jta = new JTextArea(40, 25);
    private JTextField jtf = new JTextField(25);

    private ClientBackground client= new ClientBackground();

    public ClientGui() {
        add(jta, BorderLayout.CENTER);
        add(jtf, BorderLayout.SOUTH);
        jtf.addActionListener(this);

        client.setGui(this);
        client.connect();


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(800, 100, 400, 600);
        setTitle("클라이언트");

    }

    public static void main(String[] args) {
        new ClientGui();
    }

    public void actionPerformed(ActionEvent e) {
        String msg = jtf.getText() + "\n";
        jta.append(msg);
        System.out.println(msg);

        jtf.setText("");
    }
}

