package tdd.test_technique.mystacktest;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MyStackTest {

    @Test
    public void pop_should_return_pushed_value() {
        MyStack stack = new MyStack();
        stack.push(1);
        assertThat(stack.app(), is(1));
        stack.push(2);
        assertThat(stack.app(), is(2));

    }
}
