package Ejercicio_10;

public class Main_Ejercicio_10 {

    public static void main(String[] args) {
        
        ClaveSeguridad clave = new ClaveSeguridad("ABC123", "2025-09-30");
        Titular titular = new Titular("Lucía Fernández", "77889900");
        CuentaBancaria cuenta = new CuentaBancaria("CBU123456789", 15000.0, clave, titular);

        System.out.println("Cuenta creada para titular: " + titular);
        
    }
    
}
