package com.nekisse.java.ch14;

import java.util.Stack;

public class Ex14_04 {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("A");
        System.out.println("st.push(\"A\"):" + st);
        System.out.println(st);

        st.push("B");
        System.out.println(st);
        st.push("C");
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
    }
}
