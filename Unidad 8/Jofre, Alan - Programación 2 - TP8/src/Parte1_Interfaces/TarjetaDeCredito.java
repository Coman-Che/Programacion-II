package Parte1_Interfaces;

public class TarjetaDeCredito implements PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta de crédito procesado: $" + monto);
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        System.out.println("Descuento aplicado: " + porcentaje + "%");
    }
}
