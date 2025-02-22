/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class Error {
     private /*static*/ int atributoNoEstatico;

    public static void metodoEstatico() {
        atributoNoEstatico = 10; // Error de compilación
    }

    public static void main(String[] args) {
        metodoEstatico();
    }
}
//El error de compilación se produce porque un método estático no tiene acceso directo a los atributos no estáticos de la clase

//para solucionarlo solo hace fata poner al atributo de manera estatica.

 