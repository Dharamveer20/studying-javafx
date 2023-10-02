package com.example.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TextFieldController {

    @FXML
    private Label resultLabel;

    @FXML
    private Button submitBtn;

    @FXML
    private TextField textField;
    int age;

    @FXML
    void votingEligibility(ActionEvent event) {
        try{
            age = Integer.parseInt(textField.getText());
            if(age >= 18) resultLabel.setText("You are Eligible to Vote!");
            else resultLabel.setText("You are not Eligible to Vote!");
        } catch(NumberFormatException e){ // If entered a words instead of number
            resultLabel.setText("Please Enter a Number");
        } catch(Exception e){
            resultLabel.setText("Error occurred while checking Eligibility.");
        }
    }
}
