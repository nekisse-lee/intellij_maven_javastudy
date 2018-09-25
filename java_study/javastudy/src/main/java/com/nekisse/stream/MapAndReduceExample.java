package com.nekisse.stream;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("김범수", 10),
                new Student("나얼", 20),
                new Student("박효신", 30)
        );
        double avg = studentList.stream()
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();

        System.out.println("평균점수" + args);


    }
}
