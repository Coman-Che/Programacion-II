package Parte2_Excepciones;

public class Main_Parte2 {

    public static void main(String[] args) {

        System.out.println("=== Ejercicio 1: División Segura ===");
        DivisionSegura.ejecutar();

        System.out.println("\n=== Ejercicio 2: Conversión de Cadena ===");
        ConversionCadenaANumero.ejecutar();

        System.out.println("\n=== Ejercicio 3: Lectura de Archivo (método tradicional) ===");
        LecturaArchivo.ejecutar();

        System.out.println("\n=== Ejercicio 4: Excepción Personalizada ===");
        ValidadorEdad.ejecutar();

        System.out.println("\n=== Ejercicio 5: Lectura con try-with-resources ===");
        LecturaConTryWithResources.ejecutar();
    }

}
