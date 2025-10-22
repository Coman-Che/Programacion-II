package Ejercicio_1;

public class Auto extends Vehiculo {

    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); // Invoca al constructor de Vehiculo
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Auto - Marca: " + marca + ", Modelo: " + modelo
                + ", Puertas: " + cantidadPuertas);
    }
}
