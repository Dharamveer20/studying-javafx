package com.example.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {

    @FXML
//    private Label welcomeText;
    Circle myCircle = new Circle(); // fxml me jaha bhi circle drag and drop kiya h vaha pe uska center 0,0 hota h
    private double x,y;


    @FXML
    void down(ActionEvent event) {
        System.out.println("before: " + y);
        myCircle.setCenterY(y+=30);
        System.out.println("down");
        System.out.println("after: " + y);

    }
    @FXML
    void left(ActionEvent event) {
        System.out.println("before: " + x);

        System.out.println("left");
        myCircle.setCenterX(x-=30);
        System.out.println("after: " + x);


    }
    @FXML
    void right(ActionEvent event) {
        System.out.println("right");
        myCircle.setCenterX(x+=30);
    }
    @FXML
    void up(ActionEvent event) {
        System.out.println("Up");
        myCircle.setCenterY(y-=30);
    }
}
