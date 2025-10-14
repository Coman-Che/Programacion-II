package Ejercicio_3;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public void setProfesor(Profesor p) {
        // Si ya tenía un profesor, quitarse de su lista
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }

        this.profesor = p;

        // Si se asigna un nuevo profesor, agregarse a su lista
        if (this.profesor != null) {
            this.profesor.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        String prof = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Curso: " + codigo + " - " + nombre + " | Profesor: " + prof);
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
