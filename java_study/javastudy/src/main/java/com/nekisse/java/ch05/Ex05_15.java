package com.nekisse.java.ch05;

public class Ex05_15 {
    public static void main(String[] args) {

        int evenTotal = 0;
        int oddTotal = 0;

        int i = 0, j = 0;

        for (i = 0, j = 9; (i < 9 && j > 0); i = i + 2, j = j - 2) {
            evenTotal += i;
            oddTotal += j;
        }
        System.out.println("evenTotal = " + evenTotal);
        System.out.println("oddTotal = " + oddTotal);
    }
}
