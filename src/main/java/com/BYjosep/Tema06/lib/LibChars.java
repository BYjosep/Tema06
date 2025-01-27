package com.BYjosep.Tema06.lib;

import java.util.Scanner;

public class LibChars {

    public static Scanner scanner = new Scanner(System.in);

    /**
     * cerrar {@link Scanner Scanner}
     */
    public static void cerrarScaner() {
        scanner.close();
    }


    /**
     * Ingresar text.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link Character char}
     */
    public static char ingresarUnCaracter(String texto) {
        String palabra;

        do {
            System.out.println(texto);
            palabra = scanner.nextLine();
        } while (palabra.length() != 1);

        return palabra.charAt(0);
    }
}
