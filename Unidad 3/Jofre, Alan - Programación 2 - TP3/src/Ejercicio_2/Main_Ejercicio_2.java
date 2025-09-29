package Ejercicio_2;

public class Main_Ejercicio_2 {


    public static void main(String[] args) {
        
        Mascota mascota1 = new Mascota();
        
        System.out.println("Información Inicial:");
        
        mascota1.setNombre("Luna");
        mascota1.setEspecie("Perro");
        mascota1.setEdad(3);
        
        mascota1.mostrarInfo();
        System.out.println("");

        // Simular paso del tiempo
        mascota1.cumplirAnios(1);
        mascota1.mostrarInfo();
        System.out.println("");

        mascota1.cumplirAnios(3);
        mascota1.mostrarInfo();
    }
}