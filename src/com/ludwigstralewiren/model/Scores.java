package com.ludwigstralewiren.model;

import com.ludwigstralewiren.controller.Controller;
import com.ludwigstralewiren.model.interfaces.Observer;

public class Scores implements Observer {


    private int playerOneScore;
    private int playerTwoScore;


    private Controller controller;

    public Scores(Controller controller) {
        this.controller = controller;
        controller.register(this);
    }

    @Override
    public void update(int playerOnescore, int playerTwoscore) {
        this.playerOneScore = playerOnescore;
        this.playerTwoScore = playerTwoscore;
        showScores();

    }

    private void showScores() {
       controller.setScoresText(Player.PLAYERONE.getName() + ": " + playerOneScore + " POINTS VS " + Player.PLAYERTWO.getName() + ": " + playerTwoScore + " POINTS");

    }
}

