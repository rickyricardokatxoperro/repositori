/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepcions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricky
 */
public class Exepcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gestor g = new Gestor();
        
        try {
            g.crearPersona();
        } catch (MyExepcio ex) {
            System.out.println(ex);
        }
        
        List<Persona> ls = new ArrayList<Persona>();
        
        
        ls.add(Persona.nouPersona());
        ls.add(Persona.nouPersona());
        
        Collections.sort(ls, new Comparator<Persona>() {

            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getEdat()-o2.getEdat();
            }
        });
        
        Iterator<Persona> it = ls.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
