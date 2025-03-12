/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class ReporteExel implements  generadorReporte{

    @Override
    public void generar(String contenido) {
        System.out.println("GENERANDO REPORTE EN EXCEL");
        System.out.println(contenido);
    }
    
}