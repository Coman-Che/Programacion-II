package Parte2_Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {

    public static void ejecutar() {
        try {
            FileReader fr = new FileReader("datos.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo 'datos.txt' no fue encontrado.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

}
