/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enunciado.planeta;

/**
 *
 * @author waska
 */
public class EnunciadoPlaneta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 planeta tierra = new planeta("Tierra",1,5.9736E24,1.08321E12,12742,150000000,planeta.tipoPlaneta.TERRESTRE,true);
tierra.imprimirdatos();
System.out.println("Densidad del planeta = " + tierra.calcularDensidad());
System.out.println("Es planeta exterior = " +tierra.CalcularPlanetaExterior());
System.out.println();
planeta Jupiter = new planeta("Jupiter",79,1.899E27,1.4313E15,139820,750000000,planeta.tipoPlaneta.GASEOSO,true);
Jupiter.imprimirdatos();
System.out.println("Densidad del planeta = " +Jupiter.calcularDensidad());
System.out.println("Es planeta exterior = " +Jupiter.CalcularPlanetaExterior());

    }
    
}
