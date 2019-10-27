/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.UsuarioDAO;
import model.UsuarioDomain;

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
    
    public UsuarioDomain recuperarUsuario(String usuario){
        UsuarioDAO usuario_dao = new UsuarioDAO();
        return usuario_dao.recuperarUsuario(usuario);
    }
    
    public boolean inativarUsuario(String usuario){
        UsuarioDAO usuario_dao = new UsuarioDAO();
        return usuario_dao.inativarUsuario(usuario);
    }
    
    public boolean ativarUsuario(String usuario){
        UsuarioDAO usuario_dao = new UsuarioDAO();
        return usuario_dao.ativarUsuario(usuario);
    }
}
