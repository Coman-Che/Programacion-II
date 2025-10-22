package Ejercicio_4;

public class Ejercicio4_Main {

    public static void main(String[] args) {

        Animal[] animales = {
            new Perro("Rex"),
            new Gato("Michi"),
            new Vaca("Lola")
        };

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println();
        }

    }

}
