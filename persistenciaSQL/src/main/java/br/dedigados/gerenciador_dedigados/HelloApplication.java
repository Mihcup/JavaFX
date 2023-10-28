package br.dedigados.gerenciador_dedigados;

import br.dedigados.gerenciador_dedigados.Model.Usuario;
import br.dedigados.gerenciador_dedigados.Util.HibernateUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void init() throws Exception {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        /*
        session.persist();
        session.persist();
        transaction.commit();

        Usuario user = session.get(Usuario.class, 1);
        Usuario user2 = session.get(Usuario.class, 2);

        System.out.println();
        System.out.println();
        */

    }

    public static void main(String[] args) {
        launch();
    }
}