package Ejercicio_3;

import java.util.ArrayList;

public class Ejercicio3_Main {

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Laura", 80000, 10000));
        empleados.add(new EmpleadoTemporal("Carlos", 20, 2500));

        for (Empleado e : empleados) {
            System.out.println(e.nombre + " → Sueldo: $" + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de Planta\n");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado Temporal\n");
            }
        }

    }

}
