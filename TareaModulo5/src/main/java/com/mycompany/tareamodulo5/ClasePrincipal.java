/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareamodulo5;

import Helpers.Circulo;
import Helpers.Cuadrado;
import Helpers.Linea;
import Helpers.Triangulo;

/**
 *
 * @author rm97h
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Circulo circulo = new Circulo();
        Linea linea = new Linea();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        
        System.out.println(circulo.obtenerInfo());
        circulo.imprimirDatos();
        System.out.println(linea.obtenerInfo());
        linea.imprimirDatos();
        System.out.println(triangulo.obtenerInfo());
        triangulo.imprimirDatos();
        System.out.println(cuadrado.obtenerInfo());
        cuadrado.imprimirDatos();
        
        
    } 
}
