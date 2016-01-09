/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepcions;

/**
 *
 * @author ricky
 */
public class Gestor {
    
    
    public Persona crearPersona() throws MyExepcio{
        
        
        Persona per = Persona.nouPersona();
        
        if(per.getEdat()==100){
            throw new MyExepcio(0);
        }
        
        
        return per;
    }
}
