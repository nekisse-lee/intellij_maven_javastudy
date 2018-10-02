package com.nekisse.java.chick;

import java.awt.*;

public class BlueChick extends Chick {

    @Override
    public void display(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("파란병아리", x, y - 2);
        g.fillOval(x,y,CHICK_SIZE,CHICK_SIZE);
    }
}
