package com.example.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class ColorPickerController {

    @FXML
    private ColorPicker colorPicker; // obj name same as fx;id

    @FXML
    private Label label; // obj name same as fx;id

    @FXML
    void chnageColor(ActionEvent event) { // functioned invoked when action performed
        Color myColor = colorPicker.getValue();
        label.setBackground(new Background(new BackgroundFill(myColor, CornerRadii.EMPTY, Insets.EMPTY)));
    }

}
