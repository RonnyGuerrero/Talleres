package taller1;
public class Estudiante {
    String nombre;
    int edad;
    String curso;
    public Estudiante(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
        
    }
    public Estudiante(String nombre, int edad, String curso){
        this(nombre, edad);
        this.curso = curso;
    }
    @Override
        public String toString(){
            return "\nLibro: "+nombre;
        }
}
