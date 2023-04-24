/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.geometricas;

/**
 *
 * @author waska
 */
public class Triangulo {

    public Triangulo(double base, double altura, double area, double radio, double hipotenusa) {
        this.base = base;
        this.altura = altura;
        this.area = area;
        this.radio = radio;
        this.hipotenusa = hipotenusa;
    }
  double base,altura;
  double area,radio;
double hipotenusa;    
    
    
    
      double CalcularArea() {
  return(base*altura/2);
      
     
  }
 double CalcularPerimetro(){
 return (base+altura+CalcularHipotenusa());
 
 }
 
 
     double CalcularHipotenusa(){
 return Math.pow(base*base+altura*altura,0.5);
 
 }

     void tipoTriangulo(){
         if (base == altura && altura == CalcularHipotenusa()) {
        System.out.println("El Triangulo es Equilátero");
    } else if (altura == base|| altura == CalcularHipotenusa()|| base == CalcularHipotenusa()) {
             System.out.println("El Triangulo es Isósceles"); 
    } else {
            System.out.println("El Triangulo es Escaleno"); 
    }
     }

    
}
