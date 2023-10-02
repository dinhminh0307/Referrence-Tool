package com.example.demo.Controller;

import Model.AppSystem;
import com.example.demo.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WebsiteController implements Initializable {
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
        final Clipboard clipboard = Clipboard.getSystemClipboard();
        final ClipboardContent content = new ClipboardContent();
        content.putString(new AppSystem().websiteReference(myStr, Year.getText(),
                Title.getText(), Website.getText(), URL.getText()));
        clipboard.setContent(content);

        myText.setText(new AppSystem().websiteReference(myStr, Year.getText(),
                Title.getText(), Website.getText(), URL.getText()));
    }

    public void DefaultDisplay() {
        authorName.clear();
        Year.clear();
        Title.clear();
        Website.clear();
        URL.clear();
        myText.setText("Result");
    }
    public void onResetButtonPressed(ActionEvent event) throws IOException{
        DefaultDisplay();
    }

    @Override
    public void initialize(java.net.URL url, ResourceBundle resourceBundle) {
        DefaultDisplay();
    }
}
