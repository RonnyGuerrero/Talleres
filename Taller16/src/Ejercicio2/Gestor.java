/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Gestor {
    private Almacenamiento almacenamiento;

    public Gestor(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    public void guardar(String nombre, String contenido){
        almacenamiento.guardarArchivo(nombre, contenido);
    }
    public void recuperar(String nombre){
       String contenido= almacenamiento.recuperarArchivo(nombre);
        System.out.println("||CONTENIDO DEL ARCHIVO//" +nombre+ "/"+"\nCONTENIDO::"+contenido);
                
    }
    
}
