package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override   
    public void start(Stage stage) throws Exception { // start method definiton

        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setTitle("Demo stage");

//
//        Line line = new Line(200,200,500,200); //
////        line.setStartX(200); // x and y axis me kaha start hoga
////        line.setStartY(200);
////        line.setEndX(500); // 500 and 200 se line horizontal straight bnta h
////        line.setEndY(200);
//        line.setStrokeWidth(5);
//        line.setStroke(Color.RED);
//        line.setOpacity(0.5);
//        line.setRotate(45);
//
//        root.getChildren().add(line);

        stage.setScene(scene); // Here we are saying stage please whatever we have done in the scene.
        // displaying the stage.
        stage.show();
    }
}