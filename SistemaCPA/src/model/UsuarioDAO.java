/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author carli
 */
public class UsuarioDAO {
    public boolean persistirUsuario(UsuarioDomain usuario){
        String sql = "INSERT INTO usuario(nome, sobrenome, email, usuario, senha, ativo) VALUES "
                        + "('" + usuario.getNome() + "', '" + usuario.getSobrenome() + "', '"
                        + usuario.getEmail() + "', '" + usuario.getUsuario() + "', '" + usuario.getSenha() + "', 1);";
        System.out.println(sql);
        try{
            Connection con = ConnectionPostgreSQL.getInstance().getConnection();
            Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            return true;
        }catch(SQLException e){
            System.out.println("Erro no cadastro do usuário!");
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean atualizarUsuario(UsuarioDomain usuario){
        String sql = "UPDATE usuario"
                    + " SET nome = '" + usuario.getNome() + "', sobrenome = '" + usuario.getSobrenome() + "', email = '" + usuario.getEmail() + "', senha = '" + usuario.getSenha() + "'"
                    + " WHERE usuario = '" + usuario.getUsuario() + "';";
        try{
            Connection con = ConnectionPostgreSQL.getInstance().getConnection();
            Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            return true;
        }catch(SQLException e){
            System.out.println("Erro no atualizar o usuário!");
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public UsuarioDomain recuperarUsuario(String usuario){
        UsuarioDomain u = null;
        String sql = "SELECT * FROM usuario"
                    + " WHERE usuario = '" + usuario + "';";
        try{
            Connection con = ConnectionPostgreSQL.getInstance().getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            String nome = rs.getString("nome");
            String sobrenome = rs.getString("sobrenome");
            String email = rs.getString("email");
            String senha = rs.getString("senha");
            int ativo = rs.getInt("ativo");
            u = new UsuarioDomain (nome, sobrenome, email, senha, usuario, ativo);
            return u;
        }catch(SQLException e){
            System.out.println("Erro na recuperação do usuário!");
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public boolean inativarUsuario(String usuario){
        String sql = "UPDATE usuario"
                    + " SET ativo = 0"
                    + " WHERE usuario = '" + usuario + "'";
        try{
            Connection con = ConnectionPostgreSQL.getInstance().getConnection();
            Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            return true;
        }catch(SQLException e){
            System.out.println("Erro ao inativar o usuário!");
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean ativarUsuario(String usuario){
        String sql = "UPDATE usuario"
                    + " SET ativo = 1"
                    + " WHERE usuario = '" + usuario + "'";
        try{
            Connection con = ConnectionPostgreSQL.getInstance().getConnection();
            Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            return true;
        }catch(SQLException e){
            System.out.println("Erro ao ativar o usuário!");
            System.out.println(e.getMessage());
            return false;
        }
    }
}
