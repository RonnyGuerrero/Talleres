/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class Mensaje {
     private Envio caEn;

    public Mensaje(Envio caEn) {
        this.caEn = caEn;
    }
  
  public void enviarMensaje(String destinatario, String mensaje){
      caEn.enviar(destinatario, mensaje);
      
  }
}
