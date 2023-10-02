//package com.example.hellofx;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.input.DragEvent;
//import javafx.scene.input.MouseEvent;
//
//public class ImageViewController {
//
//    @FXML
//    private ImageView imageView;
//
//
//    Image image = new Image(getClass().getResourceAsStream("mikasa.png"));
//
//    @FXML
//    void changeImage(MouseEvent event) {
//        imageView.setImage(image);
//    }
//
//}
////package com.example.hellofx;
//
////import javafx.event.ActionEvent;
////
////public class ImageViewController {
////
////    @FXML
////    void h(ActionEvent event) {
////        System.out.println("hey");
////    }
////
////}
package com.example.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ImageViewController {

    @FXML
    private ImageView imageView;

    @FXML
    private Button myButton;

    Image image = new Image(getClass().getResourceAsStream("/image/mikasa.png"));
    Image image1 = new Image(getClass().getResourceAsStream("/image/mikasa_kun.jpg"));



    // CHaning image on mouse enter
    @FXML
    void changeImage(MouseEvent event) {
//        InputStream resourceAsStream = getClass().getResourceAsStream("/image/mikasa.png");
//        Image image = new Image(getClass().getResourceAsStream("/image/mikasa.png"));

//        imageView = new ImageView(new Image(resourceAsStream));
          imageView.setImage(image);
        System.out.println("hey1");
    }

    // Displayig the same image when we GUI was first displayed
    @FXML
    void changeImage1(MouseEvent event) {
//        InputStream resourceAsStream = getClass().getResourceAsStream("/image/mikasa.png");

//        imageView = new ImageView(new Image(resourceAsStream));
        imageView.setImage(image1);
        System.out.println("hey2");
    }
    public void btn(ActionEvent e){
        System.out.println("hey");
    }

}
