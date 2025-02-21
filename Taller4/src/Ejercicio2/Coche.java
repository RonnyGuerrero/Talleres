/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    
     public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
        }
    }
}
