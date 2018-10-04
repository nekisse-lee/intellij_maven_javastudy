package com.nekisse.java.ch14;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex14_02 {
    public static void main(String[] args) {
        List list = Arrays.asList("가", "나", "다");

        System.out.println(list);


        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = (String) iterator.next();
            System.out.println(next);
        }

        System.out.println(list.hashCode());
        list.set(1, "1");
        System.out.println(list);
        System.out.println(list.hashCode());


        System.out.println();
        LinkedList list2 = new LinkedList();
        list2.add("1");
        System.out.println(list2.hashCode());
        System.out.println(list2);
        list2.remove("1");
        System.out.println(list2);
        System.out.println(list2.hashCode());
    }
}
