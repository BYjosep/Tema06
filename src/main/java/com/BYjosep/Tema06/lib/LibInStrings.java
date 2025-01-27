package com.BYjosep.Tema06.lib;

import java.util.Scanner;

public class LibInStrings {

    public static Scanner scanner = new Scanner(System.in);

    /**
     * cerrar {@link Scanner Scanner}
     */
    public static void cerrarScaner() {
        scanner.close();
    }

    /**
     * Ingresar frase
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link String String}
     */
    public static String ingresarFrase() {
        String frase;
        System.out.println("Ingrese una frase");
        frase = scanner.nextLine();
        return frase;
    }

    /**
     * Ingresar text.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link String String}
     */
    public static String ingresarTexto(String texto) {
        String palabra;

        System.out.println(texto);
        palabra = scanner.nextLine();

        return palabra;
    }
}
