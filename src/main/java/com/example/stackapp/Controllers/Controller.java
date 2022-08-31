package com.example.stackapp.Controllers;

import com.example.stackapp.Application;
import com.example.stackapp.ColumnsPage;
import com.example.stackapp.DBConnections.InsertApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Random;

public class Controller{
    InsertApp insert= new InsertApp();
    private Stage stage;
    private Scene scene;
    private Parent parent;

    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("columns_page.fxml"));
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    Random rand= new Random();
    String[] secretTextArr = {"Think inside box", "We need storage", "No box is too big, no customer too small", "We have solution", "Let's sort it out!", "Shelf of power", "Boxy of creative"};
    @FXML
    private Label secretTxtLabel;

    @FXML
    protected void onBtnPress() throws MalformedURLException {
        secretTxtLabel.setText(secretTextArr[rand.nextInt(secretTextArr.length-1)]);
        insert.insert(12, "MC Donalds");

    }
}