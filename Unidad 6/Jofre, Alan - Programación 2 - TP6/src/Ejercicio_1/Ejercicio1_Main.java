package Ejercicio_1;

import java.util.List;

public class Ejercicio1_Main {

    public static void main(String[] args) {

        Inventario inv = new Inventario();
        Producto p1 = new Producto("P001", "Televisor Samsung 55\"", 49999.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("P002", "Notebook Dell Inspiron", 89999.0, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Jean Levis", 12999.0, 20, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Cafetera Nespresso", 24999.0, 7, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Arroz Integral 1kg", 1199.0, 50, CategoriaProducto.ALIMENTOS);

        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        inv.agregarProducto(p4);
        inv.agregarProducto(p5);

        System.out.println();

// 2. Listar todos los productos
        inv.listarProductos();
        System.out.println();

// 3. Buscar un producto por ID
        System.out.println("Busqueda por ID P003:");
        Producto encontrado = inv.buscarProductoPorId("P003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }
        System.out.println();

// 4. Filtrar por categoria: ELECTRONICA
        System.out.println("Productos en categoría ELECTRONICA:");
        List<Producto> electronica = inv.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for (Producto p : electronica) {
            p.mostrarInfo();
        }
        System.out.println();

// 5. Eliminar producto por ID P002
        inv.eliminarProducto("P002");
        System.out.println("Después de eliminar P002:");
        inv.listarProductos();
        System.out.println();

// 6. Actualizar stock de un producto existente
        inv.actualizarStock("P001", 8);
        System.out.println();

// 7. Mostrar total de stock
        System.out.println("Total de unidades en stock: " + inv.obtenerTotalStock());
        System.out.println();

// 8. Producto con mayor stock
        Producto mayor = inv.obtenerProductoConMayorStock();
        System.out.println("Producto con mayor stock:");
        if (mayor != null) {
            mayor.mostrarInfo();
        }
        System.out.println();

// 9. Filtrar productos con precios entre 1000 y 3000
        System.out.println("Productos con precio entre $1000 y $3000:");
        List<Producto> rango = inv.filtrarProductosPorPrecio(1000, 3000);
        for (Producto p : rango) {
            p.mostrarInfo();
        }
        System.out.println();

// 10. Mostrar categorias disponibles con descripciones
        inv.mostrarCategoriasDisponibles();
    }

}
