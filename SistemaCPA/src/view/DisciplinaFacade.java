/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CursoController;
import controller.DisciplinaController;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import model.CursoDomain;
import model.DisciplinaDomain;

/**
 *
 * @author carli
 */
public class DisciplinaFacade {
    public void cadastrarDisciplina(){
        try{
            Scanner teclado_int = new Scanner(System.in);
            Scanner teclado_string = new Scanner(System.in);

            DisciplinaDomain disciplina = new DisciplinaDomain();

            System.out.println("Selecione o curso desejado: ");
            CursoController campus_controller = new CursoController();
            List<CursoDomain> lista_curso = campus_controller.recuperarCampus();
            for(CursoDomain l : lista_curso){
                System.out.println(l.getId() + " - " + l.getCurso());
            }
            disciplina.setCurso_id(teclado_int.nextInt());

            System.out.println("Informe o nome da disciplina: ");
            disciplina.setDisciplina(teclado_string.nextLine());

            System.out.println("Informe o período da disciplina: ");
            disciplina.setPeriodo(teclado_int.nextInt());

            DisciplinaController disciplina_controller = new DisciplinaController();
            if(disciplina_controller.cadastrarDisciplina(disciplina)) System.out.println("Disciplina cadastrada com sucesso!");
            main.menu();
        }catch(SQLException e){
            System.out.println("Erro no cadastro da disciplina!");
            System.out.println(e.getMessage());
        }
    }
}
