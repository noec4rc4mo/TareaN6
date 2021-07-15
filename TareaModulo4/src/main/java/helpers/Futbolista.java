/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author noec
 */
public class Futbolista {
    //Edad del futbolista
    private int edad;
    
    //Nombre del futbolista
    private String nombre;
    
    //Equipo actual
    private String equipoact;
    
    public void establecerEdad(int _edad){
        this.edad = _edad;
    }
    public int obtenerEdad(){
        return edad;
    }
    
    public void establecerNombre(String _nombre){
        this.nombre = _nombre;
    }
    public String obtenerNombre(){
        return nombre;
    }
    
    public void establecerEquipoact(String _equipoact){
        this.equipoact = _equipoact;
    }
    public String obtenerEquipoact(){
        return equipoact;
    }
}
