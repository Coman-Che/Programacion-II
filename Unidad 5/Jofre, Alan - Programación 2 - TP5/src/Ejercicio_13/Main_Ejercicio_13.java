package Ejercicio_13;

public class Main_Ejercicio_13 {

    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Martina", "martina@mail.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("https://miweb.com", usuario);
        
    }
    
}
