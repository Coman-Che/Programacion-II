package Ejercicio_10;

public class Titular {
    
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // Asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    

}
