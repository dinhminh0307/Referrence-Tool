package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import com.example.demo.Controller.WebsiteController;
import java.io.IOException;

public class HelloController {
    @FXML
    private Button websiteButton;

    public void onWebsiteButtonPressed(ActionEvent event) throws IOException {
        Stage stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WebsiteReference.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}