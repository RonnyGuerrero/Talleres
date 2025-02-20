
package taller1;

import javax.swing.JOptionPane;

public class Aplicacion {

    public static void main(String[] args) {
        String libro=JOptionPane.showInputDialog(null,"Ingrese nombre de liro");
        String nombre=JOptionPane.showInputDialog(null,"ingrese nombre de estudiante");
        String cuenta=JOptionPane.showInputDialog(null,"ingrese nombre de la cuenta");
        String nada="";
        
        Libro l=new Libro (libro,nada,0);
        cuentaBancaria c=new cuentaBancaria(cuenta, 0, nada);
        Estudiante e=new Estudiante(nombre, 0,nada);
        
        JOptionPane.showMessageDialog(null," "+l.toString()+" "+c.toString()+" "+e.toString());
        
               
    }
    
}
