package com.nekisse.chat.server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerGui extends JFrame implements ActionListener {
    private JTextArea jta= new JTextArea(40,25);
    private JTextField jtf = new JTextField(25);
    private ServerBackground server = new ServerBackground();

    public ServerGui() {
        add(jta, BorderLayout.CENTER);
        add(jtf, BorderLayout.SOUTH);
        jtf.addActionListener(this);


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(200,100,400,600);
        setTitle("서버부분");
//        server.setGui(this);
        server.setting();

    }

    public static void main(String[] args) {
        new ServerGui();
    }

    public void actionPerformed(ActionEvent e) {
        String msg = jtf.getText() + "\n";
        jta.append(msg);
        System.out.println(msg);

        jtf.setText("");
    }

    public void appendMsg(String msg) {
        jta.append(msg);
        System.out.println("날라온 메세지 " + msg);
    }
}

