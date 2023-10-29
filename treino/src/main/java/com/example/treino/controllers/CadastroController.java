package com.example.treino.controllers;

import com.example.treino.model.Usuario;
import com.example.treino.persist.Persistencia;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadastroController {

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtSenha;

    @FXML
    void cadastro(ActionEvent event) {
        String nome = txtNome.getText();
        String login = txtLogin.getText();
        String senha = txtSenha.getText();
        Usuario u = new Usuario(nome,login,senha);
        Persistencia.SalvarUsuario(u);
    }

}
