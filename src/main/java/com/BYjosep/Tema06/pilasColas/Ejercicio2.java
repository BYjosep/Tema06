package com.BYjosep.Tema06.pilasColas;

public class Ejercicio2 {
    private static Pila prueba = new Pila(10);
    public static void main(String[] args) {
        final String mensajeLonjitud = "La longitud escrita de la pila es: %d\n";
        final String mensajeValor = "La valor de la pila es: %f\n";
        int size ;

        System.out.println(pilaVacia());
        prueba.push(3);
        prueba.push(4);
        prueba.push(1);
        size = prueba.size();

        System.out.printf(mensajeLonjitud, size);
        System.out.printf(mensajeValor,prueba.top());

        prueba.pop();
        System.out.printf("El nuevo valor en la ultima posicion es: %f\n",prueba.top());
        System.out.println(pilaVacia());

        System.out.println(prueba.toString());

    }

    private static String pilaVacia() {
        if (prueba.empty() == true) {
            return "La pila vacia";
        }else {
            return "La pila no esta vacia";
        }
    }




}
