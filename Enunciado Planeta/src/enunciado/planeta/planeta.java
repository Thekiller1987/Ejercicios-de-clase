/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enunciado.planeta;

/**
 *
 * @author waska
 */
public class planeta {

    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diámetro = 0;
    int distanciaSol = 0;

    enum tipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }
    tipoPlaneta tipoP;
    boolean esObservable = false;

    planeta(String nombrep, int cantidadSP, double masap, double volumenp, int diametrop, int disSp, tipoPlaneta tipoP, boolean Obs) {
        this.nombre = nombrep;
        this.cantidadSatelites = cantidadSP;
        this.masa = masap;
        this.volumen = volumenp;
        this.diámetro = diametrop;
        this.distanciaSol = disSp;
        this.tipoP = tipoP;
        this.esObservable = Obs;

    }

    void imprimirdatos() {
System.out.println("Nombre del planeta = " + nombre);
System.out.println("Cantidad de satélites = " + cantidadSatelites);
System.out.println("Masa del planeta =  "+ masa);
System.out.println("Volumen del planeta = " + volumen);
System.out.println("Diámetro del planeta = " + diámetro);
System.out.println("Distancia al sol = " + distanciaSol);
System.out.println("Tipo de planeta = " + tipoP);
System.out.println("Es observable =  "+ esObservable);
}
    double calcularDensidad() {
        return masa / volumen;
    }
boolean CalcularPlanetaExterior(){
    
float límite = (float) (149597870 * 3.4);
if (distanciaSol > límite) {
return true;
} else {
return false;
}


}


}


