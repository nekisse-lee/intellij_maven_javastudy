package tdd.primefactors2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeFactorTest2 {
    @Test
    public void prime_factors() {
        assertFactors(1, Arrays.asList());
        assertFactors(2, Arrays.asList(2));
        assertFactors(3, Arrays.asList(3));
        assertFactors(4, Arrays.asList(2, 2));
        assertFactors(5, Arrays.asList(5));
        assertFactors(6, Arrays.asList(2, 3));
        assertFactors(7, Arrays.asList(7));
        assertFactors(8, Arrays.asList(2, 2, 2));
        assertFactors(9, Arrays.asList(3, 3));
    }

    private void assertFactors(int n, List<Integer> value) {
        assertThat(factors(n), is(value));
    }

    private List<Integer> factors(int n) {
        List<Integer> factors = new ArrayList<>();

        for (int divisor = 2; n > 1; divisor++)
            for (; n % divisor == 0; n /= divisor)
                factors.add(divisor);

        if (n > 1)
            factors.add(n);

        return factors;
    }

}
