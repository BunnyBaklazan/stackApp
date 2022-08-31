package com.example.stackapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 700);
        stage.setTitle("Hello StackAPP");
        stage.setResizable(false);

        /*File iconFile= new File("/Users/qwer/eclipse-workspace/stackApp/src/main/java/com/example/stackapp/IMG/box-png-icon-yellow.png");
        Image image= new Image(iconFile.toURI().toURL().toString());
        ImageView imageView= new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);*/

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}