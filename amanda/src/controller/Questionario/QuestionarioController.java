/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Questionario;

import javax.faces.bean.ManagedBean;
import model.Questionario.QuestionarioDAO;
import model.Questionario.QuestionarioDomain;

/**
 *
 * @author carli
 */
@ManagedBean(name="questionarioController")
public class QuestionarioController {
    private QuestionarioDomain questionario = new QuestionarioDomain();

    public QuestionarioDomain getQuestionario() {
        return questionario;
    }

    public void setQuestionario(QuestionarioDomain questionario) {
        this.questionario = questionario;
    }
    
    public boolean cadastrarQuestionario(){
        QuestionarioDAO questionario_dao = new QuestionarioDAO();
        return questionario_dao.cadastrarQuestionario(questionario);
    }
}
