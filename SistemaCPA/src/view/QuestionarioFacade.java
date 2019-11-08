/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Questionario.QuestionarioController;
import controller.Questionario.TipoQuestionario.TipoQuestionarioController;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import model.Questionario.QuestionarioDomain;
import model.Questionario.TipoQuestionario.TipoQuestionarioDomain;

/**
 *
 * @author carli
 */
public class QuestionarioFacade {
    public void cadastrarQuestionario(){
        try{
            Scanner teclado_int = new Scanner(System.in);
            Scanner teclado_string = new Scanner(System.in);

            QuestionarioDomain questionario = new QuestionarioDomain();

            System.out.println("Selecione o tipo do questionário: ");
            TipoQuestionarioController tipo_questionario_controller = new TipoQuestionarioController();
            List<TipoQuestionarioDomain> lista_tipo_questionario = tipo_questionario_controller.recuperarTipoQuestionario();
            for(TipoQuestionarioDomain l : lista_tipo_questionario){
                System.out.println(l.getId() + " - " + l.getNome() + " - " + l.getDescricao());
            }
            questionario.setId_tipo_questionario(teclado_int.nextInt());

            System.out.println("Informe o nome do usuário: ");
            questionario.setCriador(teclado_string.nextLine());
            
            System.out.println("Informe o nome do questionário: ");
            questionario.setNome(teclado_string.nextLine());

            System.out.println("Informe a descrição do questionário: ");
            questionario.setDescricao(teclado_string.nextLine());

            QuestionarioController questionario_controller = new QuestionarioController();
            if(questionario_controller.cadastrarQuestionario(questionario)) System.out.println("Questionário cadastrado com sucesso!");
            main.menu();
        }catch(SQLException e){
            System.out.println("Erro no cadastro do questionário!");
            System.out.println(e.getMessage());
        }
    }
}
