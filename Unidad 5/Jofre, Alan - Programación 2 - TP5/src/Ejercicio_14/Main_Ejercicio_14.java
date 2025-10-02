package Ejercicio_14;

public class Main_Ejercicio_14 {

    public static void main(String[] args) {
        
        Proyecto proyecto = new Proyecto("Corto Animado", 15);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);
        
    }
    
}
