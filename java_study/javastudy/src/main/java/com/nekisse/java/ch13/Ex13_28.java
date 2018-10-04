package com.nekisse.java.ch13;

import java.lang.reflect.Field;

public class Ex13_28 {
    public static void main(String[] args) {
        Integer iObj = new Integer(10);
        Integer iObj2 = new Integer(10);

        System.out.println("iObj.toString() = " + iObj.toString());
        System.out.println("iObj2.toString() = " + iObj2.toString());

        System.out.println("iObj.hashCode() = " + iObj.hashCode());
        System.out.println("iObj2.hashCode() = " + iObj2.hashCode());

        System.out.println("(iObj==iObj2) = " + (iObj==iObj2));

        System.out.println("iObj.equals(iObj2) = " + iObj.equals(iObj2));


        String str = new String("안녕하세요");
        Class<? extends String> aClass = str.getClass();

        System.out.println(aClass.getName());

    }

}
