package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class ImageView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("ImgViewScene.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Demo stage");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            System.out.println("Error");
            System.out.println(e);
        }
    }
}
