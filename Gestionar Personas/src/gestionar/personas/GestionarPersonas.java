/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionar.personas;

/**
 *
 * @author waska
 */
public class GestionarPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       persona objetoPersona = new persona(" Juan"," Romero"," 121-200804-1003T", 1987," Nicaragua" , 'H');
        objetoPersona.imprimir();
      
       persona Presidente= new persona("  Aquiles"," Otero"," 121-10994-1003T", 1999,"El salvador" , 'H');
       Presidente.imprimir();
    }
    
}
