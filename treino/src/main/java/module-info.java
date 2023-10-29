module com.example.treino {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires java.naming;


    opens com.example.treino to javafx.fxml;
    exports com.example.treino;
    exports com.example.treino.controllers;
    opens com.example.treino.controllers to javafx.fxml;
    opens com.example.treino.model to org.hibernate.orm.core;

}