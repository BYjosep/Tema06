package com.BYjosep.Tema06.pilasColas;

import com.BYjosep.Tema06.pilasColas.Generics.Cola;
import com.BYjosep.Tema06.pilasColas.Generics.DynamicArray;
import com.BYjosep.Tema06.pilasColas.Generics.Pila;

import java.util.Random;




public class Testgenerics16_02 {


    public static void main(String[] args) {
        //testPila();
        //System.out.println("\n\n\n");
        testDynamicArray();
        System.out.println("\n\n\n");
        testCola();
    }

    private static void testPila() {
        Random random = new Random();
        System.out.println("Probando pila");

        Pila<Object> pila = new Pila<>(5);

        int cantidadNumeros = 5;
        System.out.println("Añadiendo números aleatorios a la pila:");
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = random.nextInt(0, 1000);
            pila.push(numeroAleatorio);
            System.out.printf("Contenido de la pila después de añadir: %s\n", pila);
        }

        System.out.println("\nInvirtiendo el orden de la pila...");
        pila.reverse();
        System.out.printf("Contenido de la pila después de invertir: %s\n", pila);

        Object[] pila2 = pila.clone();
        System.out.println("\nClon de la pila:");
        for (Object elemento : pila2) {
            System.out.println(elemento);
        }

        System.out.println("\nAñadiendo más números aleatorios a la pila:");
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = random.nextInt(0, 1000);
            pila.push(numeroAleatorio);
            System.out.printf("Contenido de la pila después de añadir: %s\n", pila);
        }

        System.out.println("\nMostrando las últimas 3 posiciones de la pila:");
        System.out.println(pila.peekToStr(3));

        System.out.println("\nLimpiando la pila...");
        pila.clear();
        System.out.printf("Contenido de la pila después de limpiar: %s\n", pila);

        System.out.println("Test de pila finalizado");
    }

    private static void testDynamicArray() {
        Random random = new Random();

        System.out.println("Probando dynamicArray");
        DynamicArray<Object> dynamicArray = new DynamicArray<>(5);

        int cantidadNumeros = 5;
        System.out.println("Añadiendo números aleatorios al DynamicArray:");
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = random.nextInt(0, 1000);
            dynamicArray.add(numeroAleatorio);
            System.out.printf("Contenido del DynamicArray después de añadir: %s\n", dynamicArray);
        }

        // Clonar el DynamicArray usando clone()
        System.out.println("\nClon del DynamicArray:");
        DynamicArray<Object> dynamicArray2 = new DynamicArray<>(dynamicArray.size());
        dynamicArray.clone(dynamicArray2.clone());
        System.out.println(dynamicArray2);

        // Buscar un elemento usando indexOf(T element)
        Object elementoABuscar = dynamicArray.get(2); // Buscar el tercer elemento
        System.out.printf("\nBuscando el elemento %s en el DynamicArray:\n", elementoABuscar); // Cambiado %d por %s
        int indice = dynamicArray.indexOf(elementoABuscar);
        if (indice != -1) {
            System.out.printf("Elemento encontrado en el índice: %d\n", indice);
        } else {
            System.out.println("Elemento no encontrado.");
        }

        // Intercambiar elementos usando swap(int index1, int index2)
        System.out.println("\nIntercambiando el primer y el último elemento del DynamicArray:");
        if (dynamicArray.swap(0, dynamicArray.size() - 1)) {
            System.out.printf("Contenido del DynamicArray después del intercambio: %s\n", dynamicArray);
        } else {
            System.out.println("No se pudo realizar el intercambio (índices inválidos).");
        }

        // Reducir el tamaño del array usando trimToSize()
        System.out.println("\nReduciendo el tamaño del DynamicArray al número de elementos actual:");
        dynamicArray.trimToSize();
        System.out.printf("Contenido del DynamicArray después de trimToSize: %s\n", dynamicArray);

        // Limpiar el DynamicArray usando clear()
        System.out.println("\nLimpiando el DynamicArray...");
        dynamicArray.clear();
        System.out.printf("Contenido del DynamicArray después de limpiar: %s\n", dynamicArray);

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
        System.out.printf("\n\nBuscando elemento que sí que se encuentra dentro del array %d\n", aux);
        System.out.println(cola.search(aux));

        System.out.println("\nLimpiando la cola...");
        cola.clear();
        System.out.printf("Contenido de la cola después de limpiar: %s\n", cola);
    }

}
