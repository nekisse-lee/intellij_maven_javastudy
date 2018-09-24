package com.nekisse.junittest;

import java.util.Comparator;

public class ReverseNumericalOrder implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

