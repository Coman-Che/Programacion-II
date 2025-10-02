package Ejercicio_02;

public class Main_Ejercicio_02 {

    public static void main(String[] args) {

        Bateria bateria = new Bateria("Samsung-45W", 5000);
        Usuario usuario = new Usuario("María López", "87654321");
        Celular celular = new Celular("IMEI123", "Samsung", "S21", bateria, usuario);

        System.out.println("Celular asignado a: " + usuario);

    }

}
