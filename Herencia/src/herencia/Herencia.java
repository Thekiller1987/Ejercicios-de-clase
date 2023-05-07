/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author waska
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
System.out.println("Cuenta de ahorros");
System.out.println("Ingrese saldo inicial= C$");
float saldoInicialAhorros = input.nextFloat(); 
System.out.print("Ingrese tasa de interes= ");
float tasaAhorros = input.nextFloat();
CuentaAhorros cuenta1 = new 
CuentaAhorros(saldoInicialAhorros, tasaAhorros);
System.out.print("Ingresar cantidad a consignar: C$");
float cantidadDepositar = input.nextFloat();
cuenta1.consignar(cantidadDepositar);
System.out.print("Ingresar cantidad a retirar: C$");
float cantidadRetirar = input.nextFloat();
cuenta1.retirar(cantidadRetirar);
cuenta1.extractoMensual();
cuenta1.imprimir();


    }
    
}
