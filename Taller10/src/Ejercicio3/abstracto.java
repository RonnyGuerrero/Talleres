/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public abstract class abstracto {
    public void noSePuede(){
    System.out.println("esto no se pudede"); //Aunque el código compila, esta es una mala práctica ya que se espera que todas las clases derivadas proporcionen una implementación de los métodos abstractos definidos en la clase base.

    }
}
