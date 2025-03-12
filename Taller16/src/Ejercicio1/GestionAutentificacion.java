/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class GestionAutentificacion {
    
    private ServicioAutenticacion servicioAU;

    public GestionAutentificacion(ServicioAutenticacion servicioAU) {
        this.servicioAU = servicioAU;
    }
    public void autenticarUsuario(String usuario, String clave){
        boolean exit= servicioAU.autenticar(usuario, clave);
        if(exit){
            System.out.println("EL USUARIO FUE AUTENTICADO");
        }else{
            System.out.println("ERROR AL AUTENTICAR EL USUSARIO");
        }
    }
    
    
    
}
