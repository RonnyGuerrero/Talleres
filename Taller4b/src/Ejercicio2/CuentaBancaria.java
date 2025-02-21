/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private int saldo;
    public String tipoCuenta;
    
    public int getSaldo(){
    return saldo;
    }
    
  public void setSaldo(int saldo){
      this.saldo=saldo;
  }
  public void metodo(){
      System.out.println("numero de cuenta: "+numeroCuenta);
      System.out.println("Saldo: " + saldo);
      System.out.println("Tipo de cuenta: " + tipoCuenta);
  }
}
