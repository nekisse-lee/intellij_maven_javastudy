package com.nekisse.java.ch06;

public class Ex06_04 {
    public static void main(String[] args) {

        int[] score = {82, 77, 92, 65, 88};

        double sum = 0;
        double avg = 0;

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        avg = sum / score.length;
        System.out.println("avg = " + avg);

        System.out.println("sum = " + sum);
        
    }
}
