package Ejercicio_5;

public class NaveEspacial {

    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100;

    public String getNombre() {
        return nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    public void setCombustible(int combustible) {
        if (combustible >= 0 && combustible <= MAX_COMBUSTIBLE) {
            this.combustible = combustible;
        } else {
            System.out.println("El combustible debe estar entre 0 y " + MAX_COMBUSTIBLE + ".");
        }
    }

    public void despegar() {
        if (combustible > 0) {
            System.out.println("La nave " + nombre + " ha despegado.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        if (distancia <= 0) {
            System.out.println("La distancia debe ser positiva.");
            return;
        }
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println("La nave " + nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad > 0) {
            if (combustible + cantidad <= MAX_COMBUSTIBLE) {
                combustible += cantidad;
                System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
            } else {
                combustible = MAX_COMBUSTIBLE;
                System.out.println("Se intentó sobrecargar. Combustible ajustado al máximo (" + MAX_COMBUSTIBLE + ").");
            }
        } else {
            System.out.println("La cantidad de recarga debe ser positiva.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible actual: " + combustible + "/" + MAX_COMBUSTIBLE);
    }
}
