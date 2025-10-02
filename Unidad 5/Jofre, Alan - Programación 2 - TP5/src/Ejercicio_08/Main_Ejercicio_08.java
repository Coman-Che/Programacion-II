package Ejercicio_08;

public class Main_Ejercicio_08 {

    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Pedro Álvarez", "pedro@mail.com");
        FirmaDigital firma = new FirmaDigital("HASH123", "2025-10-01", usuario);
        Documento doc = new Documento("Contrato", "Contenido del contrato...", firma);

        System.out.println("Documento firmado por: " + usuario);
        
    }
    
}
