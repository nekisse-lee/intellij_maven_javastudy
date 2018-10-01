package com.nekisse.java.ch09;

public class MachineMain {
    public static void main(String[] args) {

        Machine machine = new Machine();
        machine.powerOn();

        Machine tv = new Tv();
        tv.powerOn();
        ((Tv) tv).volumeDown();
        System.out.println("((Tv) tv).volume = " + ((Tv) tv).volume);

        Tv tv1 = new Tv();
        tv1.powerOn();

        Machine radio = new Radio();
        radio.powerOn();




    }
}

