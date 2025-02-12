package com.BYjosep.Tema06.lib;

import java.util.Scanner;

public class LibInts {
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
    public static int ingresarUnNumero(String texto) {
        System.out.println(texto);

        return Integer.parseInt(scanner.nextLine());
    }


    /**
     * Ingresar un número.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link String String}
     */
    public static int ingresarOpcin(String texto) {
        int opciom;

        System.out.println(texto);
        opciom = Integer.parseInt(scanner.nextLine());

        return opciom;
    }

    /**
     * Ingresar un número con un valor minimo.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link Character char}
     */
    public static int ingresarUnNumero(String texto, int min) {
        int numero;
        do {
            System.out.println(texto);
            numero = Integer.parseInt(scanner.nextLine());

        } while (numero < min);

        return numero;
    }


    /**
     * Ingresar número con valor minimo y maximo.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link Character char}
     */
    public static int ingresarUnNumero(String texto, int min, int max) {
        int numero;

        do {
            System.out.println(texto);
            numero = Integer.parseInt(scanner.nextLine());
        } while (numero < min && numero > max);

        return numero;
    }

    /**
     * Ingresar número con valor minimo y maximo.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link Character char}
     */
    public static int ingresarUnNumero(String texto, int min, int max, String mensajeError) {
        int numero;

        do {
            System.out.println(texto);
            numero = Integer.parseInt(scanner.nextLine());
            if (numero < min && numero > max) {
                System.out.println(mensajeError);
            }
        } while (numero < min && numero > max);

        return numero;
    }

}
