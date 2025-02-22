/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona {
    public Estudiante(String nombre) {
        super(nombre);
    }

    public void mostrarNombre() {
        // Error: No se puede acceder directamente al atributo privado 'nombre'
         System.out.println("Nombre del estudiante: " + nombre); 

        // Se debe utilizar el método getter
        System.out.println("Nombre del estudiante: " + getNombre()); 
    }
}