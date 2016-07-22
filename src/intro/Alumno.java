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
    private double promedio;
    //Constructor
    public Alumno(String nombre){
        this.nombre = nombre;
    }
    
    //funciones
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
            }
    
    public void print(){
        System.out.println(nombre);
    }
}
