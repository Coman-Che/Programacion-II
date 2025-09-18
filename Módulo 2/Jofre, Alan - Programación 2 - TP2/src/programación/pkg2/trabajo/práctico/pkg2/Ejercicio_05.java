package programación.pkg2.trabajo.práctico.pkg2;

import java.util.Scanner;


public class Ejercicio_05 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        int num = Integer.parseInt(input.nextLine());

        while (num != 0) {
            if (num % 2 == 0) {
                suma += num;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
        }

        System.out.println("La suma de los números pares es: " + suma);
    }
    
}
