package Ejercicio_3;

import java.util.*;

public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        if (p != null && buscarProfesorPorId(p.getId()) == null) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && buscarCursoPorCodigo(c.getCodigo()) == null) {
            cursos.add(c);
        }
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("Curso no encontrado: " + codigoCurso);
            return;
        }
        if (profesor == null) {
            System.out.println("Profesor no encontrado: " + idProfesor);
            return;
        }

        curso.setProfesor(profesor); // Esto ya sincroniza ambos lados
    }

    public void listarProfesores() {
        System.out.println("\n=== LISTA DE PROFESORES ===");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores.");
        } else {
            for (Profesor p : profesores) {
                p.mostrarInfo();
            }
        }
    }

    public void listarCursos() {
        System.out.println("\n=== LISTA DE CURSOS ===");
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos.");
        } else {
            for (Curso c : cursos) {
                c.mostrarInfo();
            }
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            // Romper relación (setProfesor(null) ya lo hace, pero llamamos explícitamente)
            c.setProfesor(null);
            cursos.remove(c);
            System.out.println("Curso eliminado: " + codigo);
        } else {
            System.out.println("Curso no encontrado para eliminar: " + codigo);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            // Dejar null en todos sus cursos
            for (Curso c : new ArrayList<>(p.getCursos())) { // copia para evitar ConcurrentModification
                c.setProfesor(null);
            }
            profesores.remove(p);
            System.out.println("Profesor eliminado: " + id);
        } else {
            System.out.println("Profesor no encontrado para eliminar: " + id);
        }
    }

    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n=== REPORTE: CANTIDAD DE CURSOS POR PROFESOR ===");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        } else {
            for (Profesor p : profesores) {
                System.out.println(p.getNombre() + ": " + p.getCursos().size() + " curso(s)");
            }
        }
    }
}
