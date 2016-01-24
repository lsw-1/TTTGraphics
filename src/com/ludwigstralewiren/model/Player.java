package com.ludwigstralewiren.model;

/**
 * Created by Ludwig on 1/21/2016.
 */
public enum Player {
    PLAYERONE(0, 'X'),
    PLAYERTWO(0, 'O');

    private int score;
    private char marker;


    Player(int score, char marker) {
        this.score = score;
        this.marker = marker;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public char getMarker() {
        return marker;
    }

    public void setMarker(char marker) {
        this.marker = marker;
    }
}
