/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class Gerente extends Empleado{
    String departamento;
    Empleado e=new Empleado();
    
    @Override
    public void mostrarInformacion(){
        System.out.println("name "+e.nombre);
        System.out.println("salario "+e.salario);
        System.out.println("gerente "+ departamento);
    }
            
}
