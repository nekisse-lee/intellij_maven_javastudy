package com.nekisse.java.ch15.ex15_07;

public class User extends Thread {
    private String userName;
    private MyAccount account;

    public User(String userName, MyAccount account) {
        this.userName = userName;
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int m = (((int) (Math.random() * 3) * 100) + 200);

            if (i % 2 == 0) {
                account.withdraw(m, userName);
            } else {
                account.deposit(m, userName);
            }
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
