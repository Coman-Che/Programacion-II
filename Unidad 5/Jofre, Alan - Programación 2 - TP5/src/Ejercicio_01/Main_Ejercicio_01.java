package Ejercicio_01;

public class Main_Ejercicio_01 {

    public static void main(String[] args) {
        
        Foto foto = new Foto("foto.png", "PNG");
        Titular titular = new Titular("Juan Pérez", "12345678");
        Pasaporte pasaporte = new Pasaporte("A12345", "2025-01-01", foto, titular);

        System.out.println("Pasaporte creado para: " + titular);
        
    }
    
}
