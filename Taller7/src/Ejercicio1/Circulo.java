/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class Circulo extends Figura {
  
    private double area;
    @Override
    public void calcularArea() {
        System.out.println("El área del círculo es: " + area);
    }
}