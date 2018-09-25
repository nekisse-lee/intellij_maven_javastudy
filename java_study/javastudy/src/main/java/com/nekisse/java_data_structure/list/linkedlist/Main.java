package com.nekisse.java_data_structure.list.linkedlist;

public class Main {
    public static void main(String[] args) {

        LinkedList numbers = new LinkedList();
//        System.out.println(numbers.removeLast());
//        System.out.println("numbers = " + numbers);
        //        System.out.println(numbers.size());
//        System.out.println("numbers.get(x) = " + numbers.get(2));
//        System.out.println(numbers.indexOf(5));
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.hasNext());
//        System.out.println(i.next());
//        System.out.println(i.hasNext());
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);


        LinkedList.ListIterator i = numbers.listIterator();

        while (i.hasNext()) {
            if ((Integer) i.next() == 20) {
                i.remove();
            }
        }
        System.out.println(numbers);
    }

//        i.add(5);
//        i.next();
//        i.add(15);
//        System.out.println(numbers);
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }


}
