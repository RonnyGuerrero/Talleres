/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class Coche implements Conducible {
    @Override
    public void conducir(String destino) {
        System.out.println("Conduciendo automóvil hacia " + destino);
    }
}