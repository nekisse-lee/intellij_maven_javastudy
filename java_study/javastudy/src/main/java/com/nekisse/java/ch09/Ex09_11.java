package com.nekisse.java.ch09;

public class Ex09_11 {
    static class AddNum {
        void add(int ... arr) {
            System.out.println("arr.length = " + arr.length);
        }

        int plus(int a, int b) {
            return a + b;
        }
        double plus(double a, int b) {
            return (double) (a + b);
        }
    }
    public static void main(String[] args) {
        AddNum num = new AddNum();
        num.add(10, 20, 30, 40);
        num.add(10, 20);
        num.add(10, 20,30,40,50,60,70);


        System.out.println(num.plus(2.0, 1));
        System.out.println(num.plus(2, 1));
    }
}
