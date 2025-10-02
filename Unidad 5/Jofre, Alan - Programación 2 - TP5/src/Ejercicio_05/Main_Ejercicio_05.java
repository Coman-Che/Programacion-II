package Ejercicio_05;

public class Main_Ejercicio_05 {

    public static void main(String[] args) {
        
        PlacaMadre placa = new PlacaMadre("MSI Z490", "Intel Z490");
        Propietario propietario = new Propietario("Carlos Gómez", "33445566");
        Computadora pc = new Computadora("HP", "SN123456", placa, propietario);

        System.out.println("Computadora creada para propietario: " + propietario);
        
    }
    
}
