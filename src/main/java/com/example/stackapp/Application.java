package com.example.stackapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        Scene scene= new Scene(root, 900, 700);

        stage.setTitle("Hello StackAPP");
        stage.setResizable(false);

        stage.setScene(scene);
        stage.show();
    }

    /*
    *
    * Parent root = FXMLLoader.load(getClass().getResource("columns_page.fxml"));
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);* */

    public static void main(String[] args) {
        launch();
    }
}