package com.nekisse.stream.streamkind;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class FromIntRangeExam {
        public static int sum;
    public static void main(String[] args) {

        IntStream stream = IntStream.rangeClosed(1, 100);

        stream.forEach(value -> sum += value);
        System.out.println(sum);


    }
}
