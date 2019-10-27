/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CampusController;
import controller.CursoController;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import model.CampusDomain;
import model.CursoDomain;

/**
 *
 * @author carli
 */
public class CursoFacade {
    public void cadastrarCurso(){
        try{
            Scanner teclado_int = new Scanner(System.in);
            Scanner teclado_string = new Scanner(System.in);

            CursoDomain curso = new CursoDomain();

            System.out.println("Selecione o Campus desejado: ");
            CampusController campus_controller = new CampusController();
            List<CampusDomain> lista_campus = campus_controller.recuperarCampus();
            for(CampusDomain l : lista_campus){
                System.out.println(l.getId() + " - " + l.getCampus());
            }
            curso.setCampus_id(teclado_int.nextInt());

            System.out.println("Informe o nome do curso: ");
            teclado_string.reset();
            String nome_curso = teclado_string.nextLine();
            curso.setCurso(nome_curso);

            CursoController curso_controller = new CursoController();
            if(curso_controller.cadastrarCurso(curso)) System.out.println("Curso cadastrado com sucesso!");
            main.menu();
        }catch(SQLException e){
            System.out.println("Erro no cadastro do curso!");
            System.out.println(e.getMessage());
        }
    }
}
