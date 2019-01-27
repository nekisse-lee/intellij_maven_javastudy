package com.javaexam;

public class StringExam {

  public static void main(String[] args) {

    String str = "hello" + "world";
    System.out.println("str = " + str);

    System.out.println(str.replace("hello", "HELLO"));
    System.out.println("str = " + str);


    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("hello");
    stringBuilder.append("world");
    System.out.println("stringBuilder = " + stringBuilder);
    System.out.println
        ("stringBuilder = " + stringBuilder.replace(0,5,"HELLO"));
    System.out.println("stringBuilder = " + stringBuilder);

  }



}
