package com.nekisse.java.ch13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Ex13_30 {
    public void printShow() {
        
    }
    
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.nekisse.java.ch13.Ex13_30");

            System.out.println("========Superclass 얻어내기========");
            Class<?> cla = c.getSuperclass();
            System.out.println("cla.toString() = " + cla.toString());

            Method[] methods1 = c.getMethods();
            for (Method method : methods1) {
                System.out.println("메소드");
                System.out.println(method.toString());
            }


            System.out.println("==Constructor [] 얻어내기");
            Constructor<?>[] cotr = c.getConstructors();
            for (int i = 0; i < cotr.length; i++) {
                System.out.println(cotr[i].toString());
                System.out.println(cotr[i].getName());

            }
            Method[] methods = cla.getMethods();
            for (Method method : methods) {
                System.out.println(method.toString());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    

    }
}
