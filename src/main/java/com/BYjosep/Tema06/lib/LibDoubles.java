package com.BYjosep.Tema06.lib;

import java.lang.reflect.Array;


public class LibDoubles {

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
