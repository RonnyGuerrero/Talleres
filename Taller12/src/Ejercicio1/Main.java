/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Libro M = new Libro("Shakespeare","ANONIMO", 1603);
        Reporte R = new Reporte();
        R.reporteLibro(M);
        
        Persistencia P = new Persistencia();
        P.guardarLibro(M);
        
    }
}
