package com.nekisse.stream.streamkind;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExam {
    public static void main(String[] args) {

        List<Student> student = Arrays.asList(
                new Student("김범수",10),
                new Student("나얼",20),
                new Student("박효신",30)
        );


        Stream<Student> stream = student.stream();
        stream.forEach(s -> System.out.println(s.getName()));

    }
}
