package com.BYjosep.Tema06.pilasColas;

import java.util.Random;

public class Ejercicio2 {
    private static int size = 10;
    private static Pila prueba = new Pila(size);
    private static Random random = new Random();
    public static void main(String[] args) {

        int contador = 0;
        for (int i = 0; i < (size*3); i++) {

            prueba.push(random.nextInt(-10000,10000));
            System.out.println(prueba.toString()+"\n");

            if(prueba.size()%5 == 0 ){
                System.out.println(prueba.pop());
                prueba.push(random.nextInt(-10000,10000));
                System.out.println(prueba.toString()+"\n");
            }

        }

}
}
