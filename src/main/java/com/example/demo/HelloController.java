package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField textMassage;
    @FXML
    public TextArea Chat;

    @FXML
    public void sendMassageBtn(ActionEvent actionEvent) {
        Chat.appendText(textMassage.getText() + "\n");
        textMassage.clear();
        textMassage.requestFocus();
    }
}