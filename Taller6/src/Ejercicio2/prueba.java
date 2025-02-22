/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class prueba {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        
        int suma = Matematicas.sumar(num1, num2);
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);

        int resta = Matematicas.restar(num1, num2);
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);

        int multiplicacion = Matematicas.multiplicar(num1, num2);
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion);

        double division = Matematicas.dividir(num1, num2);
        System.out.println("La división de " + num1 + " y " + num2 + " es: " + division);
        
        }
    }

