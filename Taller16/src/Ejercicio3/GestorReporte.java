/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class GestorReporte {
    private generadorReporte GR;

    public GestorReporte(generadorReporte GR) {
        this.GR = GR;
    }
    
    public void generarReporte(String contenido){
        GR.generar(contenido);
    }
    
}