package com.example.treino.model;
import jakarta.persistence.*;

@Table
@Entity
public class Disciplina {
    //classe que será usada para categorizar as tarefas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;
    //nome da disciplina

    @Column
    private String professor;
    // nome do professor responsável pela disciplina

    public Disciplina(String nome, String professor) {
        this.nome = nome;
        this.professor = professor;
    }// construtor sem id, pois o mesmo será auto incrementado no MySQL


    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", professor='" + professor + '\'' +
                '}';
    }

    //getters e setter dos atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

}