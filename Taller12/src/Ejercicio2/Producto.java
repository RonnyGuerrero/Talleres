/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Producto {
     public String getNombre() {
        return nombre;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public double getPrecio() {
        return precio;
    }
    private String nombre;
    private double precio;
    private double impuestos;
    public Producto(String nombre, double precio, double impuestos) {
        this.nombre = nombre;
        this.precio = precio;
        this.impuestos = impuestos;
    } 
}
