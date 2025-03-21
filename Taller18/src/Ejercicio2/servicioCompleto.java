/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class servicioCompleto implements Transferencia, Retiro, PagarFactura {
    @Override
    public void transferir(String origen, String destino, double monto) {
    }
    
    @Override
    public void retirar(String cuenta, double monto) {
    }
    
    @Override
    public void pagarFactura(String cuenta, String factura, double monto) {
    }
}
