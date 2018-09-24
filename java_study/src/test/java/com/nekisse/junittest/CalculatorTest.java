package com.nekisse.junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator cal;

    @Before
    public void setUp() throws Exception {
        cal = new Calculator();
        System.out.println("setUp!");
    }


    @Test
    public void add() {
        assertEquals(3, cal.add(2, 1));
        System.out.println("add!");
    }

    @Test
    public void divide() {
        assertEquals(3, cal.divide(9, 3));
        System.out.println("divide!");
    }

    @After
    public void teardown() {
        System.out.println("teardown!");
    }
}