package Ejercicio_5;

public class Main_Ejercicio_5 {

    public static void main(String[] args) {
        
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Odisea");
        nave.setCombustible(50);

        System.out.println("Estado inicial");
        nave.mostrarEstado();
        System.out.println("");

        // Intentar avanzar sin recargar (distancia mayor al combustible disponible)
        nave.avanzar(60);
        System.out.println("");

        // Recargar y avanzar correctamente
        nave.recargarCombustible(30);
        System.out.println("");
        nave.avanzar(40);
        System.out.println("");

        // Mostrar estado final
        System.out.println("Estado actualizado");
        nave.mostrarEstado();
    }
    
}
