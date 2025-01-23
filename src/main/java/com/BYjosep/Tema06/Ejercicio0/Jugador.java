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
}
