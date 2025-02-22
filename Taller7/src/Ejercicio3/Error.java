/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public abstract class Error {
    
    public abstract void loquesea();
    
    public class Gato extends Error { //Aunque el código compila, esta es una mala práctica 

    @Override
    public void loquesea() {
        System.out.println("Miau miau!");
    }
    }}

