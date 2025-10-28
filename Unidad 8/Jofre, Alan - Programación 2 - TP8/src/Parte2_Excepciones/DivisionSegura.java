package Parte2_Excepciones;

import java.util.Scanner;

public class DivisionSegura {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Ingresa el divisor: ");
        int divisor = sc.nextInt();

        try {
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + dividendo + " / " + divisor + " = " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir entre cero.");
        }
    }

}
