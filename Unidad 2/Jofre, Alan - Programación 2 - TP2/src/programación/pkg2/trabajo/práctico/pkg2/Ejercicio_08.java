package programación.pkg2.trabajo.práctico.pkg2;

import java.util.Scanner;


public class Ejercicio_08 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el impuesto en %: ");
        double impuesto = Double.parseDouble(input.nextLine()) / 100;
        System.out.print("Ingrese el descuento en %: ");
        double descuento = Double.parseDouble(input.nextLine()) / 100;

        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        System.out.println("El precio final del producto es: " + precioFinal);
    }
    
}
