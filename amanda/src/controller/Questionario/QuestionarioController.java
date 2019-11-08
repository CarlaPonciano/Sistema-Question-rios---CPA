/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Questionario;

import model.Questionario.QuestionarioDAO;
import model.Questionario.QuestionarioDomain;

/**
 *
 * @author carli
 */
public class QuestionarioController {
    public boolean cadastrarQuestionario(QuestionarioDomain questionario){
        QuestionarioDAO questionario_dao = new QuestionarioDAO();
        return questionario_dao.cadastrarQuestionario(questionario);
    }
}
