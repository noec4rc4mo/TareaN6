/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author noec
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        //Declaración de variables
        double suma, resta, multi, div1 = 0, div2 = 0;
        double numero1=20;
        double numero2=15;
        double numero3=10;
        double numero4=5;
        
        //Operaciones
        suma=numero1+numero2+numero3+numero4;
        resta=numero1-numero2-numero3-numero4;
        multi=numero1*numero2*numero3*numero4;
        
        if (numero2!=0){
          div1=numero1/numero2;
        }
       if(numero4!=0){
        div2=numero3/numero4;
       }
       
       System.out.println("La suma es " + suma);
       System.out.println("La resta es " + resta);
       System.out.println("La multiplicación es " + multi);
       System.out.println("La división entre n1 y n2 es " + div1);
       System.out.println("La división entre n3 y n4 es " + div2);
    }
    
}
