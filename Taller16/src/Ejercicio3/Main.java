/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Usuario
 */
public class Main {
     public static void main(String[] args) {
        ReportePDF PDF = new ReportePDF();
        GestorReporte GPDF = new GestorReporte(PDF);
        GPDF.generarReporte("XD");
        
        ReporteExel Excel= new ReporteExel();
        GestorReporte GExcel = new GestorReporte(Excel);
        GExcel.generarReporte("taluego");
    }
}
