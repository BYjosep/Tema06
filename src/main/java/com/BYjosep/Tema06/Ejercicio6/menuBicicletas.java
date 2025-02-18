package com.BYjosep.Tema06.Ejercicio6;

public class menuBicicletas {

    Bicicleta[] bicicletas;
    private int size;

    public menuBicicletas() {
        bicicletas = new Bicicleta[100];
        size = 0;
    }

    private void addBicicleta(Bicicleta bicicleta) {
        if (size == 0) {
            bicicletas[size] = new Bicicleta();
            size++;
        }
        if (size == bicicletas.length) {
            throw new ArrayIndexOutOfBoundsException("No se ha podido añadir mas bicicletas");
        }
    }
}
