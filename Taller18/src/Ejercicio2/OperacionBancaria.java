/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public interface OperacionBancaria {
    void transferir(String origen, String destino, double monto);
    void retirar(String cuenta, double monto);
    void pagarFactura(String cuenta, String factura, double monto);
}