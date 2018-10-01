package com.nekisse.java.ch09;

public class Machine {
    boolean power;
    public boolean powerOn() {
        System.out.println("전원켬");
        return power = true;
    }

    public boolean powerOff() {
        System.out.println("전원끔");
        return power = false;
    }



}
