package com.nekisse.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample {
    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student("김범수", 90),
        new Student("나얼", 90)
        );

        Stream<Student> stream = list.stream();

        stream.forEach(s ->{
            String name = s.getName();
            int score = s.getScore();
            System.out.println( name + "-" + score);

        });
    }
}
