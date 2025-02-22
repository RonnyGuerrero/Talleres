/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona{
    String matricula;
    public Estudiante(String nombre, int Edad, String matricula) {
        super(nombre, Edad); 
        this.matricula = matricula;
    }
 @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.println("Matricula: " + matricula);
    }
}
