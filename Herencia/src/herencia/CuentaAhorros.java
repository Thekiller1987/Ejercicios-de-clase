/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author waska
 */
public class CuentaAhorros extends cuenta {
private boolean activa;

public CuentaAhorros(float saldo, float tasa) {
super(saldo, tasa);
if (saldo < 10000) 
activa = false;
else
activa = true;
}

public void retirar(float cantidad) {
if (activa) 
super.retirar(cantidad); 
}

public void consignar(float cantidad) {
if (activa) 
super.consignar(cantidad);
}
public void extractoMensual() {
if (númeroRetiros > 4) {
comisiónMensual += (númeroRetiros - 4) * 1000;
}

    

super.extractoMensual();
if( saldo < 10000 );
activa = false;
}

public void imprimir() {
System.out.println("Saldo = C$ " + saldo);
System.out.println("Comisión mensual = $ " + comisiónMensual);
System.out.println("Numero de transacciones = " + (numeroConsignaciones + númeroRetiros));
System.out.println();
}
}
