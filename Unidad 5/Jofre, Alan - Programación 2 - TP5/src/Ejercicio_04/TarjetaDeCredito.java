package Ejercicio_04;

public class TarjetaDeCredito {
    
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;  // Asociación bidireccional
    private Banco banco;      // Agregación

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        cliente.setTarjeta(this); // Vinculación bidireccional
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + '}';
    }
    
    
}
