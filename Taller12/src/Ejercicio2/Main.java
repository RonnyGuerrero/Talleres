/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Main {
     public static void main(String[] args){
        Producto Prod = new Producto("LEHCE", 0.20, 5000);
       
        double precifin= calcularPrecio.clacularPrecioFinal(Prod);
        System.out.println("EL PRECIO ES $" + precifin);
        
        String generar= Codigo.Generar(Prod);
        System.out.println(generar);
        
        
    }
}
