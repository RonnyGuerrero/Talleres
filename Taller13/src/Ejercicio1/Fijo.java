package Ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Fijo extends Descuento{

    public double getMontonfijo() {
        return montonfijo;
    }
    
    private double montonfijo;

    public Fijo(double montonfijo) {
        super(0);
        this.montonfijo = montonfijo;
    }
    @Override
   public double aplicarDescuento(double precio){
       
       return precio - montonfijo; }
  }