package com.nekisse.java.ch15;

public class MyThread extends Thread {
            private int sum = 0;
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            sum +=  i;
            System.out.println(getName()+ " : " +sum);


        }
    }
}
