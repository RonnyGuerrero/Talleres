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
       public static void main(String[] args) {
        cuentaBancaria cuneta = new cuentaBancaria(1000);
        cuneta.depositar(500);
        cuneta.retirar(300);
        System.out.println("SALDO DE LA CUENTA BANCARIA : $" + cuneta.consultaSalario());
        
        Ahorros cuentaAhorros = new Ahorros(2000, 5);
        cuentaAhorros.depositar(500);
        cuentaAhorros.aplicarInteres();
        System.out.println("SALDO DE AHORROS DESPUES DE INTERESES: $"+cuentaAhorros.consultaSalario());
    }
}
