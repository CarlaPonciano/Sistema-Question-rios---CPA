/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsuarioController;
import java.sql.SQLException;
import java.util.Scanner;
import model.UsuarioDomain;

/**
 *
 * @author amanda
 */
public class UsuarioFacade {
    
    public void persistirUsuario(){
        Scanner teclado_string = new Scanner(System.in);

        UsuarioDomain usuario = new UsuarioDomain();

        System.out.println("Informe o nome: ");
        usuario.setNome(teclado_string.nextLine());

        System.out.println("Informe o sobrenome: ");
        usuario.setSobrenome(teclado_string.nextLine());

        System.out.println("Informe o e-mail: ");
        usuario.setEmail(teclado_string.nextLine());

        System.out.println("Informe o nome de usuário: ");
        usuario.setUsuario(teclado_string.nextLine());

        System.out.println("Informe a senha: ");
        usuario.setSenha(teclado_string.nextLine());

        UsuarioController usuario_controller = new UsuarioController();
        if(usuario_controller.persistirUsuario(usuario)) 
            System.out.println("Usuário cadastrado com sucesso!");
        main.menu();
    }
    
    public void editarUsuario(){
        Scanner teclado_string = new Scanner(System.in);

        UsuarioDomain usuario = new UsuarioDomain();
        
        System.out.println("Informe o nome de usuário do perfil que deseja editar: ");
        usuario.setUsuario(teclado_string.nextLine());

        System.out.println("Informe o novo nome: ");
        usuario.setNome(teclado_string.nextLine());

        System.out.println("Informe o novo sobrenome: ");
        usuario.setSobrenome(teclado_string.nextLine());

        System.out.println("Informe o novo e-mail: ");
        usuario.setEmail(teclado_string.nextLine());

        System.out.println("Informe a nova senha: ");
        usuario.setSenha(teclado_string.nextLine());

        UsuarioController usuario_controller = new UsuarioController();
        if(usuario_controller.atualizarUsuario(usuario)) 
            System.out.println("Usuário atualizado com sucesso!");
        main.menu();
    }
    
    public void recuperarUsuario(){
        Scanner teclado_string = new Scanner(System.in);
        UsuarioDomain u = new UsuarioDomain();
        
        System.out.println("Informe o nome de usuário: ");
        String usuario = teclado_string.nextLine();
        u.setUsuario(usuario);
        
        UsuarioController usuario_controller = new UsuarioController();
        u = usuario_controller.recuperarUsuario(u);
        
        System.out.println("");
        
        System.out.println("Nome: " + u.getNome() + " " + u.getSobrenome());
        System.out.println("E-mail: " + u.getEmail());
        System.out.println("Nome de usuário: " + u.getUsuario());
        System.out.print("Ativo: ");
        
        if (u.getAtivo() == 1) 
            System.out.println("Sim");
        else
            System.out.println("Não");
        
        System.out.println("");
        
        main.menu();
    }
    
    public void inativarUsuario(){
        Scanner teclado_string = new Scanner(System.in);
        UsuarioDomain u = new UsuarioDomain();
        
        System.out.println("Informe o nome de usuário: ");
        String usuario = teclado_string.nextLine();
        u.setUsuario(usuario);
        
        UsuarioController usuario_controller = new UsuarioController();
        if(usuario_controller.inativarUsuario(u)) 
            System.out.println("Usuário inativado com sucesso!");
        
        main.menu();
    }
    
    public void ativarUsuario(){
        Scanner teclado_string = new Scanner(System.in);
        UsuarioDomain u = new UsuarioDomain();
        
        System.out.println("Informe o nome de usuário: ");
        String usuario = teclado_string.nextLine();
        u.setUsuario(usuario);
        
        UsuarioController usuario_controller = new UsuarioController();
        if(usuario_controller.ativarUsuario(u)) 
            System.out.println("Usuário ativado com sucesso!");
        
        main.menu();
    }
    
    public void login(){
        Scanner teclado_string = new Scanner(System.in);
        UsuarioDomain u = new UsuarioDomain();
        
        System.out.println("Informe o nome de usuário: ");
        String usuario = teclado_string.nextLine();
        u.setUsuario(usuario);
        
        System.out.println("Informe a senha: ");
        String senha = teclado_string.nextLine();
        u.setSenha(senha);
        
        UsuarioController usuario_controller = new UsuarioController();
        if(usuario_controller.login(u)) 
            System.out.println("Login realizado com sucesso!.");
        else
            System.out.println("Dados incorretos!");
        
        main.menu();
    }
}
