/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class main {
    
    static void menu(){
        int op2;
        Scanner teclado_int = new Scanner(System.in);
        System.out.println("");
        System.out.println("Sistema CPA");
        System.out.println("-----MENU-----");
        System.out.println("1 - Meu perfil");
        System.out.println("2 - Cadastrar campus, cursos e disciplinas");
        int op = teclado_int.nextInt();
        
        switch (op){
            case 1:
                UsuarioFacade usuario_facade = new UsuarioFacade();
                System.out.println("1 - Cadastrar perfil");
                System.out.println("2 - Login");
                System.out.println("3 - Editar perfil");
                System.out.println("4 - Visualizar perfil");
                System.out.println("5 - Inativar perfil");
                System.out.println("6 - Ativar perfil");
                op2 = teclado_int.nextInt();
                switch (op2){
                    case 1:
                        usuario_facade.persistirUsuario();
                        break;
                    case 2:
                        break;
                    case 3:
                        usuario_facade.editarUsuario();
                        break;
                    case 4:
                        usuario_facade.recuperarUsuario();
                        break;
                    case 5:
                        usuario_facade.inativarUsuario();
                        break;
                    case 6:
                        usuario_facade.ativarUsuario();
                        break;
                }
            case 2:
                System.out.println("1 - Cadastrar Campus");
                System.out.println("2 - Cadastrar Curso");
                System.out.println("3 - Cadastrar Disciplina");
                op2 = teclado_int.nextInt();
                switch (op2){
                    case 1:
                        CampusFacade campus_facade = new CampusFacade();
                        campus_facade.cadastrarCampus();
                        break;
                    case 2:
                        CursoFacade curso_facade = new CursoFacade();
                        curso_facade.cadastrarCurso();
                        break;
                    case 3:
                        DisciplinaFacade disciplina_facade = new DisciplinaFacade();
                        disciplina_facade.cadastrarDisciplina();
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                        break;
                }
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
    
    public static void main(String[] args) {
        menu();
    }
}
