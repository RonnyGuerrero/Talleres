
package Ejercicio2;
public class Estudiante {
    String nombre;
    int edad;
    public Estudiante(String nombre,int edad){
        this.edad=edad;
        this.nombre=nombre;
    }
    public Estudiante(){
        this("ronny",19);
    }
    public void Metodo(){
        System.out.println("nombre: "+nombre+"edad: "+edad);
    }
    }
    

