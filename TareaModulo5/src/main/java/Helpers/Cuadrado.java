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
public class Cuadrado extends Formas {
    
    public Cuadrado(){
    establecerDibujar("Cuadrado");
    establecerMetodo("Calcular área");
    }

    @Override
    public String obtenerInfo() {
        return "Información";
    }
}
