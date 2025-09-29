package Ejercicio_3;

public class Main_Ejercicio_3 {

    public static void main(String[] args) {
        
        Libro miLibro = new Libro();
        
        miLibro.setTitulo("Cómo programar en Java");
        miLibro.setAutor("Deitel");
        miLibro.setAnioPublicacion(2017);
        System.out.println("Mostrar información inicial:");
        
        miLibro.mostrarInfo();
        System.out.println("");
        
        //Modificar el año de publicación con un valor válido
        
        System.out.println("Intentando cambiar el año");
        miLibro.setAnioPublicacion(2000);
        miLibro.mostrarInfo();
        System.out.println("");
        
                
        //Modificar el año de publicación con un valor pasado inválido
        System.out.println("Intentando cambiar el año");
        miLibro.setAnioPublicacion(1800);
        miLibro.mostrarInfo();
        System.out.println("");
        
        //Modificar el año de publicación con un valor futuro inválido
        System.out.println("Intentando cambiar el año");
        miLibro.setAnioPublicacion(2030);
        miLibro.mostrarInfo();
        System.out.println("");
        
    }
    
}
