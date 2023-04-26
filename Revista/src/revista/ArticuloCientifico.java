/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revista;

/**
 *
 * @author waska
 */
public class ArticuloCientifico {
    
String titulo; 
String autor; 
String[] palabrasClaves = new String[3];
String publicacion; 
int año; 
String resumen; 

public ArticuloCientifico(String titulo, String autor) {
this.titulo = titulo;
this.autor = autor;
}
public ArticuloCientifico(String título, String autor, String[] palabrasClaves, String publicación, int año) {
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
System.out.println("Título del artículo =  "+ titulo);
System.out.println("Autor del artículo = " + autor);
System.out.println("Palabras clave = ");
for (int i = 0; i < palabrasClaves.length; i++) {
System.out.println(palabrasClaves[i]);
}
System.out.println("Publicacion = " + publicacion);
System.out.println("Año = " + año);
System.out.println("Resumen = " + resumen);
}

}
