package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.*;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class LogOutOrExit extends Application {
    @Override
        public void start(Stage stage) {

            try {
                Parent root = FXMLLoader.load(getClass().getResource("LogOutScene.fxml")); // loading the fxml file

                stage.setOnCloseRequest(event -> {
                    event.consume(); // If tapped cancel instead of OK don't close the window. Ye nhi likha to cancel tap krne pe hi window close ho jayega.
                    logOut(stage); // Calling logOut method which will prompt Alert Window
                });
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            } catch(Exception e) {
                System.out.println("Error!");
                e.printStackTrace();
            }
        }
        public void logOut(Stage stage){  // This method can be named anything

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Logout");
            alert.setHeaderText("You're about to logout!");
            alert.setContentText("Do you want to save before exiting?");

            if (alert.showAndWait().get() == ButtonType.OK){
                System.out.println("You successfully logged out");
                stage.close();
            }
        }

        public static void main(String[] args) {


            launch(args);
        }
    }

