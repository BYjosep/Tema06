package com.BYjosep.Tema06.pilasColas;

public class Pila {
    private static final double ERROR = Double.NEGATIVE_INFINITY;
    private final static int DEFAULT_CAPACITY = 10;
    private final static float GROW_FACTOR = 2f;
    private double[] data;
    private int size;

    public Pila() {
        this(DEFAULT_CAPACITY);
    }
    public Pila(int capacity) {
       data = new double[capacity];
        size = 0;
    }



    /*
        Añadir elementos en el array
     */

    /**
     * Añade el elemento indicado al array
     * @param value Elemento a añadir
     * @return true
     */
    public boolean push(double value) {
        if (isFull())
            expand();
        data[size] = value;
        size++;
        return true;
    }

    /**
     * Añade el elemento indicado al array en la posición indicada por index
     * @param index Índice donde se añadirá el elemento
     * @param value Elemento a añadir
     * @return true
     */
    public boolean push(int index, double value) {
        if (index >= size || index < 0)
            return false;
        if (isFull())
            expand();
        moveToRight(index);
        data[index] = value;
        return true;
    }

    /*
        Modificar array
     */

    /**
     * Establece el valor del elemento con índice index
     * @param index Índice del elemento a modificar
     * @param value Valor que toma el elemento
     * @return true
     */
    public boolean set(int index, double value) {
        if (index >= size || index < 0)
            return false;
        data[index] = value;
        return true;
    }



    /*
        Mover elementos en el array
     */

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

    /*
        Eliminar elementos en el array
     */

    /**
     * Elimina del array el elemento que ocupa la posición desplazando una posición a la izquierda
     * todos los elementos que hay a su derecha
     * @param index posición a eliminar
     * @return El valor eliminado
     */
    private double remove(int index) {
        if (index >= size || index < 0)
            return ERROR;
        double valor = data[index];
        moveToLeft(index);
        return valor;
    }

    /**
     * Elimina del array la primera ocurrencia del valor indicado como parámetro desplazando una posición
     * a la izquierda todos los elementos que haya a su derecha
     * @param value valor a eliminar
     * @return true si se ha borrado el elemento, false en caso contrario
     */
    private boolean remove(double value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                moveToLeft(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Método de uso interno para ampliar la capacidad del array según el factor de crecimiento
     */
    private void expand() {
        double[] copy = new double[Math.round(data.length * GROW_FACTOR)];
        for (int i = 0; i < size; i++) {
            copy[i] = data[i];
        }
        data = copy;
    }

    /*
        Consulta de los valores
     */

    public double pop (){
        double valor = top(--size);
        remove(--size);
        return valor;
    }

    /**
     * Obtiene el número de elementos que hay en el array
     * @return int
     */
    public int size() {
        return size;
    }


    /**
     * Obtiene el elemento que ocupa el índice index
     * @param index Índice del elemento a obtener
     * @return el valor obtenido o ERROR
     */
    private double top(int index) {
        if (index >= size || index < 0)
            return ERROR;
        return data[index];
    }

    /**
     * Obtiene el elemento que ocupa el índice index
     * @return el valor obtenido o ERROR
     */
    public double top() {
        int index = size;
        return data[index];
    }

    /**
     * Método de uso interno para determinar si el array está lleno
     * @return true si está lleno, false si no lo está
     */
    private boolean isFull() {
        return size == data.length;
    }

    public boolean empty() {
        if (size == 0){
            return true;
        }else {
            return false;
        }


    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i <= size; i++)
            sb.append(data[i]).append(" ");
        sb.append("]");
        return sb.toString();
    }

}
