package com.nekisse.java.ch06;

public class Ex06_02 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (i+1)*10;
                System.out.println("arr[" + i +"] = " + arr[i]);
            }
        }
    }
}
