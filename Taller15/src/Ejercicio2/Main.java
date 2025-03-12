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
         
        Cajero ca= new Cajero();
        Nequi AMN = new Nequi();
        System.out.println("APP NEQUI");
        AMN.realizarRetiro(3000);
        System.out.println("Pago factura/ APP NEQUI");
        AMN.realizarPagoFactura("NEQUI", 120000);
        System.out.println("Transferencia/ APP NEQUI");
        AMN.realizarTransferencia("3028657107", 1230000);
        System.out.println("Cajero automatico");
        System.out.println("Transferencia");
        ca.realizarTransferencia("123-5444-67", 20000);
        System.out.println("/Retiro//");
        ca.realizarRetiro(2000);
        
    }
}
