package com.nekisse.java.ch06;

public class Ex06_05 {
    public static void main(String[] args) {

        int[] arr = {70, 24, 51, 72, 93, 48, 55, 65, 78};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                count += 1;
            }
        }
        System.out.println("count = " + count);
    }
}
