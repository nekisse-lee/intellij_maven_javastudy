package com.nekisse.java.ch06;

public class Ex06_06 {
    public static void main(String[] args) {
        int[] arr={70,24,51,72,93,48,55,65,78,93};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
    }
}
