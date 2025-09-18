package programación.pkg2.trabajo.práctico.pkg2;


public class Ejercicio_13 {


    public static void main(String[] args) {
        
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirArray(precios, 0);

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirArray(precios, 0);
    }

    static void imprimirArray(double[] arr, int i) {
        if (i < arr.length) {
            System.out.println("Precio: $" + arr[i]);
            imprimirArray(arr, i + 1);
        }
    }   
}
