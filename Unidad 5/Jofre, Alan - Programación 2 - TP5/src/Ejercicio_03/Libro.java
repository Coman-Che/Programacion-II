package Ejercicio_03;

public class Libro {

    private String titulo;
    private String isbn;
    private Autor autor;        // Asociación unidireccional
    private Editorial editorial; // Agregación

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    

}
