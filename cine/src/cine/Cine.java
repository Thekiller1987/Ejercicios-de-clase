/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cine;
/**
 *
 * @author waska
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
pelicula pelicula1 = new pelicula("FNAF", "SCOTT CAUTOWN",pelicula.tip.ACCIÓN,187,1997,9.2);
pelicula pelicula2 = new pelicula("YOUR NAME", "MAKOTO SHINKAI", pelicula.tip.COMEDIA, 132,2012,8.0);
pelicula1.imprimir();
System.out.println();
pelicula2.imprimir();
System.out.println();
System.out.println("La película " + pelicula1.getNombre() + " es épica: " + pelicula1.esPeliculaEpica());
System.out.println("La película " + pelicula2.getNombre() + " es épica: " + pelicula2.esPeliculaEpica());
System.out.println("La película " + pelicula1.getNombre() + " y la película " + pelicula2.getNombre() + " son similares = " +pelicula1.esSimilar(pelicula2));


}
}
    
