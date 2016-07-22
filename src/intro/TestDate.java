/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.Date;

/**
 *
 * @author Mae Lindell
 */
public class TestDate {
    public static void main(String[] args){
        Date hoy = new Date();
        //imprimir
        System.out.print("hoy: "+hoy+"en mili: "+hoy.getTime());
        //segundos
        long m = 568542365;
        Date antes = new Date(m);
         System.out.print("hoy: "+hoy+"en mili: "+hoy.getTime());
        
    }
}
