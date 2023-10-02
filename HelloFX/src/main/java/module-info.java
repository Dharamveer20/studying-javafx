module com.example.hellofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellofx to javafx.fxml;
    exports com.example.hellofx;
    exports com.example.hellofx.image;
    opens com.example.hellofx.image to javafx.fxml;
//    exports com.example.hellofx.controller;
//    opens com.example.hellofx.controller to javafx.fxml;
//    exports com.example.hellofx.application;
//    opens com.example.hellofx.application to javafx.fxml;
}