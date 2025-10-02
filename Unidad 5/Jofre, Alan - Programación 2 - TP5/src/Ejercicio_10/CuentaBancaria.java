package Ejercicio_10;

public class CuentaBancaria {
    
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // Composición
    private Titular titular;      // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
        titular.setCuenta(this);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", clave=" + clave + ", titular=" + titular + '}';
    }
    
    
}
