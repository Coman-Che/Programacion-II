package Ejercicio_14;

public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto) { // Dependencia de creación
        Render render = new Render(formato, proyecto);
        System.out.println("Proyecto exportado en formato " + formato);
    }
    
}
