package com.nekisse.java.ch15;

public class Ex15_02 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
