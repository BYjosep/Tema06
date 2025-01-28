package com.BYjosep.Tema06.Ejercicio0;

public class Equipo {

    private static final int MAX_JUGADORES = 25;
    private final Jugador[] jugadores;
    private int numeroJugadores;
    private Equipo Arrays;

    public Equipo() {
        jugadores = new Jugador[MAX_JUGADORES];
        numeroJugadores = 0;
    }
    public boolean addJugador(String nombre, float portero, float defensa, float pase, float regate, float tiro, float estadoForma) {
        if (numeroJugadores < MAX_JUGADORES) {
            jugadores[numeroJugadores] = new Jugador(nombre, portero, defensa, pase, regate, tiro, estadoForma);
            numeroJugadores++;
            return true;
        }
        return false;
    }
    public void entrenar() {
        for (Jugador j : jugadores) {
            j.entrenarPase();
        }
    }
    // Resto de métodos
    @Override
    public String toString() {
        return "Equipo{" +
                ", jugadores=" + Arrays.toString() +
                ", numeroJugadores=" + numeroJugadores +
                '}';
    }

}
