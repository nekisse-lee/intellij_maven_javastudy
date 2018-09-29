package com.nekisse.java.ch05;

public class Ex05_19 {
    public static void main(String[] args) {
        char in = 'a';
        do {
            System.out.println(in);
            in = (char) (in + 1);
        } while (in != 'k');
        System.out.println("종료");

    }
}
