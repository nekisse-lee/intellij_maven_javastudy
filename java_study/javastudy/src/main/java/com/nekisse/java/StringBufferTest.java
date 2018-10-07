package com.nekisse.java;

public class StringBufferTest {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("달쑥");

        System.out.println("str. = " + str.insert(2,"이"));

        System.out.println("str = " + str);
        System.out.println("str.deleteCharAt(0) = " + str.deleteCharAt(0));
//        System.out.println("str.delete(0,2) = " + str.delete(0,2));

        int a = 1;
        int b = 1;
        
        
        
        
        System.out.println(a == b);

        Integer e = a;
        
        Integer f = b;
        Integer g = new Integer(a);

        
        System.out.println("g == f = " +( g == f));

        System.out.println(") = " +( f.equals(g)));


        Integer z = 1;
        Integer x = 1;
        System.out.println("z == x = " + (z == x));

        String c = "이름";
        String d = "이름";
        System.out.println("c == d = " + (c == d));

    }
}
