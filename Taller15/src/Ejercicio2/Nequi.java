package Ejercicio2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Nequi implements Retiros, Factura, Transferencia{

    @Override
    public void realizarRetiro(double monto) {
          System.out.println("RETIRO MONTO $"+monto);
    }

    @Override
    public void realizarPagoFactura(String servicio, double monto) {
        System.out.println("SERVICIO|| " +servicio+ "|\nPAGO MONTO $"+monto);
    }

    @Override
    public void realizarTransferencia(String destinatario, double monto) {
        System.out.println("TRANFERIR A ||" + destinatario +"|\nTRANSFERENCIA MONTO $"+ monto);
        
    }
     
    
    
    
}
