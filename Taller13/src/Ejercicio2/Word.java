/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Word implements Exportar{
    
    @Override
    public void exportar(String contenido){
        System.out.println("EXPORTANDO WORD::"+ contenido);
        
    }
}