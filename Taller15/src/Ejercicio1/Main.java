/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Repara mecanico = new Mecanico();
        HaceLimpiesa ayudanteMecanico = new Ayudante();
        Tecnico tecnico = new Tecnico();
        
        mecanico.reparando();
        System.out.println("///////////////////");
        ayudanteMecanico.linpiando();
        System.out.println("///////////////////");
        tecnico.reparando();
        tecnico.linpiando();
        
    }
}
