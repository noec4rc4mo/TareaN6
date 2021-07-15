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
public abstract class Formas {
    
    // Atributos
    
   private String color;
   String dibujar;
   String metodo;
    
   public Formas(){
       //Constructor sin parámetros
       establecerColor("Rojo");
   }
   //Métodos públicos
   public void establecerColor(String color){
       this.color = color;
   }
   public String obtenerColor(){
       return this.color;
   }
   public void establecerDibujar(String dibujar){
       this.dibujar = dibujar;
   }
   public String obtenerDibujar(){
       return this.dibujar;
   }
   public void establecerMetodo(String metodo){
       this.metodo = metodo;
   }
   
   public void imprimirDatos(){
       System.out.println("Dibujar: " + dibujar);
       System.out.println("Color: " + color);
       System.out.println("Método: " + metodo);
   }
   
   abstract String obtenerInfo();
}
