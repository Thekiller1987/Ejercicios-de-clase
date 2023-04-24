/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author waska
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 CuentaBancaria cuenta = new CuentaBancaria("waskar","Rios",524289284,CuentaBancaria.tipo.CORRIENTE);
cuenta.imprimir();
cuenta.depositar(780000);
cuenta.depositar(45182);
cuenta.retirar(90000);
System.out.println("Apartir de aqui inicia el segundo ejercicio");
System.out.println("------------------------------------------------------------- ");
CuentaBancaria cuenta2 = new CuentaBancaria("Pablo","Bonilla",555586642,CuentaBancaria.tipo.CORRIENTE);
cuenta.depositar(0);
cuenta2.depositar(100000);
System.out.println("------------------------------------------------------------- ");
cuenta.compararCuentas(cuenta2);
cuenta.transferencia(cuenta2,50000);
System.out.println("------------------------------------------------------------- ");
cuenta.consultarSaldo();
cuenta2.consultarSaldo();

}
    }
    
    
    
