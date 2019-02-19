package tdd.test_technique.bowlinggametest;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void canCreateGame() {
        Game game = new Game();
    }

    @Test
    public void canRoll() {
        Game game = new Game();
        game.roll();
    }
}
