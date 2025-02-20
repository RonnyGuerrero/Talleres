package Ejercicio1;
 class Producto {
    String nombre;
    int precio;
    String stock;

    Producto(String nombre, int precio, String stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    void mostrarInfo(){
        System.out.println("name: "+nombre+"precio: "+precio+"stock: "+stock);
    }
    
  
}
