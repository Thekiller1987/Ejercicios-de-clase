/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.geometricas;

/**
 *
 * @author waska
 */
public class rectangulo {

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;

    }
    double base;
    double altura;

  double CalcularArea() {
  return(base*altura);
      
     
  }
 double CalcularPerimetro(){
 return (2*base+2*altura);
 
 }
 
 
    
    
    
}
