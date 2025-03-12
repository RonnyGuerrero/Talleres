/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class ReportePDF implements generadorReporte{

    @Override
    public void generar(String contenido) {
        System.out.println("GENERANDO REPORTE EN  PDF");
        System.out.println(contenido);
    }
    
    
}