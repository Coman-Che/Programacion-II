package Ejercicio_4;

public class Main_Ejercicio_4 {

    public static void main(String[] args) {

        Gallina gallina1 = new Gallina();
        gallina1.setIdGallina(1);
        gallina1.setEdad(2);
        gallina1.setHuevosPuestos(0);

        // Crear segunda gallina
        Gallina gallina2 = new Gallina();
        gallina2.setIdGallina(2);
        gallina2.setEdad(1);
        gallina2.setHuevosPuestos(1);

        System.out.println("Estado inicial");
        gallina1.mostrarEstado();
        System.out.println("");
        gallina2.mostrarEstado();
        System.out.println("");

        // Simular acciones
        gallina1.envejecer();
        gallina1.ponerHuevo();

        gallina2.envejecer();
        gallina2.ponerHuevo();

        // Mostrar estado de ambas gallinas
        System.out.println("Estado actualizado");
        gallina1.mostrarEstado();
        System.out.println("");
        gallina2.mostrarEstado();
    }

}
