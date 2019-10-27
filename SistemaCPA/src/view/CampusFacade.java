/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CampusController;
import java.util.Scanner;
import model.CampusDomain;

/**
 *
 * @author carli
 */
public class CampusFacade {
    public void cadastrarCampus(){
        Scanner teclado_string = new Scanner(System.in);
        
        CampusDomain campus = new CampusDomain();
        
        System.out.println("Informe o nome do campus:");
        campus.setCampus(teclado_string.nextLine());
        
        CampusController campus_controller = new CampusController();
        if(campus_controller.cadastrarCampus(campus)) System.out.println("Campus cadastrado com sucesso!");
        main.menu();
    }
}
