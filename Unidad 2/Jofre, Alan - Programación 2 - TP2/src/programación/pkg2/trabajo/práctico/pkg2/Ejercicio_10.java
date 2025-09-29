package programación.pkg2.trabajo.práctico.pkg2;

import java.util.Scanner;


public class Ejercicio_10 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        int stock = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = Integer.parseInt(input.nextLine());

        int nuevoStock = actualizarStock(stock, vendida, recibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    // Método que calcula el nuevo stock
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
}
