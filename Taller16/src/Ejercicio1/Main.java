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
        
        ServicioAutenticacion local= new AutenticarLocal();
        GestionAutentificacion gesLocal = new GestionAutentificacion(local);
        gesLocal.autenticarUsuario("eliseo", "1234");
        
        ServicioAutenticacion oauth = new AutenticacionOAuth();
        GestionAutentificacion gesOAuth = new GestionAutentificacion(oauth);
        gesOAuth.autenticarUsuario("fer", "321");
    }
    
}
