/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author carli
 */
public class CampusDAO {
    public boolean cadastrarCampus(CampusDomain campus){
        String sql = "INSERT INTO cpa.campus(campus) VALUES (" + campus.getCampus() + ");";
        try{
            Connection con = ConnectionPostgreSQL.getInstance().getConnection();
            Statement stm = con.createStatement();
            stm.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println("Erro no cadastro do campus!");
            System.out.println(e.getMessage());
        }
        return false;
    }
}
