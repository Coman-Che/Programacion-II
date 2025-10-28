package Parte2_Excepciones;

public class ValidadorEdad {

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120 años.");
        }
        System.out.println("Edad válida: " + edad + " años.");
    }

    public static void ejecutar() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        try {
            validarEdad(edad);
        } catch (EdadInvalidaException e) {
            System.err.println("Error de validación: " + e.getMessage());
        }
    }

}
