/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class AutenticarLocal implements ServicioAutenticacion{

    @Override
    public boolean autenticar(String usuario, String clave) {
        if(usuario.equals("eliseo") && clave.equals("1234")){
            System.out.println("AUTENTICACION LOCAL EXITOSA");
        
        return true;
    }
        System.out.println("AUTENTICACION FALLIDA");
        return false;

    }
}
