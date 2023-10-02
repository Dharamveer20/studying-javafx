package com.example.hellofx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ChoiceBoxController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private ChoiceBox<String> paraChoiceBox;
    private String [] para = {"Ye para", "Vo para", "Konsa to Para"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        paraChoiceBox.getItems().addAll(para); // Dropdown added to the checkbox

        // Setting OnAction for the desired object
        paraChoiceBox.setOnAction(this::changeLabel);// :: method reference operator. Para says refer to this method for Action

// Writing below commented code will do the work too.
//        paraChoiceBox.valueProperty().addListener(new ChangeListener<String>() {
//            @Override
//            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
//                label.setText(paraChoiceBox.getValue());
//            }
//        }
//        );

    }
    private void changeLabel(ActionEvent event) {
        String chosenPara = paraChoiceBox.getValue(); // storing selected dropdown option
        label.setText(chosenPara);
    }
}

