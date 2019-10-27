/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.TipoQuestionarioDAO;
import model.TipoQuestionarioDomain;

/**
 *
 * @author carli
 */
public class TipoQuestionarioController {
    public List<TipoQuestionarioDomain> recuperarTipoQuestionario() throws SQLException{
        TipoQuestionarioDAO tipo_questionario_dao = new TipoQuestionarioDAO();
        TipoQuestionarioDomain tipo_questionario;
        
        List<TipoQuestionarioDomain> lista_tipo_questionario = new ArrayList();
        ResultSet rs =  tipo_questionario_dao.recuperarTipoQuestionario();
        while(rs.next()){
            tipo_questionario = new TipoQuestionarioDomain();
            tipo_questionario.setId(rs.getInt("id"));
            tipo_questionario.setNome(rs.getString("nome"));
            tipo_questionario.setDescricao(rs.getString("descricao"));
            tipo_questionario.setTipo_pergunta(rs.getInt("TipoPergunta_id"));
            lista_tipo_questionario.add(tipo_questionario);
        }
        return lista_tipo_questionario;
    }
}
