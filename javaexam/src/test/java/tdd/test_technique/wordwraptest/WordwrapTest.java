package tdd.test_technique.wordwraptest;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WordwrapTest {
    private WordWrap wordWrap;

    @Before
    public void setUp() throws Exception {
         wordWrap = new WordWrap();
    }


    @Test
    public void wrap() {
        assertWraps(null, 1, "");
        assertWraps("", 1, "");
        assertWraps("x", 1, "x");
        assertWraps("xx", 1, "x\nx");
        assertWraps("xxx", 1, "x\nx\nx");
        assertWraps("x x", 1, "x\nx");
        assertWraps("x xx", 3, "x\nxx");
    }

    private void assertWraps(String s, int width, String value) {
        assertThat(wordWrap.wrap(s, width), is(value));
    }











   /*@Test
    public void wrap() {
        assertThat(wrap("word word", 4), is("word\nword"));
        assertThat(wrap("a dog", 5), is("a dog"));
        assertThat(wrap("a dog with a bone", 6), is("a dog\nwith a\nbone"));
    }

    private String wrap(String s, int with) {
        return s.length() <= with?  s: s.replaceAll(" ", "\n");

    }*/
}
