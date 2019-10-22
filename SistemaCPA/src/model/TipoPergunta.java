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
class TipoPergunta {
    private int id;
    private String tipo;
    private TipoResposta tipo_resposta;
    private List<Pergunta> lista_pergunta;

    public TipoPergunta() {}

    public TipoPergunta(int id, String tipo, TipoResposta tipo_resposta, List<Pergunta> lista_pergunta) {
        this.id = id;
        this.tipo = tipo;
        this.tipo_resposta = tipo_resposta;
        this.lista_pergunta = lista_pergunta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public TipoResposta getTipo_resposta() {
        return tipo_resposta;
    }

    public void setTipo_resposta(TipoResposta tipo_resposta) {
        this.tipo_resposta = tipo_resposta;
    }

    public List<Pergunta> getLista_pergunta() {
        return lista_pergunta;
    }

    public void setLista_pergunta(List<Pergunta> lista_pergunta) {
        this.lista_pergunta = lista_pergunta;
    }
    
}
