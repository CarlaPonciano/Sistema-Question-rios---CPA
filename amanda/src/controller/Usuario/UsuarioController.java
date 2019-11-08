/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Usuario;

import model.Usuario.UsuarioDAO;
import model.Usuario.UsuarioDomain;

/**
 *
 * @author amanda
 */
public class UsuarioController {
    public boolean persistirUsuario(UsuarioDomain usuario){
        UsuarioDAO usuario_dao = new UsuarioDAO();
        return usuario_dao.persistirUsuario(usuario);
    }
    
    public boolean atualizarUsuario(UsuarioDomain usuario){
        UsuarioDAO usuario_dao = new UsuarioDAO();
        return usuario_dao.atualizarUsuario(usuario);
    }
    
    public UsuarioDomain recuperarUsuario(UsuarioDomain usuario){
        UsuarioDAO usuario_dao = new UsuarioDAO();
        return usuario_dao.recuperarUsuario(usuario);
    }
    
    public boolean inativarUsuario(UsuarioDomain usuario){
        UsuarioDAO usuario_dao = new UsuarioDAO();
        return usuario_dao.inativarUsuario(usuario);
    }
    
    public boolean ativarUsuario(UsuarioDomain usuario){
        UsuarioDAO usuario_dao = new UsuarioDAO();
        return usuario_dao.ativarUsuario(usuario);
    }
    
    public boolean login(UsuarioDomain usuario){
        UsuarioDAO usuario_dao = new UsuarioDAO();
        return usuario_dao.login(usuario);
    }
}
