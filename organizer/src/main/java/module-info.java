module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    
    opens com.example to javafx.fxml;
    opens com.example.controller to javafx.fxml;
    opens com.example.func to javafx.fxml;

    exports com.example;
}