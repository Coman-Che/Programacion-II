package Ejercicio_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Agregado: " + p.getNombre() + " (ID=" + p.getId() + ")");
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("Inventario vacío.");
            return;
        }
        System.out.println("Listado de productos:");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("Producto eliminado: " + p.getNombre() + " (ID=" + id + ")");
            return true;
        }
        System.out.println("No se encontró producto con ID: " + id);
        return false;
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para ID=" + id + ": nueva cantidad=" + nuevaCantidad);
            return true;
        }
        System.out.println("No se encontró producto con ID: " + id);
        return false;
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        return productos.stream()
                .filter(p -> p.getCategoria() == categoria)
                .collect(Collectors.toList());
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        return productos.stream()
                .max(Comparator.comparingInt(Producto::getCantidad))
                .orElse(null);
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        return productos.stream()
                .filter(p -> p.getPrecio() >= min && p.getPrecio() <= max)
                .collect(Collectors.toList());
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("Categorías y descripciones disponibles:");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.printf("- %s: %s%n", c, c.getDescripcion());
        }
    }
}
