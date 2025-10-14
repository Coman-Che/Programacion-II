package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;

public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            // Sincronizar el lado del curso
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (c != null && cursos.contains(c)) {
            cursos.remove(c);
            // Sincronizar el lado del curso
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    public void listarCursos() {
        System.out.println("Cursos de " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("  - Ninguno");
        } else {
            for (Curso c : cursos) {
                System.out.println("  - " + c.getCodigo() + ": " + c.getNombre());
            }
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor ID: " + id + " | Nombre: " + nombre
                + " | Especialidad: " + especialidad + " | Cursos: " + cursos.size());
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return new ArrayList<>(cursos);
    } // copia defensiva

}
