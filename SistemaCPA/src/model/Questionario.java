/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author carli
 */
public class Questionario {
    private int id;
    private String nome;
    private String descricao;
    private String criador;
    private int id_tipo_questionario;

    public Questionario() {}

    public Questionario(int id, String nome, String descricao, String criador, int id_tipo_questionario) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.criador = criador;
        this.id_tipo_questionario = id_tipo_questionario;
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public int getId_tipo_questionario() {
        return id_tipo_questionario;
    }

    public void setId_tipo_questionario(int id_tipo_questionario) {
        this.id_tipo_questionario = id_tipo_questionario;
    }
    
}
