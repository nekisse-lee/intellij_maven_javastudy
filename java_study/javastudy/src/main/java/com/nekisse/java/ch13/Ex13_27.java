package com.nekisse.java.ch13;

public class Ex13_27 {
    public static void main(String[] args) {


        int i = 10;
        Integer iObj = new Integer(i);

        int j = iObj;
        System.out.println("i = " + i);
        System.out.println("(int)iObj = " + (int)iObj);
        System.out.println("j = " + j);
    }
}
