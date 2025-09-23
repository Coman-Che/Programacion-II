package Ejercicio_1;

public class Main_Ejercicio_1 {


    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.setNombre("Laura");
        estudiante1.setApellido("Gonzalez");
        estudiante1.setCurso("Lengua");
        estudiante1.setCalificacion(7.5);
        
        System.out.println("Información Inicial:");
        estudiante1.mostrarInfo();
        
        System.out.println("");
        
        System.out.println("Intentando subir calificación 1.5 puntos");
        estudiante1.subirCalificacion(1.5);
        
        System.out.println("");
        
        System.out.println("Intentando subir calificación 3 puntos");
        estudiante1.subirCalificacion(3);
        
        System.out.println("");
        
        System.out.println("Intentando bajar calificación 5 puntos");
        estudiante1.bajarCalificacion(5);
        
        System.out.println("");
        
        System.out.println("Intentando bajar calificación 6 puntos");
        estudiante1.bajarCalificacion(6);
        
        System.out.println("");
        
        System.out.println("Información Final:");
        estudiante1.mostrarInfo();
    }
    
}
