package Ejercicio_2;

public class Ejercicio2_Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE GESTIÓN DE BIBLIOTECA ===\n");

        // 1. Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        System.out.println("Biblioteca '" + biblioteca.getNombre() + "' creada exitosamente.");

        // 2. Crear al menos tres autores
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("A002", "Isabel Allende", "Chilena");
        Autor autor3 = new Autor("A003", "Mario Vargas Llosa", "Peruana");
        Autor autor4 = new Autor("A004", "Julio Cortázar", "Argentina");

        System.out.println("\nAutores creados exitosamente.");

        // 3. Agregar 5 libros asociados a los autores
        biblioteca.agregarLibro("978-8437604947", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-8401337208", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("978-8401337215", "La casa de los espíritus", 1982, autor2);
        biblioteca.agregarLibro("978-8466333725", "La ciudad y los perros", 1963, autor3);
        biblioteca.agregarLibro("978-8432216420", "Rayuela", 1963, autor4);

        // 4. Listar todos los libros con su información y la del autor
        biblioteca.listarLibros();

        // 5. Buscar un libro por su ISBN y mostrar su información
        System.out.println("\n=== BUSCAR LIBRO POR ISBN ===");
        String isbnBuscado = "978-8437604947";
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn(isbnBuscado);

        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            libroEncontrado.mostrarInfo();
        } else {
            System.out.println("No se encontró ningún libro con ISBN: " + isbnBuscado);
        }

        // 6. Filtrar y mostrar los libros publicados en un año específico
        biblioteca.filtrarLibrosPorAnio(1963);

        // 7. Eliminar un libro por su ISBN y listar los libros restantes
        System.out.println("\n=== ELIMINAR LIBRO ===");
        biblioteca.eliminarLibro("978-8466333725");

        System.out.println("\n=== LISTA ACTUALIZADA DE LIBROS ===");
        biblioteca.listarLibros();

        // 8. Mostrar la cantidad total de libros en la biblioteca
        System.out.println("\n=== ESTADÍSTICAS ===");
        System.out.println("Cantidad total de libros en la biblioteca: "
                + biblioteca.obtenerCantidadLibros());

        // 9. Listar todos los autores de los libros disponibles en la biblioteca
        biblioteca.mostrarAutoresDisponibles();

        // Prueba adicional: buscar un libro que no existe
        System.out.println("\n=== PRUEBA DE BÚSQUEDA DE LIBRO INEXISTENTE ===");
        Libro libroNoExistente = biblioteca.buscarLibroPorIsbn("000-0000000000");
        if (libroNoExistente == null) {
            System.out.println("Correcto: El libro no existe en la biblioteca.");
        }
    }

}
