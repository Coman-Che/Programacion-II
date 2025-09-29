package Ejercicio_3;

import java.time.Year;

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    //Modificar el año de publicación con validación
    public void setAnioPublicacion(int nuevoAnio) {
        int anioActual = Year.now().getValue(); //Obtener el año actual
        if (nuevoAnio >= 1900 && nuevoAnio <= anioActual) {
            this.anioPublicacion = nuevoAnio;
            System.out.println("Año de publicación actualizado correctamente");
        } else {
            System.out.println("Error: el año debe estar entre 1900 y " + anioActual);
        }
}

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }

}
