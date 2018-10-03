package com.nekisse.java;

public class StringBufferTest {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("달쑥");

        System.out.println("str. = " + str.insert(2,"이"));

        System.out.println("str = " + str);
        System.out.println("str.deleteCharAt(0) = " + str.deleteCharAt(0));
//        System.out.println("str.delete(0,2) = " + str.delete(0,2));

    }
}
