/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class AlmacenamientoNube implements Almacenamiento{

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        System.out.println("GUARDANDO EN LA NUEVE::"+nombre+ "CONTENIDO::"+contenido );
        
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return "|||RECUPERANDO ARCHIVO DE LA NUEVE::"+nombre;

    }
    
    
    
}