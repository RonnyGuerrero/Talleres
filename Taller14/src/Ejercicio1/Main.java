/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Figura circulo = new Circulo(10);
        System.out.println("EL AREA DEL CIRCULO ES::" +circulo.calcularArea());
        
        Figura rectangulo = new Rectangulo(28, 10);
        System.out.println("EL AREA DEL RECTANGULO ES::" +rectangulo.calcularArea());
        
        
    }
}
