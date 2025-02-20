
package taller1;

public class cuentaBancaria {
    String numeroCuenta;
    int saldo;
    String tipoCuenta;
public cuentaBancaria(){}

public cuentaBancaria(String numeroCuenta, String tipoCuenta){
    this.numeroCuenta = numeroCuenta;
    this.tipoCuenta = tipoCuenta;
   
}
public cuentaBancaria(String numeroCuenta, int saldo, String tipoCuenta){
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
    this.tipoCuenta = tipoCuenta;
}
@Override
        public String toString(){
            return "\nCuenta: "+numeroCuenta;
        }
}
