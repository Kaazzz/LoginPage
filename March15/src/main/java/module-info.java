module com.example.march15 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.march15 to javafx.fxml;
    exports com.example.march15;
}