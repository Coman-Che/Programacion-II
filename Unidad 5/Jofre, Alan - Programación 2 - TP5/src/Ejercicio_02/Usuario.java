package Ejercicio_02;

public class Usuario {
    
    private String nombre;
    private String dni;
    private Celular celular; // Asociación bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
}
