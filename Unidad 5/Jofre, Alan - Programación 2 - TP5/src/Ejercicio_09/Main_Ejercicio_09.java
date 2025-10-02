package Ejercicio_09;

public class Main_Ejercicio_09 {

    public static void main(String[] args) {
        
        Paciente paciente = new Paciente("Sofía Reyes", "OSDE");
        Profesional medico = new Profesional("Dr. Luis", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-10-15", "10:00", paciente, medico);

        System.out.println("Cita médica asignada a: " + paciente);
        
    }
    
}
