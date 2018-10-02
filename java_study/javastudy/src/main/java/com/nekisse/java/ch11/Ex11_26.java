package com.nekisse.java.ch11;

abstract class AnonymousInner {
    int x;
    int y;

    public AnonymousInner(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void display(String str);
};

class Outer {
    public void outDisplay(AnonymousInner obj) {
        obj.display("Outer.display");
    }
};

public class Ex11_26 {
    public static void main(String[] args) {
        Outer outObj = new Outer();
        outObj.outDisplay(new AnonymousInner(10, 20) {
            /*public AnonymousInner(){
                // 생성자는 선언할 수 없다.
            }*/
            @Override
            public void display(String str) {
                System.out.println("AnonymousInner:display(" + str + ")=" + x + "," + y);
            }

        });

        outObj.outDisplay(new AnonymousInner(20,30) {
            @Override
            public void display(String str) {
                str = "ss";
                System.out.println("str = " + str + (x + y));
            }
        });
    }
};
