/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecarga;

/**
 *
 * @author waska
 */
public class Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pedido pedido1 = new pedido();pedido1.calcularPedido("Sancocho", 5000, "Gaseosa", 2000);
pedido pedido2 = new pedido();
pedido2.calcularPedido("Crema de verduras", 3000, "Churrasco", 6300, "Gaseosa", 2300);
pedido pedido3 = new pedido();
pedido3.calcularPedido("Crema de hongos", 1000,"Sapote",30000,"postre",500,"Gaseosa",2000);
}
    }
    

