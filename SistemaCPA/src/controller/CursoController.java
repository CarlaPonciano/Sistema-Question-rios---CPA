/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.CursoDAO;
import model.CursoDomain;

/**
 *
 * @author carli
 */
public class CursoController {
    public boolean cadastrarCurso(CursoDomain curso){
        CursoDAO curso_dao = new CursoDAO();
        return curso_dao.cadastrarCurso(curso);
    }
}
