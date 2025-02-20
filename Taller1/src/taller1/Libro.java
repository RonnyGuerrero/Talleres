
package taller1;

public class Libro {
    String titulo;
    String autor;
    int NumPaginas;

    public Libro(){
        titulo = "No titulo";
        autor = "No autor";
        NumPaginas = 10;
    }
    public Libro(String titulo, String autor, int NumPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.NumPaginas = NumPaginas;
    }
    public void LibroMetodo(){
        System.out.println("El libro " + titulo + " fue escrito por " + autor + " y tiene " + NumPaginas + " paginas");
    }
    @Override
        public String toString(){
            return "\nLibro: "+titulo;
        }
}
