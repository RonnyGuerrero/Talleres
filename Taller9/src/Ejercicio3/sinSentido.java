/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class sinSentido {
    interface Volador {
    void volar();
}

// Clase que representa un coche
public class Coche implements Volador {
    // El coche no vuela, pero implementa la interfaz Volador
    @Override
    public void volar() {
        // Esta implementación no tiene sentido para un coche
        System.out.println("El coche no puede volar.");
    }
}
}
