/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class prueba {
    public static void main(String[] args) {
        Vehiculo vehiculo=new Vehiculo();
        Vehiculo moto=new Moto();
        
        
        System.out.println(""+vehiculo.marca);
        System.out.println(""+moto.cilindrica);
        
        //Intento de acceso a miembros protected desde una clase no relacionada
    }
}
