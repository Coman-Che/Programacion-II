package jofre.alan.programación.pkg2.tp4;

public class Main_TP4 {

    public static void main(String[] args) {

        // Crear empleados con constructor completo
        Empleado emp1 = new Empleado(1, "Juan Pérez", "Programador", 50000);
        Empleado emp2 = new Empleado(2, "Ana Gómez", "Diseñadora", 45000);

        // Crear empleados con constructor sobrecargado
        Empleado emp3 = new Empleado("Carlos López", "Tester");
        Empleado emp4 = new Empleado("Laura Fernández", "Soporte Técnico");

        // Aplicar aumentos de salario
        emp1.actualizarSalario(10);   // aumento 10%
        emp2.actualizarSalario(5000); // aumento fijo $5000
        emp3.actualizarSalario(15);   // aumento 15%
        emp4.actualizarSalario(2000); // aumento fijo $2000

        // Mostrar empleados
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);

        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
