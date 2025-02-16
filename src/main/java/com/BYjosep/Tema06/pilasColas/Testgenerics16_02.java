package com.BYjosep.Tema06.pilasColas;

import com.BYjosep.Tema06.pilasColas.Generics.Cola;
import com.BYjosep.Tema06.pilasColas.Generics.DynamicArray;
import com.BYjosep.Tema06.pilasColas.Generics.Pila;

import java.util.Random;

public class Testgenerics16_02 {

    private static final Random random = new Random();

    public static void main(String[] args) {
        testPila();

    }

    /*
    private static void testPila() {
        System.out.println("Probando pila");

        Pila<Object> pila = new Pila<>(5);

        for (int i = 0; i < pila.size(); i++) {
            pila.push(random.nextInt(0,1000));
            System.out.printf("%s \n", pila.toString());
        }
        pila.reverse();
        System.out.printf("%s \n", pila.toString());
        Object[] pila2;
        pila2 = pila.clone();
        System.out.printf("Clon de la pila:\n%s \n", pila2.toString());

        for (int i = 0; i < pila.size(); i++) {
            pila.push(random.nextInt(0,1000));
            System.out.printf("%s \n", pila.toString());
        }
        pila.peek(pila.size()-3);
        pila.clear();
        System.out.println(pila.toString());
        System.out.println("Test de pila finalizado");
    }


     */


    private static void testPila() {
        System.out.println("Probando pila");

        // Crear una pila con capacidad inicial para 5 elementos
        Pila<Object> pila = new Pila<>(5);

        // Generar números aleatorios y añadirlos a la pila
        int cantidadNumeros = 5; // Cantidad de números a generar
        System.out.println("Añadiendo números aleatorios a la pila:");
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = random.nextInt(0, 1000); // Generar un número entre 0 y 999
            pila.push(numeroAleatorio);
            System.out.printf("Contenido de la pila después de añadir: %s\n", pila);
        }

        // Invertir el orden de los elementos en la pila
        System.out.println("\nInvirtiendo el orden de la pila...");
        pila.reverse();
        System.out.printf("Contenido de la pila después de invertir: %s\n", pila);

        // Clonar la pila
        Object[] pila2 = pila.clone();
        System.out.println("\nClon de la pila:");
        for (Object elemento : pila2) {
            System.out.println(elemento);
        }

        // Añadir más números aleatorios a la pila original
        System.out.println("\nAñadiendo más números aleatorios a la pila:");
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = random.nextInt(0, 1000);
            pila.push(numeroAleatorio);
            System.out.printf("Contenido de la pila después de añadir: %s\n", pila);
        }

        // Mostrar las últimas posiciones de la pila
        if (pila.size() >= 3) {
            System.out.println("\nMostrando las últimas 3 posiciones de la pila:");
            pila.peek(3);
        } else {
            System.out.println("\nLa pila no tiene suficientes elementos para mostrar las últimas 3 posiciones.");
        }

        // Limpiar la pila
        System.out.println("\nLimpiando la pila...");
        pila.clear();
        System.out.printf("Contenido de la pila después de limpiar: %s\n", pila);

        System.out.println("Test de pila finalizado");
    }


    private static void testDynamicArray() {
        System.out.println("Probando dynamicArray");
        DynamicArray dynamicArray = new DynamicArray(10);
        for (int i = 0; i < dynamicArray.size(); i++) {
            dynamicArray.add(random.nextInt(0, 1000));
        }
    }

    private static void testCola() {
        System.out.println("Probando cola");
        Cola cola = new Cola();
    }
}
