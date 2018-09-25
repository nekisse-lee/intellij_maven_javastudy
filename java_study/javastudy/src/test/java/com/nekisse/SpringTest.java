package src.test.java.com.nekisse;

import  static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

@RunWith(JUnit4.class)
public class SpringTest {


    @Test
    public void sortInts() {
        //given
        final int[] numbers = {-3, -5, 1, 7, 4, -2};
        final int[] expected = {-5, -3, -2, 1, 4, 7};
        //when
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);

        //then

    }

    @Test
    public void sortObjects() {
        final String[] strings = {"z", "x","y", "abc", "zzz", "zazzy"};
        final String[] expected = {"abc", "x", "y", "z", "zazzy", "zzz"};
        Arrays.sort(strings);
        assertArrayEquals(expected,strings);
    }
}