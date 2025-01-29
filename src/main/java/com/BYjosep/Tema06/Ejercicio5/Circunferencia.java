package com.BYjosep.Tema06.Ejercicio5;

import com.BYjosep.Tema06.Ejercicio4.Punto;

public class Circunferencia {
    Punto punto1 = new Punto();
    double radio;

    /*
     *****************
     * Constructores *
     *****************
    */

    Circunferencia() {
        radio = 0;
        punto1.setX(0);
        punto1.setY(0);
    }

    Circunferencia(double radio, Punto punto1) {
        this.radio = radio;
        this.punto1 = punto1;
    }

    Circunferencia(double radio, double puntoX, double puntoY) {
    this.radio =radio;
    punto1.setX(puntoX);
    punto1.setY(puntoY);
    }



    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {

        return "Circunferencia{" +
                "circunferencia=" + radio +
                '}';
    }
}
