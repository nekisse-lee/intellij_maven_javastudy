package com.nekisse.java.ch15;

public class ex15_01 {
    public static void main(String[] args) {
        Thread thread = new MyThread();

        thread.start();

        MyRunnable thread1 = new MyRunnable();
        Thread thread2 = new Thread(thread1);
        thread2.setName("TTTT");
        thread2.start();

    }
}
