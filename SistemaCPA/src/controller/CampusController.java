/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CampusDAO;
import model.CampusDomain;

/**
 *
 * @author carli
 */
public class CampusController {
    public boolean cadastrarCampus(CampusDomain campus){
        CampusDAO campus_dao = new CampusDAO();
        return campus_dao.cadastrarCampus(campus);
    }
    
    public List<CampusDomain> recuperarCampus() throws SQLException{
        CampusDAO campus_dao = new CampusDAO();
        CampusDomain campus;
        
        List<CampusDomain> lista_campus = new ArrayList();
        ResultSet rs =  campus_dao.recuperarCampus();
        while(rs.next()){
            campus = new CampusDomain();
            campus.setId(rs.getInt("id"));
            campus.setCampus(rs.getString("campus"));
            lista_campus.add(campus);
        }
        return lista_campus;
    }
}
