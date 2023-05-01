/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revista2.pkg0;

/**
 *
 * @author waska
 */
public class ArticuloCientifico {
String titulo; 
String autor;
String[]palabrasClaves = new String[2];
String publicacion;
int año; 
String resumen;

public ArticuloCientifico(String título, String autor) {
this.titulo = titulo;
this.autor = autor;
}

public ArticuloCientifico(String título, String autor, String[] palabrasClaves, String publicación, int año) {
this(título, autor);
this.palabrasClaves = palabrasClaves;
this.publicacion = publicación;
this.año = año;
}

public ArticuloCientifico(String título, String autor, String[] palabrasClaves, String publicación, int año, String resumen) {
this(título, autor, palabrasClaves, publicación, año); 
this.resumen = resumen;
}
public void imprimir() {
System.out.println("Título del artículo = " + titulo);
System.out.println("Autor del artículo = “"+ autor);
System.out.println("Palabras clave = ");
for (int x = 0; x < palabrasClaves.length;x++) {
System.out.println(palabrasClaves[x]);
}
System.out.println("Publicacion = " + publicacion);
System.out.println("Lanzamiento = " + año);
System.out.println("Resumen = " + resumen);
}
}

