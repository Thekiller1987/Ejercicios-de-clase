    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revista;

/**
 *
 * @author waska
 */
public class Revista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] palabras = {"Física","Espacio","Tiempo"};
ArticuloCientifico articulo = new ArticuloCientifico("La teoría especial de la relatividad", "Sheldon Cooper",palabras, "La teoria ddel big ban", 2009, "La Teoria de la super asimetria.");
articulo.imprimir();
}
}
    
    


