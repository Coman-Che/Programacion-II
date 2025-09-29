package Ejercicio_1;


public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        
        if (calificacion < 0){
            this.calificacion = 0; //Evita valores negativos
        }else if (calificacion > 10){
            this.calificacion = 10; //Evita valores mayores a 10
        }else{
        this.calificacion = calificacion;
        }
    }
    
    //Método para mostrar información del estudiante
    //mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos)
    
    public void mostrarInfo(){
        System.out.println("Estudiante: " + apellido + ", " + nombre);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    //Verificamos si al sumar los puntos de calificación no supera el máxima apermitido (10)    
    public void subirCalificacion(double puntos){
        if(calificacion + puntos <= 10){
            calificacion += puntos; //acumulador
            System.out.println("La calificación  ha aumentado a: " + calificacion);
        }else{
            System.out.println("Error, no se puede superar la calificación máxima (10)");
        }
    }
    
    public void bajarCalificacion(double puntos){
        if(calificacion - puntos >= 0){
            calificacion -= puntos; //asi no es menor que 0, disminuimos califaicación
            System.out.println("La calificación  ha disminuido a: " + calificacion);
        }else{
            //si <0
            System.out.println("Error, no se puede tener una calificación menor a 0");
        }
    }
    

}
