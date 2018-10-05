package com.nekisse.java.ch15.ex15_07;

public class MyAccount {

    private String owner;

    private int money;

    public MyAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    public synchronized void  deposit(int amount, String user) {
        if (amount > 0) {
            money += amount;
            System.out.println(user + "입금 : " + amount);
        } else {
            System.out.println("입금액이 올바르지 않습니다.");
        }
        System.out.println(user + "님이 요청한 계좌의 잔액 : " + money);
    }


    public synchronized void withdraw(int amount, String user) {
        if (money - amount > 0) {
            money -= amount;
            System.out.println(user + "출금 : " + amount);
        } else {
            System.out.println("금액이 부족합니다.");
        }
        System.out.println(user + "님이 요청한 계좌의 잔액 : " + money);

    }
}
