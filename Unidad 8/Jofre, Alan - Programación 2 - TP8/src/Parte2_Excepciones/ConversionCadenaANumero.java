package Parte2_Excepciones;

import java.util.Scanner;

public class ConversionCadenaANumero {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número válido: " + numero);
        } catch (NumberFormatException e) {
            System.err.println("Error: '" + entrada + "' no es un número entero válido.");
        }
    }

}