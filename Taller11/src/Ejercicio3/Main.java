/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class Main {
     public static void main(String[] args) {
        // Referencia de tipo clase base que apunta a un objeto de clase derivada
        Animal miAnimal = new Perro();
        
        // Esto funciona porque el método existe en la clase base
        miAnimal.comer();
        
        // Esto genera un error de compilación
        miAnimal.ladrar(); // Error: cannot find symbol
    }
}
