package com.ludwigstralewiren.model;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Created by Ludwig on 1/24/2016.
 */
public class TheGame {
    private static TheGame ourInstance = new TheGame();

    public static TheGame getInstance() {
        return ourInstance;
    }

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

    private TheGame() {
    }



    public boolean kollaVinnare(){

        //KOLLAR OM 3 I RAD HOROZONTELLT
        if(mBr�de[0] == mBr�de[1] && mBr�de[1] == mBr�de[2] && mBr�de[0] != ' '){
            return true;
        } else if (mBr�de[3] == mBr�de[4] && mBr�de[4] == mBr�de[5] && mBr�de[3] != ' '){
            return true;
        } else if (mBr�de[6] == mBr�de[7] && mBr�de[7] == mBr�de[8] && mBr�de[6] != ' '){
            return true;
        }
        //KOLLAR OM 3 I RAD VERTIKALT
        else if (mBr�de[0] == mBr�de[3] && mBr�de[3] == mBr�de[6] && mBr�de[0] != ' ' ){
            return true;
        } else if (mBr�de[1] == mBr�de[4] && mBr�de[4] == mBr�de[7] && mBr�de[1] != ' '){
            return true;
        } else if (mBr�de[2] == mBr�de[5] && mBr�de[5] == mBr�de[8] && mBr�de[2] != ' '){
            return true;
        }
        //KOLLAR OM 3 I RAD DIAGONALT
        else if (mBr�de[0] == mBr�de[4] && mBr�de[4] == mBr�de[8] && mBr�de[0] != ' '){
            return true;
        } else if (mBr�de[2] == mBr�de[4] && mBr�de[4] == mBr�de[6] && mBr�de[2] != ' '){
            return true;
        } else
        return false;

    }

}
