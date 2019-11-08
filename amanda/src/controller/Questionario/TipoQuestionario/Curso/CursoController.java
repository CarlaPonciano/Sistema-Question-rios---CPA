/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Questionario.TipoQuestionario.Curso;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Questionario.TipoQuestionario.RespostaQuestionario.Curso.CursoDAO;
import model.Questionario.TipoQuestionario.RespostaQuestionario.Curso.CursoDomain;

/**
 *
 * @author carli
 */
public class CursoController {
    public boolean cadastrarCurso(CursoDomain curso){
        CursoDAO curso_dao = new CursoDAO();
        return curso_dao.cadastrarCurso(curso);
    }
    
    /**
     *
     * @return
     * @throws SQLException
     */
    public List<CursoDomain> recuperarCampus() throws SQLException{
        CursoDAO curso_dao = new CursoDAO();
        CursoDomain curso;
        
        List<CursoDomain> lista_curso = new ArrayList();
        ResultSet rs =  curso_dao.recuperarCurso();
        while(rs.next()){
            curso = new CursoDomain();
            curso.setId(rs.getInt("id"));
            curso.setCurso(rs.getString("curso"));
            curso.setCampus_id(rs.getInt("campus_id"));
            lista_curso.add(curso);
        }
        return lista_curso;
    }
}
