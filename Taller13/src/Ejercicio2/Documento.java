/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Documento {
    private String contenido;
    private Exportar exportador;

    public Documento(String contenido, Exportar exportador) {
        this.contenido = contenido;
        this.exportador = exportador;
    }
    public void exportador(){
        exportador.exportar(contenido);
    }
    
}
