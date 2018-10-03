package com.nekisse.java.ch13;

public class Ex13_19 {
    public static void main(String[] args) {
        //기본형을 문자열로 변환
        double value=10.8;
        String valuetoString=value+"";

        System.out.println(""+valuetoString);

        double value2=10.8;
        String valuetoString2=String.valueOf(value2);

        System.out.println(valuetoString2);

    }
}