/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class Coche {
    String marca;
    String modelo;
    static int contadoCoches;
        
    public Coche(){
        contadoCoches++;
    }
    public static void mostrar() {
        System.out.println("Coches= "+contadoCoches);
    }
}
