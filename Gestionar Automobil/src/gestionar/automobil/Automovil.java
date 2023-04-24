package gestionar.automobil;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author waska
 */
public class Automovil {
String marca;
int modelo;
int motor;
enum tipoCom {GASOLINA, BIOETANOL, DIESEL, BIODISESEL,GAS_NATURAL}
tipoCom tipoCombustible;
enum tipoA {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR,EJECUTIVO, SUV}
tipoA tipoAutomovil;
int numeroPuertas;
int cantidadAsientos;
int velocidadMaxima;
enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA,
AMARILLO, VERDE, AZUL, VIOLETA}
tipoColor color;
int velocidadActual = 0;

Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomovil, int numeroPuertas, int cantidadAsientos, int velocidadMaxima, tipoColor color){
this.marca = marca;
this.modelo = modelo;
this.motor = motor;
this.tipoCombustible = tipoCombustible;
this.tipoAutomovil = tipoAutomovil;
this.numeroPuertas = numeroPuertas;
this.cantidadAsientos = cantidadAsientos;
this.velocidadMaxima = velocidadMaxima;
this.color = color;
}
String getMarca() {
return marca;
}
int getModelo() {
return modelo;
}
int getMotor() {
return motor;
}
tipoCom getTipoCombustible() {
return tipoCombustible;
}
tipoA getTipoAutomovil() {
return tipoAutomovil;
}
int getNúmeroPuertas() {
return numeroPuertas;
}
int getCantidadAsientos() {
return cantidadAsientos;
}
int getVelocidadMaxima() {
return velocidadMaxima;
}
tipoColor getColor() {
return color;
}
int getVelocidadActual() {
return velocidadActual;
}
void setMarca(String marca) {
this.marca = marca;
}
void setModelo(int modelo) {
this.modelo = modelo;
}
void setMotor(int motor) {
this.motor = motor;
}
void setTipoCombustible(tipoCom tipoCombustible) {
this.tipoCombustible = tipoCombustible;
}
void setTipoAutomóvil(tipoA tipoAutomóvil) {
this.tipoAutomovil = tipoAutomóvil;
}
void setNúmeroPuertas(int númeroPuertas) {
this.numeroPuertas = númeroPuertas;
}
void setCantidadAsientos(int cantidadAsientos) {
this.cantidadAsientos = cantidadAsientos;
}

void setVelocidadMáxima(int velocidadMáxima) {
this.velocidadMaxima = velocidadMáxima;
}

void setColor(tipoColor color) {
this.color = color;
}

void setVelocidadActual(int velocidadActual) {
this.velocidadActual = velocidadActual;
}

void acelerar(int incrementoVelocidad) {
if (velocidadActual + incrementoVelocidad < velocidadMaxima) {
velocidadActual = velocidadActual + incrementoVelocidad;
} else {
System.out.println("No se puede Acelerar a una velocidad superior a la maxima del automovil.");
}
}
void desacelerar(int decrementoVelocidad) {
if ((velocidadActual - decrementoVelocidad) > 0) {
velocidadActual = velocidadActual - decrementoVelocidad;
} else { 
System.out.println("No se puede bajar la velocidad de 0 km/h.");
}
    
   }
void frenar() {
velocidadActual = 0;
}

double calcularTiempoLlegada(int distancia) {
return distancia/velocidadActual;
 }
void imprimir() {
System.out.println("Marca = " + marca);
System.out.println("Modelo = " + modelo);
System.out.println("Motor = " + motor);
System.out.println("Tipo de combustible = " + tipoCombustible);
System.out.println("Tipo de automóvil = " + tipoAutomovil);
System.out.println("Numero de puertas = " + numeroPuertas);
System.out.println("Cantidad de asientos = " + cantidadAsientos);
System.out.println("Velocida maxima = " + velocidadMaxima);
System.out.println("Color = " + color);
}
}

