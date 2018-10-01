package com.nekisse.java.ch09;

class InitBlockTest {
    static {
        System.out.println("클래스초기화");
    }

    {
        System.out.println("인턴스 초기화 ");
    }

    public InitBlockTest() {
        System.out.println("생서자초기화");
    }
}

public class Ex09_16 {
    public static void main(String[] args) {
        InitBlockTest obj1 = new InitBlockTest();
        System.out.println("===============");
        InitBlockTest obj2 = new InitBlockTest();

    }


}
