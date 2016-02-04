package com.ludwigstralewiren;

import com.ludwigstralewiren.model.Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
        Pane welcomeScreen = FXMLLoader.load(getClass().getResource("/fxml/welcome.fxml"));
        primaryStage.setTitle("TicTacToe");
        //primaryStage.setScene(new Scene(root,800, 300));
        primaryStage.setScene(new Scene(welcomeScreen, 400, 300));
        primaryStage.setResizable(false);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
