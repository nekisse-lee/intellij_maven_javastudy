package com.nekisse.stream.parallelExam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExam {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("김범수", "나얼", "박효신", "이수", "박정현");

        //순차처리
        Stream<String> stream = list.stream();
        stream.forEach(name -> print(name));

        System.out.println();

        Stream<String> parallelStream= list.parallelStream();
        parallelStream.forEach(ParallelExam::print);
    }

    private static void print(String str) {
        System.out.println(str + ":" + Thread.currentThread().getName());
    }
}
