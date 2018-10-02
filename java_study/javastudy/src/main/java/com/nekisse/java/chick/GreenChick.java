package com.nekisse.java.chick;

import java.awt.*;

public class GreenChick extends Chick implements Ppickable {

    @Override
    public void ppick(Graphics g) {
        g.setColor(Color.GREEN);
        g.drawString("삑리릭", x - 12, y - 2);
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.GREEN);
        g.drawString("초록병아리", x, y - 2);
        g.fillOval(x,y,CHICK_SIZE,CHICK_SIZE);
    }
}
