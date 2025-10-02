package Ejercicio_01;

public class Pasaporte {
    
    private String numero;
    private String fechaEmision;
    private Foto foto;        // Composición
    private Titular titular;  // Asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
        titular.setPasaporte(this); // vinculación bidireccional
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + titular + '}';
    }
    
    
}
