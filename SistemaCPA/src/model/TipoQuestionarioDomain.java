/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author carli
 */
public class TipoQuestionarioDomain {
    private int id;
    private String nome;
    private String descricao;
    private int tipo_pergunta;

    public TipoQuestionarioDomain() {}

    public TipoQuestionarioDomain(int id, String nome, String descricao, int tipo_pergunta) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo_pergunta = tipo_pergunta;
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

    public int getTipo_pergunta() {
        return tipo_pergunta;
    }

    public void setTipo_pergunta(int tipo_pergunta) {
        this.tipo_pergunta = tipo_pergunta;
    }
    
}
