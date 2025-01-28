package com.BYjosep.Tema06.Ejercicio4;

import com.BYjosep.Tema06.lib.LibDoubles;

public class Punto {
    private double x, y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    // Getter

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    // setters

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static String distancis(Punto punto1) {
        double p1x = punto1.getX();
        double p1y = punto1.getY();
        double p2x = LibDoubles.ingresarUnNumeroD("Ingrese el valor de x");
        double p2y = LibDoubles.ingresarUnNumeroD("Ingrese el valor de y");
        Punto distancia = new Punto();
        distancia.setX(p1x - p2x);
        distancia.setY(p1y - p2y);

        return distancia.toString();
    }

    @Override
    public String toString() {
        return "Punto{" +
                " x=" + x +
                " , y=" + y +
                " }";
    }
}
