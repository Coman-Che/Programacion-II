package programación.pkg2.trabajo.práctico.pkg2;

import java.util.Scanner;


public class Ejercicio_06 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pos = 0, neg = 0, ceros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = Integer.parseInt(input.nextLine());
            if (num > 0) pos++;
            else if (num < 0) neg++;
            else ceros++;
        }
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + ceros);
    }
    
}
