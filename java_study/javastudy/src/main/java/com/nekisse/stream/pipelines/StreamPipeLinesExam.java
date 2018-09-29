package com.nekisse.stream.pipelines;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLinesExam {
    public static void main(String[] args) {

        List<Member> list = Arrays.asList(
                new Member("김범수", Member.MALE, 30),
                new Member("나얼", Member.FEMALE, 20),
                new Member("박효신", Member.MALE, 45),
                new Member("이수", Member.FEMALE, 27)

        );

        double ageAvg = list.stream()
                .filter(member -> member.getSex() == Member.MALE)
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();

        System.out.println("남자 평균 나이 = " + ageAvg);

    }
}
