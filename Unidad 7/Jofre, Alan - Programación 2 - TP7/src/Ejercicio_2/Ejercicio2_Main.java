package Ejercicio_2;

public class Ejercicio2_Main {

    public static void main(String[] args) {

        Figura[] figuras = {
            new Circulo(3.5),
            new Rectangulo(4, 6)
        };

        for (Figura f : figuras) {
            System.out.println(f.nombre + " → Área: " + f.calcularArea());
        }

    }

}
