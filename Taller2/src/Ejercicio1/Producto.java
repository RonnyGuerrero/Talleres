
package Ejercicio1;
public class Producto {
    String nombre;
    int precio;
    
    public Producto(String nombre,int precio){
        this.nombre=nombre;
        this.precio=precio;
        }
    public void mostrarProducto(){
        System.out.println("Nombre"+nombre+"\nPrecio"+precio);
    }
            
}
