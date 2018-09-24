package com.nekisse.java_data_structure.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("numbers[1] = " + numbers.get(1));
        System.out.println("numbers = " + numbers);

        numbers.remove(3);

        System.out.println("numbers = " + numbers);

        System.out.println("numbers.size() = " + numbers.size());

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value==30) {
                iterator.remove();
            }
        }
        for (Integer number : numbers) {
            System.out.println("number = " + number);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("numbers.get(i) = " + numbers.get(i));
        }

        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(0, 1);
        System.out.println("integerList.get(1) = " + integerList.get(0));


        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        for (Integer integer : arrayList) {
            System.out.println("integer = " + integer);
        }
    }
}
