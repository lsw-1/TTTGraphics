package com.ludwigstralewiren.controller;

import com.ludwigstralewiren.model.Game;
import com.ludwigstralewiren.model.Player;
import com.ludwigstralewiren.model.Scores;
import com.ludwigstralewiren.model.interfaces.Observable;
import com.ludwigstralewiren.model.interfaces.Observer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;


public class Controller implements Observable {

    @FXML
    private Button topleft;
    @FXML
    private Button topcenter;
    @FXML
    private Button topright;
    @FXML
    private Button leftcenter;
    @FXML
    private Button center;
    @FXML
    private Button rightcenter;
    @FXML
    private Button bottomleft;
    @FXML
    private Button bottomcenter;
    @FXML
    private Button bottomright;
    @FXML
    private Label message;
    @FXML
    private Label scores;
    @FXML
    private Button restart;

    private int playerOneScore;
    private int playerTwoScore;
    int turn = 1;
    ArrayList<Observer> listObservers = new ArrayList<>();
    Observer scoreofPlayers = new Scores(this);

    Game game = Game.getInstance();

    @FXML
    private void initialize() {
        restart.setDisable(true);
    }

    public void setScoresText(String text) {
        scores.setText(text);
    }

    public void chooseSquare(ActionEvent event) {

        Object btn = event.getSource();

        Button clickedBtn = null;
        if (btn instanceof Button) {
            clickedBtn = (Button) btn;
        }

        if (turn % 2 == 0 && clickedBtn.getText().equals("?")) {
            clickedBtn.setText(Player.PLAYERONE.getMarker());
            message.setText("");
            turn++;
        } else if (turn % 2 != 0 && clickedBtn.getText().equals("?")) {
            clickedBtn.setText(Player.PLAYERTWO.getMarker());
            message.setText("");
            turn++;
        } else {
            message.setText("INVALID MOVE");
        }


        quitMatch(turn, game.checkForWinner(topleft, topcenter, topright,
                leftcenter, center, rightcenter,
                bottomleft, bottomcenter, bottomright));


    }

    private void enableButtons() {
        topleft.setDisable(false);
        topcenter.setDisable(false);
        topright.setDisable(false);
        leftcenter.setDisable(false);
        center.setDisable(false);
        rightcenter.setDisable(false);
        bottomleft.setDisable(false);
        bottomcenter.setDisable(false);
        bottomright.setDisable(false);
    }

    private void disableButtons() {
        topcenter.setDisable(true);
        topleft.setDisable(true);
        leftcenter.setDisable(true);
        center.setDisable(true);
        rightcenter.setDisable(true);
        bottomleft.setDisable(true);
        bottomcenter.setDisable(true);
        bottomright.setDisable(true);
        topright.setDisable(true);
    }

    public void quitMatch(int turn, boolean checkifwinner) {

        if (checkifwinner == true) {
            if (turn % 2 != 0) {
                message.setText(Player.PLAYERONE.getName() + " HAVE WON THIS ROUND");
                restart.setDisable(false);
                disableButtons();
                setPlayerOneScore(playerOneScore + 1);
            } else if (turn % 2 == 0) {
                message.setText(Player.PLAYERTWO.getName() + " HAVE WON THIS ROUND");
                restart.setDisable(false);
                disableButtons();
                setPlayerTwoScore(playerTwoScore + 1);
            }
        }
        if (turn+1 == 10) {
            message.setText("IT'S A TIE!");
            restart.setDisable(false);
            disableButtons();

        }

    }

    public void setPlayerOneScore(int newScore) {
        this.playerOneScore = newScore;
        notifyObserver();
    }

    public void setPlayerTwoScore(int newScore) {
        this.playerTwoScore = newScore;
        notifyObserver();
    }

    public void restartButton(ActionEvent event) {
        enableButtons();
        topleft.setText("?");
        topcenter.setText("?");
        topright.setText("?");
        leftcenter.setText("?");
        center.setText("?");
        rightcenter.setText("?");
        bottomleft.setText("?");
        bottomcenter.setText("?");
        bottomright.setText("?");
        restart.setDisable(true);
        restart.setOpacity(0);
        message.setText("");
        turn = 0;
    }

    @Override
    public void register(Observer newObserver) {
        listObservers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = listObservers.indexOf(deleteObserver);
        listObservers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : listObservers) {
            observer.update(playerOneScore, playerTwoScore);
        }
    }

}
