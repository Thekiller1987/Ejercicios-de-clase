/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecarga;

/**
 *
 * @author waska
 */
public class pedido {
   public void calcularPedido(String primerPlato, double costoPrimerPlato, String bebida, double costoBebida) {
double total = costoPrimerPlato + costoBebida;
System.out.println("El costo de " + primerPlato + " y " + bebida + " es = $" + total);
}
   public void calcularPedido(String primerPlato, double 
costoPrimerPlato, String segundoPlato, double 
costoSegundoPlato, String bebida, double costoBebida) {
double total = costoPrimerPlato + costoSegundoPlato + 
costoBebida;
System.out.println("El costo de " + primerPlato + " + " + segundoPlato + "+ " + bebida + " es = $" + total);
}
public void calcularpedido(String primerPlato, double costoPrimerPlato, String segundoPlato, double costoSegundoPlato, String bebida, 
        double costoBebida) {double total = costoPrimerPlato + costoSegundoPlato + 
costoBebida;System.out.println("El costo de " + primerPlato + "+ " + segundoPlato + " + " + bebida + " es = $" + total);
}
public void calcularPedido(String primerPlato, double costoPrimerPlato, String segundoPlato, double costoSegundoPlato, String postre, double costoPostre, String 
bebida, double costoBebida) {
double total = costoPrimerPlato + costoSegundoPlato + costoBebida + costoPostre;
System.out.println("El costo de " + primerPlato + " + " + segundoPlato + " + " + bebida + " + " + postre + " es = $" + total);
}

}
