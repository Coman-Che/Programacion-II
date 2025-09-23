package Ejercicio_2;


public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // Método para simular el paso del tiempo
    public void cumplirAnios(int cantidadAnios) {
        if (cantidadAnios > 0) {
            this.edad += cantidadAnios;
            String mensaje = (cantidadAnios == 1) ? "Después de " + cantidadAnios + " año:" : "Después de " + cantidadAnios + " años:";
            System.out.println(mensaje);
        } else {
            System.out.println("La cantidad de años debe ser positiva.");
        }
    }
    
    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);  
        System.out.println("Edad: " + edad + " años");
    }
}