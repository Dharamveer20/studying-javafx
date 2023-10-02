package com.example.hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CommunicationBetweenControllersController2 {
    @FXML
    Label nameLabel; // object name must be same as fx:id
    public void displayName(String userName) {
        nameLabel.setText("Hello " + userName);
    }
}
