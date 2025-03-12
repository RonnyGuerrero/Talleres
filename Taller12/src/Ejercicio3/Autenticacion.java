/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class Autenticacion {
    public boolean autenticacion(Usuario usuario, String contraseña){
        return usuario.getContraseña().equals(contraseña);
    }
}
