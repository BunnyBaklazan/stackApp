package com.example.stackapp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {
    @FXML
    private Button button_signup;

    @FXML
    private Button button_log_in;

    @FXML
    private TextField tf_username;

    @FXML
    private TextField tf_password;

    @FXML
    private TextField tf_first_name;

    @FXML
    private TextField tf_last_name;

    @FXML
    private Label l_errorText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        button_signup.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Sign up button click!");

                String username = tf_username.getText();
                String password = tf_password.getText();
                String firstName = tf_first_name.getText();
                String lastName = tf_last_name.getText();

                if (username.trim().isEmpty() || password.trim().isEmpty() || firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
                    System.out.println("Some of fields are missing!");

                    l_errorText.setVisible(true);

                    return;
                }

                l_errorText.setVisible(false);

                // connect to DB

                // create new user in DB

                // change page to list of boxes
            }
        });

        button_log_in.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Login button click");
                Parent root;
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("log-in.fxml"));
                    root = loader.load();
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setTitle("Welcome to the StackApp!");
                    stage.setScene(new Scene(root, 620, 470));
                    stage.show();
                } catch (Exception e) {
                    System.out.println("Change page error");
                }
            }
        });
    }
}
