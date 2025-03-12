/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class Tecnico implements Repara, HaceLimpiesa{

    @Override
    public void reparando() {
        System.out.println("EL TECNICO PROFECIONAL REPARA");
    }

    @Override
    public void linpiando() {
        System.out.println("EL TECNICO PROFESIONAL LIMPIA");
    }
    
    
    
}
