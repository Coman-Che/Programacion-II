package Parte2_Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaConTryWithResources {

    public static void ejecutar() {
        // try-with-resources: BufferedReader se cierra automáticamente
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            String linea;
            System.out.println("Leyendo con try-with-resources:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        }
    }

}
