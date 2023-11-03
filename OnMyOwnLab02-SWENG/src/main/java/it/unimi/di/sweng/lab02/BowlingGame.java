package it.unimi.di.sweng.lab02;

public class BowlingGame implements Bowling{
    private int score;
    @Override
    public void roll(int pins) {
        score+=pins;
    }

    @Override
    public int score() {
        return score;
    }


}
