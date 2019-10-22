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
class TipoResposta {
    private int id;
    private String tipo;
    private List<Resposta> lista_resposta;

    public TipoResposta() {}

    public TipoResposta(int id, String tipo, List<Resposta> lista_resposta) {
        this.id = id;
        this.tipo = tipo;
        this.lista_resposta = lista_resposta;
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

    public List<Resposta> getLista_resposta() {
        return lista_resposta;
    }

    public void setLista_resposta(List<Resposta> lista_resposta) {
        this.lista_resposta = lista_resposta;
    }
    
}
