package com.example.aula05_10;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        // tamnho da janela, altura e largura da janela em pixels
        stage.setTitle("Hello!");
        // título do arquivo
        stage.setScene(scene);
        //colocando a cena
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}