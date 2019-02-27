import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

    private int currentFrame;
    private  int trowNumber;
    private int currentScore;
    private int[] scores;
    private BowlingGame() {
        currentFrame=0;
        currentScore=0;
        trowNumber=0;
        scores=new int[21];
    }






    public static BowlingGame startGame() {
        return new BowlingGame();
    }

    public void throwBall(int score) {
        scores[trowNumber]=score;
        if (score==10){
            currentFrame++;
            trowNumber+=2;
        }else {
            if (trowNumber%2==0){
                currentFrame++;
            }
            trowNumber++;
        }
        this.currentScore+=score;

    }

    public int currentScore() {
        return currentScore;
    }

    public int currentFrame() {
        return currentFrame + 1;
    }

    public void printResults() {

    }



}