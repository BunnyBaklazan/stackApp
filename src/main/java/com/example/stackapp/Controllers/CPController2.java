package com.example.stackapp.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CPController2 implements Initializable {
    @FXML
    private Label exit;

    @FXML
    private StackPane contentArea;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        exit.setOnMouseClicked(e -> {
            System.exit(0);

        });

        try{
            Parent fxml= FXMLLoader.load(getClass().getResource("home.fxml"));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
        } catch (IOException ex) {
            Logger.getLogger(CPController2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void home(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml= FXMLLoader.load(getClass().getResource("home.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().addAll(fxml);
    }

    public void b1(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent fxml= FXMLLoader.load(getClass().getResource("b1.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().addAll(fxml);
    }
}
