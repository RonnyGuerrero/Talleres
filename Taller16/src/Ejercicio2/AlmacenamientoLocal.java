/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class AlmacenamientoLocal implements Almacenamiento{

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        System.out.println("NOMBRE DEL ARCHIVO::"+nombre + "\nCONTENIDO DEL ARCHIVO::"+contenido);
        
    }

    @Override
    public String recuperarArchivo(String nombre) {
        
        return "|||RECUPERANDO ARCHIVO LOCAL::"+nombre;
    }
}