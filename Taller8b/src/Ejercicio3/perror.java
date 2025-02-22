/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class perror extends Error2{
    
    public perror(String nombre) {
        super(nombre);
        System.out.println(super.nombre); //nombre es privado en Animal
    }
    
}
