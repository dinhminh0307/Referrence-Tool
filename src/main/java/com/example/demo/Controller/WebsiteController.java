package com.example.demo.Controller;

import Model.AppSystem;
import com.example.demo.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class WebsiteController {
    @FXML
    private TextField authorName;
    @FXML
    private TextField Year;
    @FXML
    private TextField Title;
    @FXML
    private TextField Website;
    @FXML
    private TextField accessedDate;
    @FXML
    private TextField URL;
    @FXML
    Text myText;
    String myStr;
    public void onSubmitButtonPressed(ActionEvent event) throws IOException {
        myStr = new AppSystem().formatAuthorName(authorName.getText());
        myText.setText(new AppSystem().websiteReference(myStr, Year.getText(),
                Title.getText(), Website.getText(), accessedDate.getText(), URL.getText()));
    }
}
