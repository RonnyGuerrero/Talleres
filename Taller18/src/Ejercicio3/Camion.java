/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class Camion implements Conducible, Mercancias {
    private double capacidadMaxima;
    private double cargaActual;
    @Override
    public void conducir(String destino) {
        System.out.println("Conduciendo camión hacia " + destino);
    }
    @Override
    public void cargarMercancia(double peso) {
        if (peso + cargaActual <= capacidadMaxima) {
            cargaActual += peso;
            System.out.println("Mercancía cargada: " + peso + " kg");
        } else {
            System.out.println("No hay capacidad suficiente");
        }
    
    }
}