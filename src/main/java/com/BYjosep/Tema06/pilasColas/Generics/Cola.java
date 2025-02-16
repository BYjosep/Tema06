package com.BYjosep.Tema06.pilasColas.Generics;


import java.util.Arrays;
import java.util.Objects;

public class Cola<T> {

    /*
    Como aún no hemos visto las Exception de momento utilizamos el menos infinito para detectar errores
     */
    private static final String ERROR = null;
    /* Capacidad inicial por defecto del array */
    private final static int DEFAULT_CAPACITY = 10;
    /* Factor de crecimiento */
    private final static float GROW_FACTOR = 2f;
    /* Los datos del array */
    private T[] data;
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
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Object[capacity];
        data = temp;
        size = 0;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cola<T> cola = (Cola<T>) o;
        return size == cola.size && Objects.deepEquals(data, cola.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(data), size);
    }

    public String peek() {
        return (String) data[size-1];
    }

    /**
     * Obtiene el elemento que ocupa el índice index
     *
     * @param index Índice del elemento a obtener
     * @return el valor obtenido o ERROR
     */
    private T get(int index) {
        if (index >= size || index < 0)
            return null;
        return  data[index];
    }

    /**
     * Añade el elemento indicado al array
     * @param value Elemento a añadir
     * @return true
     */
    public boolean add(T value) {
        if (isFull()) {
            expand(); // Ampliar la capacidad si está llena.
        }
        data[size++] = value; // Agregar el valor y aumentar el tamaño.
        return true;
    }


    /**
     * Añade el elemento indicado al array en la posición indicada por index
     * @param index Índice donde se añadirá el elemento
     * @param value Elemento a añadir
     * @return true
     */
    private boolean add(int index, T value) {
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

    public T remove() {
        return remove(size-1);
    }

    private T  remove(int index) {
        if (index >= size || index < 0)
            return null;
        T valor = data[index];
        moveToLeft(index);
        return  valor;
    }


    /**
     * Método de uso interno para ampliar la capacidad del array según el factor de crecimiento
     */
    private void expand() {
        String[] copy = new String[Math.round(data.length * GROW_FACTOR)];
        for (int i = 0; i < size; i++) {
            copy[i] = (String) data[i];
        }
        data = (T[]) copy;
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
        if (size == 0) return "[ ]"; // Si la cola está vacía, retorna "[ ]".
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]).append(" "); // Agregar cada elemento separado por espacios.
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        data = (T[]) new Object[data.length];
    }
    /*
    public void clear(){
        for(int i = 0; i < size; i++){
            data[i] = null;
        }
    }
    */

    public T[] clone(){
        T[] newCola = (T[]) new Object[size];

        System.arraycopy(data, 0, newCola, 0, size);

        return newCola;
    }

    public void clone(T[] newCola){
        if (size >= 0) System.arraycopy(data, 0, newCola, 0, size);
    }

    public void peekLast(){
        if(size == 0) System.out.println((T)null);
        else System.out.println(data[size]);
    }

    public String peekLastToStr(){
        if(size == 0) return null;
        else return (String) data[size];
    }

    public int search(T value){
        if (size==0) return -1;
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) return i;
        }
        return -1;
    }

    public T[] reverse() {
        T[] aux = (T[]) new Object[size];
        for  (int i = 0; i <= size; i++) {
            aux[i] = data[(size - i) - 1];
        }
        return aux;
    }
}
