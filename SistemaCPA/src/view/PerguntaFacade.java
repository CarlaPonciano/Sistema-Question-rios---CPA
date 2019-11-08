/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Questionario.TipoQuestionario.TipoPergunta.Pergunta.PerguntaController;
import controller.Questionario.TipoQuestionario.TipoPergunta.TipoPerguntaController;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import model.Questionario.TipoQuestionario.TipoPergunta.Pergunta.PerguntaDomain;
import model.Questionario.TipoQuestionario.TipoPergunta.TipoPerguntaDomain;

/**
 *
 * @author amanda
 */
public class PerguntaFacade {
    public void cadastrarPergunta(){
        try{
            Scanner teclado_int = new Scanner(System.in);
            Scanner teclado_string = new Scanner(System.in);

            PerguntaDomain pergunta = new PerguntaDomain();
            
            TipoPerguntaDomain tipo_pergunta = new TipoPerguntaDomain();

            System.out.println("Selecione o tipo da questão: ");
            TipoPerguntaController tipo_pergunta_controller = new TipoPerguntaController();
            List<TipoPerguntaDomain> lista_tipo_pergunta = tipo_pergunta_controller.recuperarTipoPergunta();
            for(TipoPerguntaDomain l : lista_tipo_pergunta){
                System.out.println(l.getId() + " - " + l.getTipo());
            }
            tipo_pergunta.setId(teclado_int.nextInt());
            pergunta.setTipoPergunta(tipo_pergunta);

            System.out.println("Informe a questão: ");
            pergunta.setPergunta(teclado_string.nextLine());

            PerguntaController pergunta_controller = new PerguntaController();
            if(pergunta_controller.cadastrarPergunta(pergunta)) 
                System.out.println("Questão cadastrada com sucesso!");
            main.menu();
        }catch(SQLException e){
            System.out.println("Erro no cadastro da questão!");
            System.out.println(e.getMessage());
        }
        main.menu();
    }
    
    public void recuperarPerguntas(){
        try{
            PerguntaController pergunta_controller = new PerguntaController();
            List<PerguntaDomain> lista_pergunta = pergunta_controller.recuperarPerguntas();
            for(PerguntaDomain l : lista_pergunta){
                System.out.println(l.getId() + " - " + l.getPergunta()
                                 + "\n Tipo: " + l.getTipoPergunta().getTipo());
            }
        }catch(SQLException e){
            System.out.println("Erro ao recuperar perguntas!");
            System.out.println(e.getMessage());
        }
        main.menu();
    }
}
