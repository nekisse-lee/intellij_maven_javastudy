package com.nekisse.java.chick;

import java.awt.Graphics;
import java.util.Random;

public class ChickManager {

    private static ChickManager instance = new ChickManager();

    //추상 클래스를 레퍼런스 변수로 선언
    Chick[] arr = new Chick[20];

    private ChickManager() {
        makeChiks();
    }

    public static ChickManager getInstance() {
        return instance;
    }

    private void makeChiks() {
        if (arr != null) {
            int type;
            for (int i = 0; i < arr.length; i++) {
                Random rnd = new Random();
                type = rnd.nextInt(4);
                switch (type) {
                    case 0:
                        arr[i] = new GeneralChick();
                        break;
                    case 1:
                        arr[i] = new RedChick();
                        break;
                    case 2:
                        arr[i] = new GreenChick();
                        break;
                    case 3:
                        arr[i] = new BlueChick();
                        break;
                }
            }
        }
    }


    public void displayAllChicks(Graphics g) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].display(g);
        }
    }


    public void displayPpick(Graphics g) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Ppickable) {
                ((Ppickable)arr[i]).ppick(g);
            }
        }
    }

    public void displayFly(Graphics g) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Flyable) {
                ((Flyable) arr[i]).fly(g);
            }
        }
    }
};
