package com.ludwigstralewiren.model;

public enum Player  {
    PLAYERONE(0, "X",""),
    PLAYERTWO(0, "O","");


    private int score;
    private String marker;
    private String name;


    Player(int score, String marker, String name) {
        this.score = score;
        this.marker = marker;
        this.name = name;

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMarker() {
        return marker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
