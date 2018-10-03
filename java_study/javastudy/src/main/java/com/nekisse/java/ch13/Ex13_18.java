package com.nekisse.java.ch13;

public class Ex13_18 {
    public static void main(String[] args) {
        String str =new String("Hello");
        String str2 = new String(" World~!! ");
        String str3 =new String("Hello");

        System.out.println("str="+str);
        System.out.println("str.concat(str2)="+str.concat(str2));
        System.out.println("str2.trim().toUpperCase()="+str2.trim().toUpperCase());
    }
};


