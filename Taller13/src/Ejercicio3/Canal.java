/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class Canal implements Envio{
    @Override
    public void enviar(String destinario ,String mensaje){
        System.out.println("ENVIANDO CORREO A ::" +destinario);
        System.out.println("MENSAJE::"+mensaje);
    }
}