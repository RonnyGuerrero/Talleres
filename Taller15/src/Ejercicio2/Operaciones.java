/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public interface Operaciones {
    public void realizarTransferencia(String destinatario, double monto);
    public void realizarRetiro(double monto);
    public void realizarPagoFactura(String servicio, double monto);
    
}