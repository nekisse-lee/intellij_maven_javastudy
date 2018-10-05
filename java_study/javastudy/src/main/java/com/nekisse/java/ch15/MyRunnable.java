package com.nekisse.java.ch15;

public class MyRunnable implements Runnable {
    private int sum = 0;
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {

            sum += i;
            System.out.println(Thread.currentThread().getName() + " : " +  sum);
        }
    }
}
