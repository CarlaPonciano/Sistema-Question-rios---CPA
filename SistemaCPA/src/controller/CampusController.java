/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
}
