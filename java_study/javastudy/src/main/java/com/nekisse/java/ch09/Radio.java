package com.nekisse.java.ch09;

public class Radio extends Machine {
    @Override
    public boolean powerOn() {
        System.out.println("라디오 켬");
        return true;
    }

    @Override
    public boolean powerOff() {
        System.out.println("라디오 켬");
        return false;
    }
}
