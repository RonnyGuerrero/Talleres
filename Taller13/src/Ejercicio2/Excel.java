/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */

    public class Excel implements Exportar{
    
    @Override
    public void exportar(String contenido){
        System.out.println("EXPORTANDO EXCEL::"+contenido);
    }
}
