/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.ArrayList;

/**
 *
 * @author Mae Lindell
 */
public class TestArraylist2 {
    public static void main(String[] args){
    //no puedo crear arreglos usando tipos premitivo
    ArrayList<Integer> numeros = new ArrayList<>();
    numeros.add(8);
    numeros.add(-5);
    
    ArrayList<Character> caras = new ArrayList<>();
    caras.add('H');
    
    ArrayList<Alumno> als = new ArrayList<>();
    als.add(new Alumno("Frances"));
    als.add(new Alumno("Mae"));
    als.add(new Alumno("Monique"));
    als.add(new Alumno("Maria"));
    
    for(Alumno a: als)
        a.print();
    
    //1-Agreguen un nuevo alumno en la posicion 1
    als.add(1, new Alumno("Monica"));
        for(Alumno cad : als){
        System.out.println("-"+cad);
        }
        
    //2-Haga una busqueda propia para ver si esta el alumno Alicia
    boolean busq = true;
        for(Alumno a : als){
            if(a.getNombre().equals("Alicia")){
                System.out.println("Esta Alicia!");
            }
        }
    
    //3-Modifique el nombre de alumno en la pos3
        als.get(3).setNombre("Monic");
        
        for(Alumno a : als)
            a.print();
    }
}
