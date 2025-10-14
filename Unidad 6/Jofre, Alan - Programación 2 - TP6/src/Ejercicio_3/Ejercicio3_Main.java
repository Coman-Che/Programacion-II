package Ejercicio_3;

public class Ejercicio3_Main {

    public static void main(String[] args) {

        Universidad uni = new Universidad("Universidad Nacional");

        // 1. Crear profesores
        Profesor p1 = new Profesor("P001", "Ana López", "Matemáticas");
        Profesor p2 = new Profesor("P002", "Carlos Méndez", "Física");
        Profesor p3 = new Profesor("P003", "Lucía Ramírez", "Programación");

        // 2. Crear cursos
        Curso c1 = new Curso("MAT101", "Álgebra Lineal");
        Curso c2 = new Curso("FIS201", "Mecánica Clásica");
        Curso c3 = new Curso("PROG101", "Programación I");
        Curso c4 = new Curso("PROG201", "Estructuras de Datos");
        Curso c5 = new Curso("MAT201", "Cálculo Diferencial");

        // 3. Agregar a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 4. Asignar profesores a cursos
        uni.asignarProfesorACurso("MAT101", "P001");
        uni.asignarProfesorACurso("FIS201", "P002");
        uni.asignarProfesorACurso("PROG101", "P003");
        uni.asignarProfesorACurso("PROG201", "P003");
        uni.asignarProfesorACurso("MAT201", "P001");

        // 5. Listar
        uni.listarCursos();
        uni.listarProfesores();

        // 6. Cambiar profesor de un curso
        System.out.println("\n🔄 Cambiando profesor de PROG101 a P002 (Física)...");
        uni.asignarProfesorACurso("PROG101", "P002");

        // Verificar sincronización
        uni.listarCursos();
        p2.listarCursos(); // Carlos ahora dicta PROG101

        // 7. Eliminar un curso
        System.out.println("\n🗑️ Eliminando curso FIS201...");
        uni.eliminarCurso("FIS201");
        p2.listarCursos(); // Ya no debe aparecer FIS201

        // 8. Eliminar un profesor
        System.out.println("\n🗑️ Eliminando profesor P003 (Lucía)...");
        uni.eliminarProfesor("P003");
        uni.listarCursos(); // PROG201 debe aparecer como "Sin asignar"

        // 9. Reporte final
        uni.mostrarReporteCursosPorProfesor();

    }

}
