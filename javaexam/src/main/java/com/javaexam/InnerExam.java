package com.javaexam;

public class InnerExam {
  private static int x = 1;

  class Inner {
    int getX() {
      return x;
    }

  }

  public static void main(String[] args) {
    System.out.println("x = " + x);
    InnerExam e = new InnerExam(); //외부클래스인스턴스
    InnerExam.Inner in = e.new Inner();
    System.out.println(in.getX());

  }


}
