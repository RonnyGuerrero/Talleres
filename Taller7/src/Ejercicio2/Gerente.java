/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import Ejercicio1.Figura;

/**
 *
 * @author Usuario
 */
public class Gerente extends Empleado{
     private String nombre;
    
    @Override
    public void calcularSalario(){
    System.out.println("nombre= "+nombre);
    }
}


