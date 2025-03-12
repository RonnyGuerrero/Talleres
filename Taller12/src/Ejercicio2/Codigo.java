/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Codigo {
     public static String Generar(Producto producto){
        return "PRODUCTO = "+ producto.getNombre()+ "\n|PRECIO $ = "+producto.getPrecio();
        }
}
