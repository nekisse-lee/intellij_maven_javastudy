package com.javaexam;

import java.util.Hashtable;

public class practice {


  private static void addSum() {
    int sum = 0;
    for (int i = 0; i <= 10; i++) {
      sum = sum + i;
      System.out.println("sum = " + sum);
    }
    System.out.println("sum = " + sum);
  }


  public static void main(String[] args) {
    System.out.println("hello world");
    addSum();
  }

}
