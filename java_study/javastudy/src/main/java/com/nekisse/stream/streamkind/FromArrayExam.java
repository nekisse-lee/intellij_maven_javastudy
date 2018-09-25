package com.nekisse.stream.streamkind;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExam {
    public static void main(String[] args) {
        String[] strArryay = {"김범수", "나얼", "박효신"};

        Stream<String> stream = Arrays.stream(strArryay);

        stream.forEach(s -> System.out.println(s + ","));

        System.out.println();

        int[] intArray = {1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intArray);

        intStream.forEach(value -> System.out.println(value + ","));
    }
}
