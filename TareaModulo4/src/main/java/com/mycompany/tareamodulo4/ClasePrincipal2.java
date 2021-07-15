/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareamodulo4;

import helpers.BayernM;
import helpers.FcBarcelona;
import helpers.RealMadrid;

/**
 *
 * @author noec
 */
public class ClasePrincipal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Instanciar las clases
        
        RealMadrid realm = new RealMadrid();
        FcBarcelona fcb = new FcBarcelona();
        BayernM bayern = new BayernM();
        
        System.out.println("Parte 2: Abstracción");
        System.out.println("1. Equipo: " + realm.getEquipo() + ". Capitán: " + realm.getCapitan());
        System.out.println("2. Equipo: " + fcb.getEquipo() + ". Capitán: " + fcb.getCapitan());
        System.out.println("3. Equipo: " + bayern.getEquipo() + ". Capitán: " + bayern.getCapitan());
        
    }
    
}
