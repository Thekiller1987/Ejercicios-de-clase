/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.geometricas;

/**
 *
 * @author waska
 */
public class Circulo {
    
    float radio;
    public Circulo(float radio) {
    this.radio = radio;    
        
    }
    
  double CalcularArea() {
  return Math.pow(radio,2);
      
     
  }
 double CalcularPerimetro(){
     return (2*Math.PI*radio);
 
 }
 
 

}
    
    

