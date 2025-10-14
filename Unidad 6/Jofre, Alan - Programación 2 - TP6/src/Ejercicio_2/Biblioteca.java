package Ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Agregar un libro a la biblioteca
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
        System.out.println("Libro '" + titulo + "' agregado exitosamente.");
    }

    // Listar todos los libros
    public void listarLibros() {
        System.out.println("\n=== LISTA DE LIBROS EN " + nombre.toUpperCase() + " ===");
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro libro : libros) {
                libro.mostrarInfo();
            }
        }
    }

    // Buscar libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null; // Retorna null si no encuentra el libro
    }

    // Eliminar libro por ISBN
    public boolean eliminarLibro(String isbn) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(isbn)) {
                String tituloEliminado = libros.get(i).getTitulo();
                libros.remove(i);
                System.out.println("Libro '" + tituloEliminado + "' eliminado exitosamente.");
                return true;
            }
        }
        System.out.println("No se encontró ningún libro con ISBN: " + isbn);
        return false;
    }

    // Obtener cantidad total de libros
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    // Filtrar libros por año de publicación
    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n=== LIBROS PUBLICADOS EN " + anio + " ===");
        boolean encontrados = false;

        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrados = true;
            }
        }

        if (!encontrados) {
            System.out.println("No se encontraron libros publicados en el año " + anio);
        }
    }

    // Mostrar autores disponibles
    public void mostrarAutoresDisponibles() {
        System.out.println("\n=== AUTORES DISPONIBLES EN LA BIBLIOTECA ===");
        List<String> autoresMostrados = new ArrayList<>();

        for (Libro libro : libros) {
            String nombreAutor = libro.getAutor().getNombre();
            if (!autoresMostrados.contains(nombreAutor)) {
                libro.getAutor().mostrarInfo();
                autoresMostrados.add(nombreAutor);
            }
        }

        if (autoresMostrados.isEmpty()) {
            System.out.println("No hay autores disponibles.");
        }
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
