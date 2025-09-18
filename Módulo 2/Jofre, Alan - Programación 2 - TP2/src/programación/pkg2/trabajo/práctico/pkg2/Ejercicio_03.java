package programación.pkg2.trabajo.práctico.pkg2;

import java.util.Scanner;


public class Ejercicio_03 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        if (edad < 12) {
            System.out.println("Niño.");
        } else if (edad <= 17) {
            System.out.println("Adolescente.");
        } else if (edad <= 59) {
            System.out.println("Adulto.");
        } else {
            System.out.println("Adulto mayor.");
        }
    }
    
}
