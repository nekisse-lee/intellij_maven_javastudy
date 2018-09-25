package com.nekisse.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("김범수", "나얼", "박효신");

        //Iterator 이용
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("name = " + name);
        }

        //Stream 이용
        Stream<String> stream = list.stream();
        stream.forEach(name-> System.out.println(name));

    }





}
