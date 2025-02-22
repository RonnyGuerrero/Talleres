/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Persona {
    String nombre;
    int Edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.Edad = edad;
    }
         public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + Edad);
    }
}
