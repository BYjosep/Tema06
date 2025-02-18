package com.BYjosep.Tema06.pilasColas.Generics;

import java.util.Arrays;
import java.util.Objects;

public class DynamicArray<T> {

    private final T ERROR = null;
    private final static int DEFAULT_CAPACITY = 10;
    private final static float GROW_FACTOR = 2f;
    private T[] data;
    private int size;

    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicArray(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DynamicArray<?> that = (DynamicArray<?>) o;
        return size == that.size && Objects.deepEquals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Arrays.hashCode(data), size);
    }

    public T get(int index) {
        if (index >= size || index < 0)
            return ERROR;
        return data[index];
    }

    public boolean add(T value) {
        if (isFull())
            expand();
        data[size++] = value;
        return true;
    }

    private void moveToRight(int index) {
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        size++;
    }

    public boolean add(int index, T value) {
        if (index > size || index < 0)
            return false;
        if (isFull())
            expand();
        moveToRight(index);
        data[index] = value;
        return true;
    }

    private void moveToLeft(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public T remove(int index) {
        if (index >= size || index < 0)
            return ERROR;
        T value = data[index];
        moveToLeft(index);
        return value;
    }

    public boolean remove(T value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                moveToLeft(i);
                return true;
            }
        }
        return false;
    }

    public boolean set(int index, T value) {
        if (index >= size || index < 0)
            return false;
        data[index] = value;
        return true;
    }

    private void expand() {
        T[] copy = (T[]) new Object[Math.round(data.length * GROW_FACTOR)];
        System.arraycopy(data, 0, copy, 0, size);
        data = copy;
    }

    public int size() {
        return size;
    }

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

    public void clear() {
        data = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public T[] clone() {
        T[] newDynamicArray = (T[]) new Object[size];
        System.arraycopy(data, 0, newDynamicArray, 0, size);
        return newDynamicArray;
    }



    public void clone(T[] newDynamicArray) {
        System.arraycopy(data, 0, newDynamicArray, 0, size);
    }

    public int indexOf(T value) {
        if (size == 0) return -1;
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) return i;
        }
        return -1;
    }

    public void trimToSize() {
        T[] aux = (T[]) new Object[size];
        System.arraycopy(data, 0, aux, 0, size);
        data = aux;
    }

    public boolean swap(int index1, int index2) {
        if (index1 >= size || index2 >= size || index1 < 0 || index2 < 0)
            return false;
        T aux = data[index1];
        data[index1] = data[index2];
        data[index2] = aux;
        return true;
    }
}