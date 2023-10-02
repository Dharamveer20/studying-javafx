package com.example.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LogOutOrExitController {
//    @FXML
//    AnchorPane scenePane;
//    @FXML
//    Button logoutBtn;
    Stage stage;
    public void logout(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION); // Creating Alert. (para says kis type ka alert chahiye. CONFIRMATION QuestionMark blue color me dega. Aur bhi alert type h). Use warning alert for your game.
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("If you are in between the the Game your current game process will be lost: ");

        if(alert.showAndWait().get() == ButtonType.OK){ // agar OK tap kiya to
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();

            System.out.println("You successfully logged out!");
            stage.close();
        }
    }
}
