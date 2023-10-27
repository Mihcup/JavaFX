module com.example.aula05_10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aula05_10 to javafx.fxml;
    exports com.example.aula05_10;
}