package Parte1_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable, Notificable {

    private List<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::calcularTotal).sum();
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificar(); // Notifica al cliente cuando cambia el estado
    }

    @Override
    public void notificar() {
        cliente.recibirNotificacion("Tu pedido ahora está: " + estado);
    }
}
