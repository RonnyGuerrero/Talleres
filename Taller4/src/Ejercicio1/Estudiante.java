
package Ejercicio1;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private int notaPromedio;
    
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public int getNotaPromedio(){
        return notaPromedio;
    }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("nulo");
        }
        this.nombre = nombre;
    }public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }
    public void setNotaPromedio(int notaPromedio) {
        if (notaPromedio < 0 ) {
            throw new IllegalArgumentException("La nota promedio debe ser mayor a 0");
        }
        this.notaPromedio = notaPromedio;
    }
               
}

