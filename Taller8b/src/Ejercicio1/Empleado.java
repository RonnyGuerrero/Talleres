/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona{
    String departamento;
   
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.println("Matricula: " + departamento);
    }
}
