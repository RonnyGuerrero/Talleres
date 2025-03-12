/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Cajero implements Transferencia, Retiros{

    @Override
    public void realizarTransferencia(String destinatario, double monton) {
        
        System.out.println("TRANSFERENCIA A||" + destinatario + "|\nTRNASFERENCIA MONTO $" + monton);
    }
    
    

    @Override
    public void realizarRetiro(double monto) {
        System.out.println("RETIRO MONTO $"+monto);
    }
 
}
