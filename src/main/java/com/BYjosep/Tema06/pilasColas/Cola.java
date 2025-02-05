package com.BYjosep.Tema06.pilasColas;

import java.util.Arrays;

public class Cola {
    /*
         Como aún no hemos visto las Exception de momento utilizamos el menos infinito para detectar errores
       */
    private static final String ERROR = null;
    /* Capacidad inicial por defecto del array */
    private final static int DEFAULT_CAPACITY = 10;
    /* Factor de crecimiento */
    private final static float GROW_FACTOR = 2f;
    /* Los datos del array */
    private String[] data;
    /* Número de elementos del array */
    private int size;

    /**
     * Crear un array dinámico con la capacidad inicial por defecto
     */
    public Cola() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Crea un array dinámico con la capacidad inicial indicada
     * @param capacity Capacidad inicial
     */
    public Cola(int capacity) {
        data = new String[capacity];
        size = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DynamicArray that = (DynamicArray) o;

        if (size != that.size) return false;


        for (int i = 0; i < size; i++) {
            if (data[i].equals(that.data[i]))
                return false;
        }
        return true;
    }

    public String peek(){
        return data[size-1];
    }

    /**
     * Obtiene el elemento que ocupa el índice index
     * @param index Índice del elemento a obtener
     * @return el valor obtenido o ERROR
     */
    private String get(int index) {
        if (index >= size || index < 0)
            return ERROR;
        return data[index];
    }

    /**
     * Añade el elemento indicado al array
     * @param value Elemento a añadir
     * @return true
     */
    public boolean add(String value) {
        add(1, value);
        return true;
    }


    /**
     * Añade el elemento indicado al array en la posición indicada por index
     * @param index Índice donde se añadirá el elemento
     * @param value Elemento a añadir
     * @return true
     */
    private boolean add(int index, String value) {
        if (index >= size || index < 0)
            return false;
        if (isFull())
            expand();
        moveToRight(index);
        data[index] = value;
        return true;
    }

    /**
     * Método de uso interno para desplazar los elementos a la derecha a partir del índice indicado
     * @param index Índice a partir del cual se desplazarán los elementos
     */
    private void moveToRight(int index) {
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        size++;
    }

    /**
     * Método de uso interno para desplazar los elementos a la izquierda a partir del índice indicado
     * @param index Índice a partir del cual se desplazarán los elementos
     */
    private void moveToLeft(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public String remove() {
        return remove(size - 1);
    }

    /**
     * Elimina del array el elemento que ocupa la posición desplazando una posición a la izquierda
     * todos los elementos que hay a su derecha
     * @param index posición a eliminar
     * @return El valor eliminado
     */
    private String remove(int index) {
        if (index >= size || index < 0)
            return ERROR;
        String valor = data[index];
        moveToLeft(index);
        return valor;
    }


    /**
     * Método de uso interno para ampliar la capacidad del array según el factor de crecimiento
     */
    private void expand() {
        String[] copy = new String[Math.round(data.length * GROW_FACTOR)];
        for (int i = 0; i < size; i++) {
            copy[i] = data[i];
        }
        data = copy;
    }

    /**
     * Obtiene el número de elementos que hay en el array
     * @return int
     */
    public int size() {
        return size;
    }

    /**
     * Método de uso interno para determinar si el array está lleno
     * @return true si está lleno, false si no lo está
     */
    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < size; i++)
            sb.append(data[i]).append(" ");
        sb.append("]");
        return sb.toString();
    }
}
