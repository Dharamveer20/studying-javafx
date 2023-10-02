package com.example.hellofx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SwitchScenes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Demo stage");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            System.out.println("Error Occured in SwitchScenes!");
            System.out.println(e);
        }
    }

}
