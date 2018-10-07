package com.nekisse.java_data_structure.compare;


import com.nekisse.java_data_structure.list.arraylist.implementation.ArrayList;
import com.nekisse.java_data_structure.list.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.addLast(10);
        a.addLast(20);
        a.addLast(30);
        ArrayList.ListIterator ai = a.listIterator();

        while ((Integer)ai.next() == 20) {
            ai.add(25);
        }

        LinkedList l = new LinkedList();
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        LinkedList.ListIterator li = l.listIterator();

        while ((Integer)li.next() == 20) {
            li.add(25);
        }
    }

}
