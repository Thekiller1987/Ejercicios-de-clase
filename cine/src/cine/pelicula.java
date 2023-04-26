/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine;

/**
 *
 * @author waska
 */
public class pelicula {
private String nombre;
private String director;
 enum tip {ACCIÓN, COMEDIA, DRAMA, SUSPENSO};
tip genero;
private int duracion;
private int año;
private double calificacion;

public pelicula(String nombre, String director, tip genero, int duracion, int año, double calificacion) {
this.nombre = nombre;
this.director = director;
this.genero = genero;
this.duracion = duracion;
this.año = año;
this.calificacion = calificacion;

}
public String getNombre() {
return nombre;
}
private void setNombre(String nombre) {
this.nombre = nombre;
}
public String getDirector() {
return director;
}
private void setDirector(String director) {
this.director = director;
}
public tip getGénero() {
return genero;
}
private void setGénero(tip género) {
this.genero = género;
}
public int getDuración() {
return duracion;
}

private void setDuracion(int duracion) {
this.duracion = duracion;
}
public int getAño() {
return año;
}
private void setAño(int año) {
this.año = año;
}
public double getCalificación() {
return año;
}
private void setCalificacion(double calificacion) {
this.calificacion = calificacion;
}
public void imprimir() {
System.out.println("Nombre: " + nombre);
System.out.println("Director: " + director);
System.out.println("Género: " + genero);
System.out.println("Duración: " + duracion);
System.out.println("Año: " + año);
System.out.println("Calificación: " + calificacion);
}
boolean esPeliculaEpica() {
if (duracion >= 180) {
return true;
} else {
return false;
}
}
private String calcularValoración() {
if (calificacion >= 0 && calificacion <= 2) { 
return "Muy mala";
} else if (calificacion > 2 && calificacion <= 5) { 
return "Mala";
} else if (calificacion > 5 && calificacion <= 7) { 
return "Regular";
} else if (calificacion > 7 && calificacion <= 8) { 
return "Buena";
} else if (calificacion > 8 && calificacion <= 10){ 
return "Excelente";
} else {
return "No tiene asignada una valoración válida";
}
}

boolean esSimilar(pelicula pelicula) {
if (pelicula.genero == genero && pelicula.calcularValoración() == calcularValoración()) {
return true;
} else {
return false;
}


}
}

