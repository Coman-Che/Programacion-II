package Ejercicio_08;

public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composición

    public Documento(String titulo, String contenido, FirmaDigital firma) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = firma;
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", firma=" + firma + '}';
    }
    
    
}
