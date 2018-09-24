package com.nekisse.java_data_structure.list.doublylinkedlist;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList numbers = new DoublyLinkedList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);


        DoublyLinkedList.ListIterator i = numbers.listIterator();

        while (i.hasNext()) {
            if ((Integer) i.next() == 20) {
                i.remove();
            }
        }
        System.out.println(numbers);
    }



}
