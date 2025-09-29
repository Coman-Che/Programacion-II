package programación.pkg2.trabajo.práctico.pkg2;

import java.util.Scanner;


public class Ejercicio_07 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(input.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");
    }
    
}
