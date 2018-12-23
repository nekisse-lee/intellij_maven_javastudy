package main;

import chap007.ExeTimeCalculator;
import chap007.ImpeCalculator;
import chap007.RecCalculator;

public class MainProxy {
    public static void main(String[] args) {

        ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpeCalculator());
        System.out.println(ttCal1.factorial(20));

        ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new RecCalculator());
        System.out.println(ttCal2.factorial(15));

    }
}
