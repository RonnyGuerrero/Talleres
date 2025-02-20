
package Ejercicio3;
class Prueba {
    public static void main(String[] args) {
        Persona n= new Persona();
        n.getNombre();
        n.setNombre("ronny");
        int edad = n.edad;
        // no deja n.nombre por que es un string privado y el int edad de paquete si tiene accesibilidad
    }
    
    
}
