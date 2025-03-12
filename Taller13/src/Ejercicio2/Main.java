/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Main {
     public static void main(String[] args){
        PDF PDF = new PDF();
        Documento documento = new Documento("ESTE ES UN DOCUMENTO PDF", PDF);
        documento.exportador();
        
        Excel excel = new Excel();
        Documento documendoExcel = new Documento("ESTE ES UN DOCUMENTO EXCEL", excel);
        documendoExcel.exportador();
        
        Word word = new Word();
        Documento documentoWord = new Documento("ESTE ES UN DOCUMENTO WORD", word);
        documentoWord.exportador();
                
    }
}
