package com.example.stackapp;

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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private Button button_login;

    @FXML
    private Button button_sign_up;

    @FXML
    private TextField tf_username;

    @FXML
    private PasswordField pf_password;

    @FXML
    private Label l_errorText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        button_login.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Login button click");

                String username = tf_username.getText();
                String password = pf_password.getText();

                if (username.trim().isEmpty() || password.trim().isEmpty()) {
                    System.out.println("Username or password is missing");

                    l_errorText.setVisible(true);

                    return;
                }

                l_errorText.setVisible(false);

                // connect to DB

                // verify user from DB (username and password are correct)

                // change page to list of boxes
            }
        });

        button_sign_up.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Sign up button click");
                Parent root;
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("sign-up.fxml"));
                    root = loader.load();
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setTitle("Sign up");
                    stage.setScene(new Scene(root, 620, 470));
                    stage.show();
                } catch (Exception e) {
                    System.out.println("Change to sign up page error");
                    e.printStackTrace();
                }
            }
        });
    }
}