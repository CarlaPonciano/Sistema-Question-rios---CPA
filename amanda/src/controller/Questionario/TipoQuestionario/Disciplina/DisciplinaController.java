/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Questionario.TipoQuestionario.Disciplina;

import model.Questionario.TipoQuestionario.RespostaQuestionario.Disciplina.DisciplinaDAO;
import model.Questionario.TipoQuestionario.RespostaQuestionario.Disciplina.DisciplinaDomain;

/**
 *
 * @author carli
 */
public class DisciplinaController {
    public boolean cadastrarDisciplina(DisciplinaDomain disciplina){
        DisciplinaDAO disciplina_dao = new DisciplinaDAO();
        return disciplina_dao.cadastrarDisciplina(disciplina);
    }
}
