package Ejercicio_04;

public class Main_Ejercicio_04 {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Ana Torres", "44556677");
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/29", cliente, banco);

        System.out.println("Tarjeta creada para cliente: " + cliente);
        
    }
    
}
