package programación.pkg2.trabajo.práctico.pkg2;

import java.util.Scanner;


public class Ejercicio_02 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int n1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo número: ");
        int n2 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el tercer número: ");
        int n3 = Integer.parseInt(input.nextLine());
        int mayor = Math.max(n1, Math.max(n2, n3));
        System.out.println("El mayor es: " + mayor);
    }
    
}
