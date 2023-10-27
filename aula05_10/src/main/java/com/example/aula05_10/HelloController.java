package com.example.aula05_10;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TableView<Pessoa> tabela;
    @FXML
    private TableColumn<Pessoa,Integer> colid;
    // classe e tipo
    @FXML
    private TableColumn<Pessoa,String> colnome;
    @FXML
    private TableColumn<Pessoa,Integer> colidade;
    // mapeando os ids que foram colocados lá
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtIdade;

    List<Pessoa> pessoas = new ArrayList<>();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // método que executa quando o sistema inicializa
            Pessoa p1 = new Pessoa("Millena", 16);
            Pessoa p2 = new Pessoa("Nalu", 48);
            Pessoa p3 = new Pessoa("Marcelo", 52);

            pessoas.add(p1);
            pessoas.add(p2);
            pessoas.add(p3);
            mostrarPessoas();

    }

    private void mostrarPessoas() {
        tabela.setItems(FXCollections.observableList(pessoas));
        // vai fzr a conversão da lista de array para uma lista observável de pessoas
        //decidir em qual coluna,
        colid.setCellValueFactory(new PropertyValueFactory<Pessoa, Integer>("id"));
        colnome.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("nome"));
        colidade.setCellValueFactory(new PropertyValueFactory<Pessoa, Integer>("idade"));
    }

    public void salvar(ActionEvent actionEvent){
        Pessoa p = new Pessoa(txtNome.getText(),Integer.parseInt(txtIdade.getText()));
        pessoas.add(p);
        mostrarPessoas();
    }
}