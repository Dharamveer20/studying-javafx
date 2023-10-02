package com.example.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SwitchSceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void switchToScene1(ActionEvent event) throws IOException {
//        2 ways to load the fxml file during event handling
//        1.
//        root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
//        2.
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        root = loader.load(); // or this way to load the f
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event){
        try {
//            root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
            root = loader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch(Exception e){
            System.out.println(e);
        }
    }

}
