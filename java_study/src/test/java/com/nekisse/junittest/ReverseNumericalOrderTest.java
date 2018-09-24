package com.nekisse.junittest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ReverseNumericalOrderTest {

    @Test
    public void customSorting() {
        List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
        List<Integer> excepted = Arrays.asList(7, 6, 5, 4, 4, 3, 1);
        Collections.sort(numbers, new ReverseNumericalOrder());
        assertEquals(excepted,numbers);
    }
}