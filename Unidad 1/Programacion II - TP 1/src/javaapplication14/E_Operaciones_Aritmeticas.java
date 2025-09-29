
package javaapplication14;

import java.util.Scanner;


public class E_Operaciones_Aritmeticas {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese un número entero: ");
        int num1 = input.nextInt();
        
        System.out.println("Por favor, ingrese otro número entero: ");
        int num2 = input.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;
        
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " x " + num2 + " = " + multiplicacion);
        System.out.println(num1 + " / " + num2 + " = " + division);
        
        input.close();
}
}