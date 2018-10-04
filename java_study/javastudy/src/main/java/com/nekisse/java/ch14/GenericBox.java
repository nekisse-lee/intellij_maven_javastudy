package com.nekisse.java.ch14;

import java.util.HashMap;

public class GenericBox<T> {
    private T data = null;

    public static<T,V> HashMap newInstance() {
        return new HashMap<>();
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setData("Hello");
        String data = stringGenericBox.getData();
        System.out.println("data = " + data);

        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.setData(1);
        System.out.println(integerGenericBox.getData());

        HashMap<String, Integer>  hashMap= GenericBox.newInstance();
        hashMap.put("바보", 123);
        System.out.println(hashMap.get("바보"));


    }

}
