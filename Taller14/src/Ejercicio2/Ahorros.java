/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Usuario
 */
public class Ahorros extends cuentaBancaria{
  protected double tasaInteres;

    public Ahorros(double saldoInicial, double tasaInteres ) {
        super(saldoInicial);
        if(tasaInteres <0){
            throw new IllegalArgumentException("LA TASA DE INTERESES NO PUEDE SER NEGATIVA");
        }
        this.tasaInteres = tasaInteres;
    }

   public void aplicarInteres(){
       if (tasaInteres >0){
        saldo += saldo * (tasaInteres )/100;
       }
   }
  }
  
