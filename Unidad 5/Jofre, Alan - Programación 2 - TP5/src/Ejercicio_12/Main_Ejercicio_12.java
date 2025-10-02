package Ejercicio_12;

public class Main_Ejercicio_12 {

    public static void main(String[] args) {
        
        Contribuyente contribuyente = new Contribuyente("Roberto", "20-12345678-9");
        Impuesto impuesto = new Impuesto(5000.0, contribuyente);
        Calculadora calc = new Calculadora();

        calc.calcular(impuesto);
        
    }
    
}
