package com.nekisse.java.ch15.ex15_07;

public class Ex15_07 {
    public static void main(String[] args) {

        MyAccount acc = new MyAccount("홍길동", 10000);

        User u1 = new User("회사", acc);
        User u2 = new User("가족", acc);
        User u3 = new User("친구", acc);

        u1.start();
        u2.start();
        u3.start();
    }
}
