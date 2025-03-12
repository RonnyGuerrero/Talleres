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
     public static void main(String [] args){
    
        
      Usuario usuario = new Usuario("RONNY", "2773", "Rguerrero@gmail.com");
      Validacion valido = new Validacion();
      Autenticacion autentico = new Autenticacion();
      
      if(valido.validar(usuario.getGmail())){
          System.out.println("VALIDACION CORRECTA");
          System.out.println("GMAIL = "+usuario.getGmail());
         
      }else{
          System.out.println("NO SE HIZO LA VALIDACION");
        
          System.out.println("GMAIL DEBE TENER @ Y .");
      }
      if (autentico.autenticacion(usuario, "2773")){
           System.out.println("SI SE HIZO LA VALIDACION");
            System.out.println("BIENVENIDO="+usuario.getNombre());
       }else{
           System.out.println("NO SE HIZO LA VALIDACION");
       } 
        
    }
}
