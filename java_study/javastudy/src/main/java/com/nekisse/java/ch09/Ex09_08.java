package com.nekisse.java.ch09;

public class Ex09_08 {
    public static void main(String[] args) {
        GeneralChick chick=new GeneralChick();
        chick.display();
        chick.walk();
        chick.ppick();
        return;
    }
}
class GeneralChick {
    int x;
    int y;

    void display() {System.out.println("병아리:"+x+","+y);}
    void walk() {System.out.println("걷다");}
    void ppick() {System.out.println("삑삑");}
}

