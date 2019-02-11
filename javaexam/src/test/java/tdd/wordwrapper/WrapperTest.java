package tdd.wordwrapper;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WrapperTest {
  @Test
  public void should_wrap() {
//    assertThat(wrap("word word", 4), is("word\nword"));
//    assertThat(wrap("a dog", 5), is("a dog"));
//    assertThat(wrap("a dog with a bone",6),is("a dog\nwith a\nbone")); 실패

    assertWraps(null, 1, "");
    assertWraps("", 1, "");
    assertWraps("x", 1, "x");
    assertWraps("xx", 1, "x\nx");
    assertWraps("xxx", 1, "x\nx\nx");
    assertWraps("x x", 1, "x\nx");
    assertWraps("x xx", 3, "x\nxx");
    assertWraps("four score and seven years ago our fathers brought forth upon this continent", 7, "four\nscore\nand\nseven\nyears\nago our\nfathers\nbrought\nforth\nupon\nthis\ncontine\nnt");
  }

  private void assertWraps(String s, int width, String expected) {
    assertThat(wrap(s, width), is(expected));
  }

  private String wrap(String s, int width) {
    if (s == null)
      return "";
    if (s.length() <= width)
      return s;
    else {
      int brakePoint = s.lastIndexOf(" ", width);
      if (brakePoint == -1)
        brakePoint = width;

      return s.substring(0, brakePoint) + "\n" + wrap(s.substring(brakePoint).trim(), width);
    }
  }
}
