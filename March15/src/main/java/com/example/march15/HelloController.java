package com.example.march15;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloController {
    public Button btnLogout;
    public VBox pnLogin;
    public PasswordField pfPassword;
    public TextField tfUserName;
    public Button btnSignIn;
    public VBox pnLogout;
    public ColorPicker cpPicker;
    @FXML
    private Label lblAlert;

    @FXML
    protected void onSignInButtonClick() throws IOException {
        String username = "kaz";
        String password = "kaz";

        if (pfPassword.getText().equals(username) && tfUserName.getText().equals(password)){
            AnchorPane p = (AnchorPane) pnLogin.getParent();
            p.getScene().getStylesheets().clear();
            p.getStylesheets().add(getClass().getResource("user1.css").toExternalForm());
            Parent scene = FXMLLoader.load(getClass().getResource("home-view.fxml"));
            p.getChildren().clear();
            p.getChildren().add(scene);
        }



        lblAlert.setText("Invalid User Name and/or Password");

    }

    @FXML
    protected void onLogoutClick(ActionEvent actionEvent) throws IOException {
        String color = cpPicker.getValue().toString();
        System.out.println(cpPicker.getValue());
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(getClass().getResource("user1.css").getPath(), true));
            bw.write(".button{ \n");
            bw.write("\t-fx-background-color: #");
            //bw.write(color, );

        } catch (IOException e) {}
        AnchorPane p = (AnchorPane) pnLogout.getParent();
        Parent scene = FXMLLoader.load(getClass().getResource("login-view.fxml"));
        p.getChildren().clear();
        p.getStylesheets().clear();
        p.getStylesheets().add(getClass().getResource("login.css").toExternalForm());
        p.getChildren().add(scene);
    }
}