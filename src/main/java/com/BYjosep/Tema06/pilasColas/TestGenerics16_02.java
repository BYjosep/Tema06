package com.BYjosep.Tema06.pilasColas;

import com.BYjosep.Tema06.pilasColas.Generics.Cola;
import com.BYjosep.Tema06.pilasColas.Generics.DynamicArray;
import com.BYjosep.Tema06.pilasColas.Generics.Pila;

import java.util.Arrays;
import java.util.Random;

public class TestGenerics16_02 {

    public static void main(String[] args) {
        testPila();
        System.out.println("\n\n\n");
        testDynamicArray();
        System.out.println("\n\n\n");
        testCola();
    }

    private static void testPila() {
        Random random = new Random();
        System.out.println("=== TEST PILA CON RANDOM ===");
        Pila<Integer> pila = new Pila<>();

        // 1. Llenar la pila con 5 números aleatorios
        System.out.println("\n[1] Añadiendo elementos:");
        int[] elementos = new int[5];
        for (int i = 0; i < 5; i++) {
            elementos[i] = random.nextInt(100);
            pila.push(elementos[i]);
            System.out.println("Push(" + elementos[i] + ") -> " + pila);
        }

        // 2. Test search()
        System.out.println("\n[2] Test search():");
        System.out.println("search(cima=" + elementos[4] + ") -> " + pila.search(elementos[4]) + " (debe ser 1)");
        System.out.println("search(base=" + elementos[0] + ") -> " + pila.search(elementos[0]) + " (debe ser 5)");
        System.out.println("search(noExistente=999) -> " + pila.search(999) + " (debe ser -1)");

        // 3. Test clone()
        System.out.println("\n[3] Test clone():");
        Object[] clon = pila.clone();
        System.out.println("Clon: " + Arrays.toString(clon) +
                "\nEs igual al original \nArray original" + pila + "\n" + Arrays.equals(clon, Arrays.stream(elementos).boxed().toArray()));

        // 4. Test peek()
        System.out.println("\n[4] Test peek(3):");
        System.out.println(pila.peekToStr(3));

        // 5. Test reverse()
        System.out.println("\n[5] Test reverse():");
        Object[] invertido = pila.reverse();
        System.out.println("Original: " + Arrays.toString(clon));
        System.out.println("Reverse: " + Arrays.toString(invertido));

        // 6. Test clear()
        System.out.println("\n[6] Test clear():");
        pila.clear();
        System.out.println("Pila vacía? " + pila.isEmpty() + " -> " + pila);
    }

    private static void testDynamicArray() {
        Random random = new Random();

        System.out.println("Probando dynamicArray");
        DynamicArray<Object> dynamicArray = new DynamicArray<>(5);

        int cantidadNumeros = 5;
        System.out.println("Añadiendo números aleatorios al DynamicArray:");
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = random.nextInt(1000);
            dynamicArray.add(numeroAleatorio);
            System.out.printf("Contenido del DynamicArray después de añadir: %s\n", dynamicArray);
        }

        System.out.println("\nClon del DynamicArray:");
        Object[] dynamicArray2 = dynamicArray.clone();
        for (Object elemento : dynamicArray2) {
            System.out.println(elemento);
        }

        Object elementoABuscar = dynamicArray.get(2);
        System.out.printf("\nBuscando el elemento %s:\n", elementoABuscar);
        int indice = dynamicArray.indexOf(elementoABuscar);
        if (indice != -1) {
            System.out.printf("Elemento encontrado en el índice: %d\n", indice);
        } else {
            System.out.println("Elemento no encontrado.");
        }

        System.out.println("\nIntercambiando el primer y último elemento:");
        if (dynamicArray.swap(0, dynamicArray.size() - 1)) {
            System.out.printf("Contenido después del intercambio: %s\n", dynamicArray);
        }

        System.out.println("\nReduciendo tamaño al mínimo:");
        dynamicArray.trimToSize();
        System.out.printf("Contenido después de trimToSize: %s\n", dynamicArray);

        System.out.println("\nLimpiando el DynamicArray...");
        dynamicArray.clear();
        System.out.printf("Contenido después de limpiar: %s\n", dynamicArray);

        System.out.println("Test de DynamicArray finalizado");
    }

    private static void testCola() {
        Random random = new Random();
        System.out.println("Probando cola");
        Cola<Object> cola = new Cola<>(5);

        int cantidadNumeros = 5;
        System.out.println("Añadiendo números aleatorios a la cola:");
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = random.nextInt(0, 1000);
            cola.add(numeroAleatorio);
            System.out.printf("Contenido de la cola después de añadir: %s\n", cola);
        }

        System.out.println("\nClon de la cola:");
        Cola<Object> cola2 = cola.clone();
        System.out.println(cola2);

        System.out.println("\nAñadiendo más números aleatorios a la cola:");
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = random.nextInt(0, 1000);
            cola.add(numeroAleatorio);
            System.out.printf("Contenido de la cola después de añadir: %s\n", cola);
        }

        System.out.println("\nMostrando el último elemento de la cola:");
        System.out.println(cola.peekLastToStr());

        int aux = random.nextInt();
        System.out.printf("Buscando un elemento al azar en la cola (número al azar: %d)\n", aux);
        System.out.println(cola.search(aux));

        aux = cola.size() - 3;
        System.out.printf("\n\nBuscando elemento que sí que se encuentra dentro de la cola %d\n", aux);
        System.out.println(cola.search(aux));

        System.out.println("\nLimpiando la cola...");
        cola.clear();
        System.out.printf("Contenido de la cola después de limpiar: %s\n", cola);
    }
}