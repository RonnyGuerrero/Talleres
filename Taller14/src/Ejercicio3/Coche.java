/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class Coche extends Transporte{
    
    @Override
    public void mover(){
        System.out.println("EL COCHE SE ESTA MOVIENDO");
    }

    @Override
    public void detener() {
        System.out.println("EL COCHE SE DETIENE DE REPENTE");
        
    }
    
}