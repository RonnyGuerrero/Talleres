package Ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
      
        Descuento descuento = new Descuento(10); 
        double porcentaje = descuento.aplicarDescuento(100); 
        System.out.println("PRECIO CON DESCUENTO PORCENTAJE: " + porcentaje);

        Fijo fijo = new Fijo(200); 
        double porcentajes = fijo.aplicarDescuento(1000); 
        System.out.println("PRECIO DESCUENTO FIJO: " + porcentajes);
    }
}
