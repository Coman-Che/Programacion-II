package Parte1_Interfaces;

public class Cliente implements Notificable {
    
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void recibirNotificacion(String mensaje) {
        System.out.println("Notificación para " + nombre + ": " + mensaje);
    }
    
    @Override
    public void notificar() {
        // Este método no se usa directamente desde Cliente,
        // pero se implementa por contrato. Podría usarse en otros contextos.
        System.out.println("Cliente " + nombre + " ha sido notificado.");
    }
}