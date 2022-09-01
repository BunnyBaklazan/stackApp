package com.example.stackapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    double x, y;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root= FXMLLoader.load(getClass().getResource("sample.fxml"));
        //FXMLLoader root= new FXMLLoader(Main.class.getResource("sample.fxml"));
        //Scene scene= new Scene(root.load(), 620, 470);
        primaryStage.initStyle(StageStyle.UNDECORATED);

        root.setOnMousePressed(event -> {
            x= event.getSceneX();
            y= event.getSceneY();
        });

        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getScreenX()- x);
            primaryStage.setY(event.getScreenY()- y);

        });

        primaryStage.setScene(new Scene(root, 900, 700));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
