package com.nekisse.java.ch14;

import java.util.LinkedList;
import java.util.Queue;

public class Ex14_05 {
    public static void main(String[] args) {
        Queue que = new LinkedList();

        String str1 = "1 순위";
        String str2 = "2 순위";
        String str3 = "3 순위";
        String str4 = "4 순위";

        que.offer(str1);
        que.offer(str2);
        que.offer(str3);
        que.offer(str4);

        while (que.peek() != null) {
            String val = (String) que.poll();
            System.out.println(val);

        }
    }
}
