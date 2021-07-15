/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

/**
 *
 * @author rm97h
 */
public class Circulo extends Formas {
    
    //Constructor
    
    public Circulo(){
    establecerDibujar("Círculo");
    establecerMetodo("Calcular radio");
    }    

    @Override
    public String obtenerInfo() {
        return "Información";
    }
}
