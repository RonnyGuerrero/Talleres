/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class AutenticacionOAuth implements ServicioAutenticacion{

    @Override
    public boolean autenticar(String usuario, String clave) {
    System.out.println("AUTENTICACION OAUTH REALIZADA"
            + " PARA EL USUARIO: " + usuario);
        return true;
    }
    
    
    
}
