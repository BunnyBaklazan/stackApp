package com.example.stackapp.Controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable{ //implements Initializable
    @FXML
    private ImageView myBox2;
    @FXML
    private Button Btn1;

    Random rand= new Random();
    String[] secretTextArr = {"Think inside box", "We need storage", "No box is too big, no customer too small", "We have solution", "Let's sort it out!", "Shelf of power", "Boxy of creative"};
    @FXML
    private Label secretTxtLabel;

    @FXML
    protected void onBtnPress(){
        secretTxtLabel.setText(secretTextArr[rand.nextInt(secretTextArr.length-1)]);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myBox2.setOnMouseClicked(new EventHandler<>() {
            @Override
            public void handle(MouseEvent event) {
                Parent root;
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("columns_page.fxml"));
                    root = loader.load();
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(new Scene(root, 900, 700));
                    stage.show();
                } catch (Exception e) {
                    System.err.println("Error: "+ e);
                }
            }
        });
        Btn1.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
                Parent root;
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("columns_page.fxml"));
                    root = loader.load();
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(new Scene(root, 900, 700));
                    stage.show();
                } catch (Exception e) {
                    System.err.println("Error: "+ e);
                }
            }
        });
    }

}