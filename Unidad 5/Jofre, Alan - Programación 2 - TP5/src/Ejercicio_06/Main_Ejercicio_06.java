package Ejercicio_06;

public class Main_Ejercicio_06 {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Laura Méndez", "11223344");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-10-05", "21:00", cliente, mesa);

        System.out.println("Reserva creada para cliente: " + cliente);
        
    }
    
}
