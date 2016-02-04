package com.ludwigstralewiren.model;

import javafx.scene.control.Button;

/**
 * Created by Ludwig on 2/1/2016.
 */


public class Game {

    private static Game game = null;

    private Game() {
    }

    public static Game getInstance() {
        if (game == null){
            game = new Game();
        }
        return game;
    }

     public static boolean checkForWinner(Button topleft, Button topcenter, Button topright,
                                  Button leftcenter, Button center, Button rightcenter,
                                  Button bottomleft, Button bottomcenter, Button bottomright) {

        //KOLLAR OM 3 I RAD HOROZONTELLT
        if (topleft.getText() == topcenter.getText() && topcenter.getText() == topright.getText() && topleft.getText() != "?") {
            return true;
        } else if (leftcenter.getText() == center.getText() && center.getText() == rightcenter.getText() && leftcenter.getText() != "?") {
            return true;
        } else if (bottomleft.getText() == bottomcenter.getText() && bottomcenter.getText() == bottomright.getText() && bottomleft.getText() != "?") {
            return true;
        }
        //KOLLAR OM 3 I RAD VERTIKALT
        else if (topleft.getText() == leftcenter.getText() && leftcenter.getText() == bottomleft.getText() && topleft.getText() != "?") {
            return true;
        } else if (topcenter.getText() == center.getText() && center.getText() == bottomcenter.getText() && topcenter.getText() != "?") {
            return true;
        } else if (topright.getText() == rightcenter.getText() && rightcenter.getText() == bottomright.getText() && topright.getText() != "?") {
            return true;
        }
        //KOLLAR OM 3 I RAD DIAGONALT
        else if (topleft.getText() == center.getText() && center.getText() == (bottomright.getText()) && topleft.getText() != "?") {
            return true;
        } else if (topright.getText() == center.getText() && center.getText() == bottomleft.getText() && topright.getText() != "?") {
            return true;
        } else return false;

    }

}
