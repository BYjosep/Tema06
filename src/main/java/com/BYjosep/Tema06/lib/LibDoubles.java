package com.BYjosep.Tema06.lib;

import java.lang.reflect.Array;
import java.util.Scanner;


public class LibDoubles {

    public static Scanner scanner = new Scanner(System.in);

    /**
     * cerrar {@link Scanner Scanner}
     */
    public static void cerrarScaner() {
        scanner.close();
    }

    /* **********************
     *********  in  *********
     ************************ */

    /**
     * Ingresar text.
     * Recuerde cerrar {@link Scanner Scanner} con el metodo cerrarScaner
     * (Echo para no tener que estar escribiendo este codigo en cada ejercicio)
     *
     * @return Devuelve la frase ingresada en formato {@link Character char}
     */
    public static Double ingresarUnNumeroD(String texto) {
        System.out.println(texto);

        return Double.parseDouble(scanner.nextLine());

    }



    /* **********************
     *********  out  ********
     ************************ */

    /**
     * Ingrese un {@link  Array array} para calcular la media
     *
     * @param numeros Ingresa el {@link  Array array}
     * @return Devuelve {@link Double double}
     */
    public static double mediaDeNumerosEnArray(double[] numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma = suma + numero;
        }
        return suma / numeros.length;
    }


    /**
     * Ingrese un {@link  Array array} para calcular la media
     *
     * @param min     El valor minimo desde el que hace la media
     * @param numeros Ingresa el {@link  Array array}
     * @return Devuelve {@link Double double}
     */
    public static double mediaDeNumerosEnArray(double[] numeros, int min) {
        double suma = 0;
        double contador = 0;
        for (double numero : numeros) {
            if (numero > min) {
                suma = suma + numero;
                contador++;
            }
        }
        return suma / contador;
    }

}
