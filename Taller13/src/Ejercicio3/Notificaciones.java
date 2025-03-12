        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class Notificaciones implements Envio{
     @Override
     public void enviar(String destinatario, String mensaje){
         System.out.println("ENVIANDO MENSAJE A::" + destinatario);
         System.out.println("MENSAJE::" + mensaje);
     }
}