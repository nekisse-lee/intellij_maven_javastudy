package Movie;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MovieTest {

  private Movie movie;

  @Before
  public void setUp() throws Exception {
    movie = new Movie();
    movie = new Movie();
  }

  @Test
  public void should_return_0_when_just_created() {
    assertThat(movie.averageRating(), is(0));
  }


  @Test
  public void should_return_1_when_1_was_rated() {
    movie.rate(1);
    assertThat(movie.averageRating(), is(1));
  }

  @Test
  public void should_return_4_when_3_and_5_were_rated() {
    movie.rate(3);
    movie.rate(5);
    assertThat(movie.averageRating(), is(4));
  }



}