package com.nekisse.java.ch08;

public class A{
    int num;
    public static void main(String[] args){
        A aObj=new A();
        aObj.num=100;
        System.out.println("aObj.num="+aObj.num);
        int b=200;
        A cObj=aObj;
        cObj.num=300;
        System.out.print("cObj.num="+cObj.num);
        System.out.println(",aObj.num="+aObj.num);
    }
};
