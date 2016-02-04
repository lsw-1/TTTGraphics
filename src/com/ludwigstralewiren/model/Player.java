package com.ludwigstralewiren.model;

public enum Player  {
    PLAYERONE("X",""),
    PLAYERTWO("O","");


    private String marker;
    private String name;


    Player(String marker, String name) {
//        this.score = score;
        this.marker = marker;
        this.name = name;

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
