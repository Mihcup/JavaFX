package com.example.treino.controllers;

import com.example.treino.model.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class LoginController {

    @FXML
    private TextField txtlogin;
    @FXML
    private TextField txtsenha;

    List<Usuario> Usuario = new ArrayList<>();


    public void entrar(ActionEvent actionEvent) {
        String login = txtlogin.getText();
        String senha = txtsenha.getText();
    }

}