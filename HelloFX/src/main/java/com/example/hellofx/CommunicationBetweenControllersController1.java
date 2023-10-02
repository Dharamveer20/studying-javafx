package com.example.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CommunicationBetweenControllersController1 {
    @FXML
    TextField nameTextField;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event) {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CommuncationBetControllersScene2.fxml")); // Mentioned which fxml file to get
            root = loader.load();

            String userName = nameTextField.getText();
            CommunicationBetweenControllersController2 scene2Controller = loader.getController(); // Object creation of other Controller class Creation
            scene2Controller.displayName(userName);

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            System.out.println("Failed");
            System.out.println(e);
        }
    }
}
