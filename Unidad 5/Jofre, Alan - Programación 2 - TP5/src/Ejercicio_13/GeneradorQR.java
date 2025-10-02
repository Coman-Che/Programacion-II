package Ejercicio_13;

public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario) { // Dependencia de creación
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("QR generado para: " + usuario);
    }
    
}
