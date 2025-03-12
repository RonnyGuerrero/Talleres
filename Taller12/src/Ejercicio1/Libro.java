/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoLanzamineto;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoLanzamineto() {
        return añoLanzamineto;
    }

    public Libro(String titulo, String autor, int añoLanzamineto) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoLanzamineto = añoLanzamineto;
    }
    public String informacion(){
        return titulo + "ESCRITO " + autor +"en el " + añoLanzamineto; 
    }
}
