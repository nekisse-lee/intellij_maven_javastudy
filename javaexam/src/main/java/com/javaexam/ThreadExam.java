package com.javaexam;

class T1 extends Thread {
  @Override
  public void run() {
    System.out.println("Thread 1");
  }
}

class T2 implements Runnable {
  @Override
  public void run() {
    System.out.println("Thread 2");
  }
}

public class ThreadExam  {
  public static void main(String[] args) {
    T1 t1 = new T1();
    t1.start();
    t1.run();

    Thread t2 = new Thread(new T2());
    t2.start();

  }
}
