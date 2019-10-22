/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author carli
 */
public class UsuarioDAO {
    public boolean persistirUsuario(){
        return true;
    }
    
    public Usuario recuperarUsuario(String usuario){
        return new Usuario();
    }
    
    public boolean excluirUsuario(String usuario){
        return true;
    }
}
