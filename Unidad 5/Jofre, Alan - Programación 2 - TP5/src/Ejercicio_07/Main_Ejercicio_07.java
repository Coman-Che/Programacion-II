package Ejercicio_07;

public class Main_Ejercicio_07 {

    public static void main(String[] args) {
        
        Motor motor = new Motor("V8", "MTR1234");
        Conductor conductor = new Conductor("Diego Rivas", "LIC9876");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Hilux", motor, conductor);

        System.out.println("Vehículo creado con conductor: " + conductor);
        
    }
    
}
