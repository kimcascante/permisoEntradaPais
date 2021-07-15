package Semana3;

/**
 * Nombre del programa: 
 * Descripcion: Costa Rica tiene las fronteras cerradas para todas personas que provienen del exterior
debido a la pandemia, salvo aquellas cuya nacionalidad es costarricense. El programa
recibe como entrada la nacionalidad de la persona.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej4w3 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{
        
        String nacionalidad;
        String permiso;
        String tico = "Costarricense";

        escribir.println("Digite la nacionalidad de la persona");
        nacionalidad = leer.readLine();

        if (nacionalidad.equalsIgnoreCase(tico)){
            permiso = "Tiene permitido ingresar al pais";
        } else {
            permiso = "No tiene permitido ingresar al pais";
        }

        escribir.println(permiso);
    }
}