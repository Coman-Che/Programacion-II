package Ejercicio_03;

public class Main_Ejercicio_03 {

    public static void main(String[] args) {
        
        Autor autor = new Autor("Gabriel García Márquez", "Colombiano");
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires");
        Libro libro = new Libro("Cien Años de Soledad", "978-3-16-148410-0", autor, editorial);

        System.out.println("Libro creado: " + libro);
        
    }
    
}
