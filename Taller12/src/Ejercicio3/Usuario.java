/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class Usuario {
     public String getNombre() {
        return nombre;
    }
    public String getContraseña() {
        return contraseña;
    }
    public String getGmail() {
        return gmail;
    }
    private String nombre;
    private String contraseña;
    private String gmail;

    public Usuario(String nombre, String contraseña, String gmail) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.gmail = gmail;
    }
}
