package com.BYjosep.Tema06.pilasColas;

import java.util.Arrays;

public class DinamicArray {

    private static final double ERROR = Double.NEGATIVE_INFINITY;
    private final static int DEFAULT_CAPACITY = 10;
    private final static float GROWTH_FACTOR = 2f;
    private double[] data;
    private int size;

    public DinamicArray() {this(DEFAULT_CAPACITY);}

    public DinamicArray(int capacity) {
        data = new double[capacity];
        size = 0;
    }

    public double get(int index) {
        if (index < 0 || index >= size)
            return  ERROR;
        return data[index];
    }

    public boolean add(double value) {
        if (isFull())
            expand();
        data[size] = value;
        return true;
    }

    private void moveToRight() {
        for (int i = size; i >= 0; i--) {
            data[i] = data[i - 1];
        }
    }
    public boolean set(int index, double value) {
        if (index < 0 || index >= size)
            return false;
        data[index] = value;
        return true;
    }
    public int size(){return size;}
    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DinamicArray that = (DinamicArray) o;

        if (size != that.size) return false;
        for (int i = 0; i < size; i++) {
            if (data[i] != that.data[i])
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(data);
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}
