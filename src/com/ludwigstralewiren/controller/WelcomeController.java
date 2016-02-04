package com.ludwigstralewiren.controller;

import com.ludwigstralewiren.model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeController {

    @FXML
    private TextField textbar;
    @FXML
    private Text nameofplayer1;
    @FXML
    private Text nameofplayer2;
    @FXML
    private Button thebutton;

    private int counter = 0;


    public void clickEnter(ActionEvent event) throws IOException {

        if (counter == 0) {
            String playerName1 = textbar.getText();
            if (playerName1.equals("")) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("No name was given");
                alert.show();
            } else {
                nameofplayer1.setText(playerName1);
                Player.PLAYERONE.setName(playerName1);
                textbar.clear();
                counter++;
            }
        } else if (counter == 1) {
            String playerName2 = textbar.getText();
            if (playerName2.equals("")) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("No name was given");
                alert.show();
            } else {
                nameofplayer2.setText(playerName2);
                Player.PLAYERTWO.setName(playerName2);
                thebutton.setText(" GO!");
                textbar.setOpacity(0);
                counter++;
            }
        } else if (counter == 2) {
            Stage stage = new Stage();
            stage.setTitle("TicTacToe");
            Pane myPane = null;
            myPane = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
            Scene scene = new Scene(myPane, 600, 600);
            stage.setScene(scene);
            stage.show();
            stage.setResizable(false);

        }


    }

}






