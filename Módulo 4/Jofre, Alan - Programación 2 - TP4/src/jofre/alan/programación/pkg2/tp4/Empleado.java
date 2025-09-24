package jofre.alan.programación.pkg2.tp4;

public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático compartido por todas las instancias
    private static int totalEmpleados = 0;

    // ---------------- CONSTRUCTORES ----------------
    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;                // uso de this para diferenciar atributos
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;            // incrementar contador global
    }

    // Constructor sobrecargado (solo nombre y puesto)
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados;  // asigna id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000;        // salario por defecto
        // OJO: acá ya sumamos 1 al totalEmpleados al asignar el id
        // No se suma de nuevo, porque ya lo hicimos en la línea anterior
    }

    // ---------------- MÉTODOS SOBRECARCADOS ----------------
    // Aumentar salario por porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // Aumentar salario por cantidad fija
    public void actualizarSalario(int cantidad) {
        this.salario += cantidad;
    }

    // ---------------- GETTERS & SETTERS ----------------
    public int getId() {
        return id;
    }

    public void setId(int id) {  // si se quiere permitir modificarlo
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // ---------------- MÉTODOS ESTÁTICOS ----------------
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // ---------------- toString() ----------------
    @Override
    public String toString() {
        return "Empleado [ID: " + id
                + ", Nombre: " + nombre
                + ", Puesto: " + puesto
                + ", Salario: $" + salario + "]";
    }
}