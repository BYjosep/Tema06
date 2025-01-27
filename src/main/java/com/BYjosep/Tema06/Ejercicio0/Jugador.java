package com.BYjosep.Tema06.Ejercicio0;

public class Jugador {
    public static void main(String[] args) {

        Jugador futbolista1 = new Jugador("Aitana Bonmatí", 32, 82, 87, 80, 82, 95);
        Jugador futbolista2 = new Jugador("Pablo Gavi", 32, 82, 87, 80, 82, 95);
        Jugador futbolista3 = new Jugador("Ana García");
        Jugador futbolista4 = new Jugador("Rubén Prieto");
    }
    private static String nombre;

    private static float portero, defensa, pase, regate, tiro, estadoForma;

    public Jugador(String nombre, float portero, float defensa, float pase, float regate, float
            tiro, float estadoForma) {
        this.nombre = nombre;
        this.portero = portero;
        this.defensa = defensa;
        this.pase = pase;
        this.regate = regate;
        this.tiro = tiro;
        this.estadoForma = estadoForma;
    }


    public Jugador(String nombre) {
        this(nombre, 50,50,50,50,50,50);
    }

    public static float getEstadoForma() {
        return estadoForma;
    }

    public static void setEstadoForma(float estadoForma) {
        Jugador.estadoForma = estadoForma;
    }

    public static float getTiro() {
        return tiro;
    }

    public static void setTiro(float tiro) {
        Jugador.tiro = tiro;
    }

    public static float getRegate() {
        return regate;
    }

    public static void setRegate(float regate) {
        Jugador.regate = regate;
    }

    public static float getPase() {
        return pase;
    }

    public static void setPase(float pase) {
        Jugador.pase = pase;
    }

    public static float getDefensa() {
        return defensa;
    }

    public static void setDefensa(float defensa) {
        Jugador.defensa = defensa;
    }

    public static float getPortero() {
        return portero;
    }

    public static void setPortero(float portero) {
        Jugador.portero = portero;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Jugador.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador{}";
    }
}
