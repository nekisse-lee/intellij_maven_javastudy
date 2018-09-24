package com.nekisse.oop.extendss;

import com.nekisse.oop.Bus;
import com.nekisse.oop.Bus2;
import com.nekisse.oop.Car;

public class Test {
    public static void main(String[] args) {

        Bus b1 = new Bus();
        b1.run();
        b1.broadcast();


        Car c2 = new Bus2();
        c2.run();


    }
}
