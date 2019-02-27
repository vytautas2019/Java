import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {


    @Test
    public void testBowlingGame_firstThrow4_resultIs4() {
        BowlingGame bowlingGame = BowlingGame.startGame();

        bowlingGame.throwBall(4);

        assertEquals(4, bowlingGame.currentScore());
    }

    @Test
    public void testBowlingGame_firstThrow10_movedToNextFrame(){
        BowlingGame bowlingGame = BowlingGame.startGame();
        bowlingGame.throwBall(10);

        assertEquals(2, bowlingGame.currentFrame());
    }

    @Test
    public void testBowlingGame_twoThrows_movedToNextFrameAfterSecondThrow(){
        BowlingGame bowlingGame = BowlingGame.startGame();

        bowlingGame.throwBall(3);


        bowlingGame.throwBall(4);
       assertEquals(2, bowlingGame.currentFrame());
    }

    @Test

    public void testBowlingGame_firstThrow10_ResultsAfterAreDuplicated(){
        BowlingGame bowlingGame = BowlingGame.startGame();
        bowlingGame.throwBall(10);
        bowlingGame.throwBall(3);
        bowlingGame.throwBall(3);

        assertEquals(3, bowlingGame.currentFrame());
        assertEquals(16, bowlingGame.currentScore());
    }
}