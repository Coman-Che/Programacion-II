package Ejercicio_01;

public class Titular {

    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // Asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }

}

