
package javaapplication14;

import java.util.Scanner;


public class G_Division {
    
    public static void main(String[] args) {
           
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese un número entero: ");
        int num1 = input.nextInt();
        
        System.out.println("Por favor, ingrese otro número entero: ");
        int num2 = input.nextInt();
        
        int division_a = num1 / num2;
        double division_b = (double) num1 / num2;
        
        System.out.println("El resultado de la división entera es: " + division_a);
        System.out.println("El resultado de la división entera es: " + division_b);
        
        input.close();
  
}
}