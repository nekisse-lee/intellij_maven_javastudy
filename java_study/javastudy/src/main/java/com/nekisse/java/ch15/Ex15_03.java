package com.nekisse.java.ch15;

class JoinThread extends Thread {
    private String name;

    public JoinThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + ": thread is running");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Ex15_03 {
    public static void main(String[] args) throws InterruptedException {
        JoinThread a = new JoinThread("a");
        JoinThread b = new JoinThread("b");
        a.start();
        a.join();

        b.start();
        b.join();

        System.out.println("main thread end ~");
    }
}
