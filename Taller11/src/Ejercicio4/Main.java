/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Usuario
 */
public class Main {
     public static void main(String[] args) {
  
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo coche = new Coche();
        Vehiculo bicicleta = new Bicicleta();
        
        vehiculo.mover();
        coche.mover();
        bicicleta.mover();
    }
}
