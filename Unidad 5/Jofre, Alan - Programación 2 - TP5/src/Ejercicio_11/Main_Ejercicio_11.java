package Ejercicio_11;

public class Main_Ejercicio_11 {

    public static void main(String[] args) {
        
        Artista artista = new Artista("Shakira", "Pop");
        Cancion cancion = new Cancion("Hips Don't Lie", artista);
        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(cancion);
        
    }
    
}
