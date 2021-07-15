/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareamodulo3v1;

/**
 *
 * @author noec
 */
public class Ingenieros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Objeto Ingeniero
        Ingeniero ingeniero = new Ingeniero();
        ingeniero.setPrefijo("Ing.");
        ingeniero.setNombre("Noé Alexander");
        ingeniero.setApellido("Cárcamo Mendoza");
        ingeniero.setEdad(23);
        ingeniero.setSexo("M");
        ingeniero.setTitulo("Ingeniero Industrial en Producción");
        ingeniero.setTrabajo("Inspección y control de Turbomáquinas");
        ingeniero.setEmpresa("MASECA");
                
    System.out.println("Bienvenido " + ingeniero.getPrefijo() + " " + ingeniero.getNombre() + " " + ingeniero.getApellido());
    System.out.println("Sus datos son: ");
    System.out.println("Nombre: " + ingeniero.getNombre() );
    System.out.println("Apellido: " + ingeniero.getApellido() );
    System.out.println("Edad: " + ingeniero.getEdad() );
    System.out.println("Sexo: " + ingeniero.getSexo() );
    System.out.println("Título: " + ingeniero.getTitulo() );
    System.out.println("Trabajo: " + ingeniero.getTrabajo() );
    System.out.println("Empresa: " + ingeniero.getEmpresa() );    
    }
    public static class Ingeniero{
        private String prefijo;
        private String nombre;
        private String apellido;
        private int edad;
        private String sexo;
        private String titulo;
        private String trabajo;
        private String empresa;
    
//Métodos para acceder
       
        public String getPrefijo(){
            return prefijo;
        }
        public String getNombre(){
            return nombre;  
        }
        public String getApellido(){
            return apellido;  
        }
        public int getEdad(){
            return edad;  
        }
        public String getSexo(){
            return sexo;  
        }
        public String getTitulo(){
            return titulo; 
        }
        public String getTrabajo(){
            return trabajo; 
        }
        public String getEmpresa(){
            return empresa;
        }
//Métodos para establecer los datos
        
        public void setPrefijo(String prefijo){
            this.prefijo = prefijo;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setApellido(String apellido){
            this.apellido = apellido;
        }
        public void setEdad(int edad){
            this.edad = edad;
        }
        public void setSexo(String sexo){
            this.sexo = sexo;
        }
        public void setTitulo(String titulo){
            this.titulo = titulo;
        }
        public void setTrabajo(String trabajo){
            this.trabajo = trabajo;
        }
        public void setEmpresa(String empresa){
            this.empresa = empresa;
        }
    }
    }