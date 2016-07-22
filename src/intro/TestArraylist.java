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
public class TestArraylist {
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>();
        
        /*
        Agregar Valores
        array[x] = Valor;
        */
        lista.add("Carlos");
        lista.add("Jose");
        lista.add("Alejandro");
        
        /*
        Imprimir con foreach
        */
        for(String cad : lista){
        System.out.println("-"+cad);
        }
        
        /*
        Imprimir con un for normal
            size en normal: array.length
        */
        System.out.println("\n---- for normal");
        int size = lista.size();
        for(int p=0;p<size;p++){
            System.out.println("-"+lista.get(p));
        }
        
        /*
        Agregar en una posicion especifico
        */
        lista.add(2,"Kevin");
        System.out.println("\nAgregar en una posicion especifica");
        for(String cad : lista){
        System.out.println("-"+cad);
        }
        
        /*
        Modificar el valor de una posicion
        */
        lista.set(0,"Gochez");
        System.out.println("\nModificar en una posicion especifica");
        for(String cad : lista){
        System.out.println("-"+cad);
        }
        /*
        Remover Valores
        */
        
        lista.remove(1);
        System.out.println("\nREmover en una posicion especifica");
        for(String cad : lista){
        System.out.println("-"+cad);
        }
       
        /*
        Buscar valores
            PERO OJO: soll funciona con valores primitivos o clases k han modificado su funcion equals()
            como la String
        */
        
        if(lista.contains("Alejandro"))
            System.out.println("Si, Tiene guardado Alejangrdo");
        
    }
}
