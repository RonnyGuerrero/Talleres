/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Almacenamiento local = new AlmacenamientoLocal();
        Gestor GLocal = new Gestor(local);
        GLocal.guardar("arroz", "granos");
        GLocal.recuperar("arroz");
        
        Almacenamiento nube = new AlmacenamientoNube();
        Gestor Gnuve = new Gestor(nube);
        Gnuve.guardar("las estrellas", "hastros");
        Gnuve.recuperar("las estrelllas");
                
                
                
    }
}
