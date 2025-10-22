package Ejercicio_3;

public class EmpleadoPlanta extends Empleado {
    
    private double salarioBase;
    private double bonificacion;

    public EmpleadoPlanta(String nombre, double salarioBase, double bonificacion) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + bonificacion;
    }
    
}
