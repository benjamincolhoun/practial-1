module com.example.practical1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practical1 to javafx.fxml;
    exports com.example.practical1;
}