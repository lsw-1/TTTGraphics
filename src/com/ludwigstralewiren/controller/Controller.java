package com.ludwigstralewiren.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

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

    int turn = 0;


    public void clickTheButton(ActionEvent event) {
        Object btn = event.getSource();


        if (btn.equals(topleft) && turn % 2 == 0 && topleft.getText().equals("?")) {
            drawX(topleft);
            turn++;
        } else if (btn.equals(topleft) && turn % 2 != 0 && topleft.getText().equals("?")) {
            turn++;
            drawO(topleft);
        } else if (btn.equals(topcenter) && turn % 2 == 0 && topcenter.getText().equals("?")) {
            turn++;
            drawX(topcenter);
        } else if (btn.equals(topcenter) && turn % 2 != 0 && topcenter.getText().equals("?")) {
            turn++;
            drawO(topcenter);
        } else if (btn.equals(topright) && turn % 2 == 0 && topright.getText().equals("?")) {
            turn++;
            drawX(topright);
        } else if (btn.equals(topright) && turn % 2 != 0 && topright.getText().equals("?")) {
            turn++;
            drawO(topright);
        } else if (btn.equals(leftcenter) && turn % 2 == 0 && leftcenter.getText().equals("?")) {
            turn++;
            drawX(leftcenter);
        } else if (btn.equals(leftcenter) && turn % 2 != 0 && leftcenter.getText().equals("?")) {
            turn++;
            drawO(leftcenter);
        } else if (btn.equals(center) && turn % 2 == 0 && center.getText().equals("?")) {
            turn++;
            drawX(center);
        } else if (btn.equals(center) && turn % 2 != 0 && center.getText().equals("?")) {
            turn++;
            drawO(center);
        } else if (btn.equals(rightcenter) && turn % 2 == 0 && rightcenter.getText().equals("?")) {
            turn++;
            drawX(rightcenter);
        } else if (btn.equals(rightcenter) && turn % 2 != 0 && rightcenter.getText().equals("?")) {
            turn++;
            drawO(rightcenter);
        } else if (btn.equals(bottomleft) && turn % 2 == 0 && bottomleft.getText().equals("?")) {
            turn++;
            drawX(bottomleft);
        } else if (btn.equals(bottomleft) && turn % 2 != 0 && bottomleft.getText().equals("?")) {
            turn++;
            drawO(bottomleft);
        } else if (btn.equals(bottomcenter) && turn % 2 == 0 && bottomcenter.getText().equals("?")) {
            turn++;
            drawX(bottomcenter);
        } else if (btn.equals(bottomcenter) && turn % 2 != 0 && bottomcenter.getText().equals("?")) {
            turn++;
            drawO(bottomcenter);
        } else if (btn.equals(bottomright) && turn % 2 == 0 && bottomright.getText().equals("?")) {
            turn++;
            drawX(bottomright);
        } else if (btn.equals(bottomright) && turn % 2 != 0 && bottomright.getText().equals("?")) {
            turn++;
            drawO(bottomright);
        } else {
            System.out.println("ERROR");
        }
    }

    private void drawX(Button btn) {
        btn.setText("X");
    }

    private void drawO(Button btn) {
        btn.setText("O");
    }


    public void TEST(ActionEvent event) {

        System.out.println(event);
    }


}
