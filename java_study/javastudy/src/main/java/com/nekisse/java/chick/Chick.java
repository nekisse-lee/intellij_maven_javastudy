package com.nekisse.java.chick;

import java.awt.Graphics;
import java.util.Random;


public abstract class Chick {

    protected int x;
    protected int y;

    public static final int CHICK_SIZE = 50;

    public Chick() {
        Random rnd = new Random();
        x = rnd.nextInt(MyFrame.FRAME_WIDTH - 100) + 50;
        y = rnd.nextInt(MyFrame.FRAME_HEIGHT - 140) + 70;
    }

    //Method's Overloading
    public Chick(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void walk() {
        ;
    }
    public abstract void display(Graphics g);

};
