/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author waska
 */
public class CuentaBancaria {

String nombresTitular;
String apellidosTitular;
int númeroCuenta;
enum tipo {AHORROS, CORRIENTE}
tipo tipoCuenta;
float saldo = 0;

CuentaBancaria(String nombresTitular, String apellidosTitular, int
numeroCuenta, tipo tipoCuenta) {

this.nombresTitular = nombresTitular;
this.apellidosTitular = apellidosTitular;
this.númeroCuenta = numeroCuenta;
this.tipoCuenta = tipoCuenta;
}

void imprimir() {
System.out.println("Nombres del titular = " + nombresTitular);
System.out.println("Apellidos del titular = " + apellidosTitular);
System.out.println("Numero de cuenta = " + númeroCuenta);
System.out.println("Tipo de cuenta = " + tipoCuenta);
System.out.println("Saldo = " + saldo);
}

void consultarSaldo() {
System.out.println("El saldo actual de la cuenta es = " + saldo);
}

boolean depositar(int valor) {
if (valor > 0) {
saldo = saldo + valor; 
System.out.println("Se ha depositado C$" + valor + " en la cuenta. El nuevo saldo es C$" + saldo);
return true;
} else {
System.out.println("El valor a depositado debe ser mayor que cero.");
return false;
}
}
boolean retirar(int valor) {
if ((valor > 0) && (valor <= saldo)) {
saldo = saldo - valor; 
System.out.println("Se ha retirado $" + valor + " en la cuenta." );
 System.out.println("El  saldo actual de la cuenta es C$" + saldo);
 return true;
} else {
System.out.println("El valor a retirar debe ser menor que el saldo actual.");
return false;
}
          }
void compararCuentas(CuentaBancaria cuenta) {
if (saldo >= cuenta.saldo) {
System.out.println("El saldo de la cuenta actual es mayor o igual al saldo de la cuenta pasada como parametro.");
} else {
System.out.println("El saldo de la cuenta actual es menor al saldo de la cuenta pasada como parametro.");
 }
}
void transferencia(CuentaBancaria cuenta, int valor) {
if (retirar(valor)) { 
    
}
cuenta.depositar(valor); 
}
}
    
