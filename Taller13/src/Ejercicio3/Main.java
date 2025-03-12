/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class Main {
     public static void main(String[] args){
        Envio canalCorreo = new Canal();
        Mensaje MC = new Mensaje(canalCorreo);
        MC.enviarMensaje("rony@gmail.com", "hola, loco");
        
        Envio canalSMS = new SMS();
        Mensaje MSMS = new  Mensaje(canalSMS);
        MSMS.enviarMensaje("3133376078 ", "TE HAS GANADO UNA CASA");
        
        Envio canalPush = new Notificaciones();
        Mensaje MPUSH = new Mensaje(canalPush);
        MPUSH.enviarMensaje("carlos", "NO LO QUIERO");
        }
}
