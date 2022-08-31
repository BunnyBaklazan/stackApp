package com.example.stackapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Random;

public class Controller {
    @FXML
    private Label welcomeText;

    //@FXML
    //private ImageView myBox;

    @FXML
    private ImageView myBox2;

    Random rand= new Random();

    String[] textArr= {"Think inside box", "We need storage", "No box is too big, no customer too small", "We have solution", "Let's sort it out!", "Shelf of power", "Boxy of creative"};

    @FXML
    private Label secretTxtLabel;

    /*File iconFile= new File("/Users/qwer/eclipse-workspace/stackApp/src/main/resources/com/example/stackapp/IMG/box-png-icon-yellow.png");
    Image image;
    {try {
        image = new Image(iconFile.toURI().toURL().toString());
    } catch (MalformedURLException e) {
        throw new RuntimeException(e);
    }}*/

    @FXML
    protected void onBtnPress() throws MalformedURLException {
        secretTxtLabel.setText(textArr[rand.nextInt(textArr.length-1)]);
        //myBox2= new ImageView(image);
        //myBox2.setVisible(true);


    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}