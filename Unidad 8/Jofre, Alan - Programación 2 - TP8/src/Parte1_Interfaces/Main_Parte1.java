package Parte1_Interfaces;

public class Main_Parte1 {

    public static void main(String[] args) {

        // Crear cliente
        Cliente cliente = new Cliente("Ana López");

        // Crear productos
        Producto laptop = new Producto("Laptop Gamer", 1200.0);
        Producto mouse = new Producto("Mouse Inalámbrico", 25.5);

        // Crear pedido
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(laptop);
        pedido.agregarProducto(mouse);

        System.out.println("Total del pedido: $" + String.format("%.2f", pedido.calcularTotal()));

        // Cambiar estado del pedido → notifica al cliente
        pedido.cambiarEstado("Enviado");

        // Procesar pago con tarjeta (con descuento)
        TarjetaDeCredito tarjeta = new TarjetaDeCredito();
        tarjeta.aplicarDescuento(10.0);
        tarjeta.procesarPago(pedido.calcularTotal());

        System.out.println();

        // Procesar pago con PayPal (sin descuento)
        PayPal paypal = new PayPal();
        paypal.procesarPago(pedido.calcularTotal());

    }

}
