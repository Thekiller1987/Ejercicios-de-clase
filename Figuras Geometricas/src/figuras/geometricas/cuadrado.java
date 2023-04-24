/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.geometricas;

/**
 *
 * @author waska
 */
public class cuadrado {

    public cuadrado(double Area, double radio, double lado) {
        this.Area = Area;
        this.radio = radio;
        this.lado = lado;
    }
    
    
    double Area;
    double radio;
    double lado;
    
     double CalcularArea() {
  return(lado*lado);
      
     
  }
 double CalcularPerimetro(){
     return (lado*lado*lado*lado);
 
 }
 
 

    
    
}
