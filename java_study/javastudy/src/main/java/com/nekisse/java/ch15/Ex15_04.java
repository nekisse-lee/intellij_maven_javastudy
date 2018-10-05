package com.nekisse.java.ch15;

class TPri extends Thread {
    private String message;

    public TPri(String str, int prio) {
        message = str;
        setPriority(prio);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(message + "(" + getPriority() + ")");
        }
    }
}


public class Ex15_04 {
    public static void main(String[] args) {
        TPri tr1 = new TPri("first", Thread.MAX_PRIORITY);
        TPri tr2 = new TPri("second", Thread.NORM_PRIORITY);
        TPri tr3 = new TPri("second", Thread.MIN_PRIORITY);

        tr1.start();
        tr2.start();
        tr3.start();

    }
}
