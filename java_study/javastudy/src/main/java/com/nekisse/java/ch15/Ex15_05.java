package com.nekisse.java.ch15;

class TPriEx extends Thread {
    private String message;

    public TPriEx(String str, int prio) {
        this.message = str;
        setPriority(prio);
    }

    @Override

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(message + "(" + getPriority() + ")");
            System.out.println(getName() + " : " +  i + "번째 출력중");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
public class Ex15_05 {
    public static void main(String[] args) {
        TPriEx tr1 = new TPriEx("first", Thread.MAX_PRIORITY);
        TPriEx tr2 = new TPriEx("second", Thread.NORM_PRIORITY);
        TPriEx tr3 = new TPriEx("third", Thread.MIN_PRIORITY);

        tr1.setName("first");
        tr2.setName("second");
        tr3.setName("third");
        tr1.start();
        tr2.start();
        tr3.start();

    }

}
