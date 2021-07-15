/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareamodulo4;

import helpers.Futbolista;

/**
 *
 * @author noec
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instanciar la clase futbolista
        Futbolista futbolista = new Futbolista();
        
        System.out.println("Parte 1: Encapsulamiento");
        
        futbolista.establecerEdad(31);
        System.out.println("La edad es: " + futbolista.obtenerEdad());
        
        futbolista.establecerNombre("Aaron Ramsey");
        System.out.println("Su nombre es: " + futbolista.obtenerNombre());
        
        futbolista.establecerEquipoact("Juventus FC");
        System.out.println("Su equipo actual es: " + futbolista.obtenerEquipoact());
        
    }
    
}
