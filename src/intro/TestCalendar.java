/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro;

import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author Mae Lindell
 */
public class TestCalendar {
    public static void main(String[] args){
        //hoy
        Calendar hoy = Calendar.getInstance() ;
         System.out.println("hoy: "+hoy.getTime());
        //monique
        Calendar monique = Calendar.getInstance();
        monique.set(1997, Calendar.MARCH, 17);
         System.out.println("Monique Nacio: "+monique.getTime());
         
         // Comparacion
         if(monique.before(hoy))
              System.out.println("Si Monique nacio antes que hoy");
         if(hoy.after(monique))
              System.out.println("Si, Hoy es despues que Monique nacio antes que hoy");
         if(monique.getTimeInMillis()<=hoy.getTimeInMillis())
             System.out.println("SiHombe! Monique nacio antes que hoy");
         
         //Valores Individuales
         System.out.println("Año de Monique"+monique.get(Calendar.YEAR));
         System.out.println("Dia de el año de Monique"+monique.get(Calendar.DAY_OF_YEAR));
         System.out.println("Mes de Monique"+monique.get(Calendar.MONTH));
         
         //Sumar o Restar
         hoy.add(Calendar.YEAR, 1);
         System.out.println("Hoy en un año"+hoy.getTime());
         hoy.add(Calendar.MONTH,-8);
         System.out.println("..Menos 8 meses"+hoy.getTime());
         
         Calendar hace10 = Calendar.getInstance();
         hace10.add(Calendar.YEAR, -10);
         
         if (monique.before(hace10));
                 System.out.println("Monique tiene mas de 10 años");
     
        //Sacar los nombres
        String diaita = monique.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ITALIAN);
        String mesita = monique.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ITALIAN);
        
        //Sacar en Español
        String diaes= monique.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.forLanguageTag("es"));
        String meses = monique.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.forLanguageTag("es"));
        
        //Sacar en Holandes
        String diahol= monique.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.forLanguageTag("nl"));
        String meshol = monique.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.forLanguageTag("nl"));
        
        System.out.println("Monique en Italiano "+diaita+"-"+mesita);
        System.out.println("Monique en Español "+diaes+"-"+meses);
        System.out.println("Monique en Holandes "+diahol+"-"+meshol);
                
    }
}
