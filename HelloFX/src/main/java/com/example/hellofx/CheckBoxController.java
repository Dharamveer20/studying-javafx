package com.example.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CheckBoxController {

    @FXML
    private Label changeNotChangeLabel;

    @FXML
    private CheckBox checkBox;

    @FXML
    private ImageView imageVIew;
    Image image = new Image(getClass().getResourceAsStream("/image/mikasa.png"));
    Image image1 = new Image(getClass().getResourceAsStream("/image/mikasa_kun.jpg"));
    @FXML
    void changeImage(ActionEvent event) {
        if(checkBox.isSelected()){
            imageVIew.setImage(image);
            changeNotChangeLabel.setText("Changed");
        }else {
            imageVIew.setImage(image1);
            changeNotChangeLabel.setText("Not Changed");

        }
    }

}
