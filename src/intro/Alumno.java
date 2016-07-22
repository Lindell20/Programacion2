/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

/**
 *
 * @author Mae Lindell
 */
public class Alumno {
    //Atributos
    private String nombre;
    
    //Constructor
    public Alumno(String nombre){
        this.nombre = nombre;
    }
    
    //funciones
    public String getNombre(){
        return nombre;
    }
    
    public setNombre(){
        
            }
    
    public void print(){
        System.out.println(nombre);
    }
}
