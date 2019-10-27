/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author carli
 */
public class QuestionarioDAO {
    public boolean cadastrarQuestionario(QuestionarioDomain questionario){
        String sql = "INSERT INTO cpa.questionario(nome, descricao, Usuario_usuario, TipoQuestionario_id) VALUES "
                        + "(" + questionario.getNome() + ", " + questionario.getDescricao() + ", "
                        + questionario.getCriador() + ", " + questionario.getId_tipo_questionario() + ";)";
        try{
            Connection con = ConnectionPostgreSQL.getInstance().getConnection();
            Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            return true;
        }catch(SQLException e){
            System.out.println("Erro no cadastro do questionário!");
            System.out.println(e.getMessage());
            return false;
        }
    }
}
