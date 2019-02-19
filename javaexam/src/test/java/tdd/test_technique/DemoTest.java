package tdd.test_technique;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DemoTest {
    @Test
    public void factors() {
        assertThat(factorsOf(1), is(intList()));
        assertThat(factorsOf(2), is(intList(2)));
        assertThat(factorsOf(3), is(intList(3)));
        assertThat(factorsOf(4), is(intList(2, 2)));
        assertThat(factorsOf(5), is(intList(5)));
        assertThat(factorsOf(6), is(intList(2, 3)));
        assertThat(factorsOf(7), is(intList(7)));
        assertThat(factorsOf(8), is(intList(2, 2, 2)));
        assertThat(factorsOf(9), is(intList(3, 3)));

    }

    private List<Integer> intList(Integer... i) {
        return Arrays.asList(i);
    }

    private List<Integer> factorsOf(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int divisor = 2; n > 1; divisor++)
            for (; n % divisor == 0; n /= divisor)
                factors.add(divisor);
        if (n > 1)
            factors.add(n);
        return factors;
    }
}
