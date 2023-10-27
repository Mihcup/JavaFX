module br.dedigados.gerenciador_dedigados {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires java.naming;


    opens br.dedigados.gerenciador_dedigados to javafx.fxml;
    opens br.dedigados.gerenciador_dedigados.Model to org.hibernate.orm.core;
    exports br.dedigados.gerenciador_dedigados;

}