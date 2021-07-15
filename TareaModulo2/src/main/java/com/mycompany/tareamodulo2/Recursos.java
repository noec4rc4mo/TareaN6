/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareamodulo2;

/**
 *
 * @author noec
 */
public class Recursos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Recurso recurso = new Recurso(); //Instancia
        recurso.mensaje();
        recurso.condicion(31);
        recurso.multiplicacion(10, 15);
        recurso.lista(5);
         }
    public static class Recurso {
        public void mensaje() {
            System.out.println("Programación Orientada a Objetos 2021.");
        }
        public void condicion(int edad){
          if(edad>=18){
              System.out.println("Su edad es "+ edad + ". Mayor de edad");
        }
          else{
          System.out.println("Su edad es "+ edad + ". Menor de edad");
          }
    }
        private void multiplicacion(int nu1, int nu2){
        int mult;
        mult= (int) (nu1*nu2);
        System.out.println("La multiplicación de " + nu1 + " y " + nu2 + " es " + mult);
     }
        public void lista(int nuu){
            System.out.println("Lista de " + nuu + " valores:");
            for (int i = 1; i <= nuu; i = i + 1) {
            System.out.println(i);
    }
        }
        }
  }