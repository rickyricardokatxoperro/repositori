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
public class MyExepcio extends Exception{
    
    private int codi;
    private String missatge;

    public MyExepcio(int codi) {
        this.codi = codi;
        this.missatge = text(codi);
    }
    
   
    

    
    
    private String text(int codi){
        
        switch(codi){
            
            case 1:
                return " no es un enter";
                
                case 2:
                return " edat no valida";
                
            default:
                
                return "error desconegut";
                
        }
    }
    
    @Override
    public String getMessage(){
        
        return this.missatge;
    }
            
            
}
