package com.nekisse.java.ch06;

public class Ex06_10 {
    public static void main(String[] args) {
        int[][] arr = {
                {78, 88, 90},        //1번 학생의 국어,영어,수학 점수
                {55, 73, 68},        //2번 학생의 국어,영어,수학 점수
                {69, 80, 90}        //3번 학생의 국어,영어,수학 점수
        };

        String[] names = {"홍길동", "김길동", "이길동"};
        int[] totals = new int[arr.length];    // 학생별 총계를 저장할 배열

        System.out.println("\t\t 성적표");
        System.out.println("=====================================");
        System.out.println("이름\t국어\t영어\t수학\t총점");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(names[i]);
            for (int j = 0; j < arr.length; j++) {
                int score = arr[i][j];
                totals[i] += score;
                System.out.print("\t"+score);
            }
            System.out.print("\t" + totals[i]);
            System.out.println();
        }

    }
};

