package com.example.stackapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ColumnsPage extends javafx.application.Application{
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader= new FXMLLoader(App.class.getResource("columns_page.fxml"));
        Scene scene= new Scene(fxmlLoader.load(), 900, 700);

        stage.setTitle("StackAPP Columns");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
