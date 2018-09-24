package com.nekisse;

public class MathTest {
    public static void main(String[] args) {

//        Math math = new Math();

        double rand = Math.random();
        System.out.println("rand = " + rand);
        rand = rand * 6;
        System.out.println("rand = " + rand);

        int irand = (int) rand;
        System.out.println("irand = " + irand);
        int dice = irand + 1;
        System.out.println("dice = " + dice);



        for (int i = 0; i < 10; i++) {
            int dice2 = (int) (Math.random() * 6 + 1);
            System.out.println("dice2 = " + dice2);
        }
    }
}
