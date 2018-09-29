package com.nekisse.java.ch05;

public class Ex05_18 {
    public static void main(String[] args) {


        int total = 0;
        int i = 1;
        do {
            total += i;
            i = i + 1;
        } while (i <= 100);
        System.out.println("total = " + total);
    }
}
