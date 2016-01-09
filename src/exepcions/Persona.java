/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepcions;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricky
 */
public class Persona implements Comparable<Persona>{
    
    public static final int MIN_EDAT=18;
    private static int numPersones=0;
    private int id;
    private String nom;
    private int edat;
    
    {
        numPersones++;
        
    }

    public Persona(String nom) {
        
        
        this.id = numPersones;
        this.nom = nom;
        this.edat = setEdat();
    }

    public int getEdat() {
        return edat;
    }
    
    
    public static Persona nouPersona(){
        Scanner lector = new Scanner(System.in);
        
        System.out.println("nom?");
        return new Persona(lector.nextLine());
        
    }

   
    
    public int setEdat(){
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("edat");
        
        int edat = 0;
        try{
            edat = lector.nextInt();
        }
        catch(Exception e){
            
            
            try {
                throw new MyExepcio(1);
            } catch (MyExepcio ex) {
                System.out.println(ex.getMessage());
                edat = setEdat();
            }
        }
        
        if(edat<MIN_EDAT){
            
            try {
                throw new MyExepcio(2);
            } catch (MyExepcio ex) {
                System.out.println(ex.getMessage());
                edat = setEdat();
            }
        }
        
        
        return edat;
        
        
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nom=" + nom + ", edat=" + edat + '}';
    }

    @Override
    public int compareTo(Persona o) {
        return this.nom.compareTo(o.nom);
    }
    
    
}
