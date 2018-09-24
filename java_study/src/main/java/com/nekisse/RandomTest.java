package com.nekisse;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {

        Random r = new Random();


        for (int j = 0; j < 10; j++) {
            int i = r.nextInt(6) + 1;
            System.out.println("i = " + i);
        }
    }
}
