package com.nekisse.java.ch09;

public class Tv extends Machine {
    int volume;


/*
    @Override
    public boolean powerOn() {
//        System.out.println("티비 전원 켬");
        return true;
    }

*/
    @Override
    public boolean powerOff() {
        System.out.println("티비 전원 끔");

        return false;
    }

    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        volume--;
    }
}
