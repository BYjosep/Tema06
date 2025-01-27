package com.BYjosep.Tema06.lib;

import java.util.Random;

public class LibRandoms {

    /**
     * @param min numero minimo en formato {@link Double double}
     * @param max numero maximo en formato {@link Double double}
     * @return devuelve un numero aleatorio
     */
    public static double aleatorio(double min, double max) {
        Random random = new Random();
        return random.nextDouble() * (max - min);
    }
}
