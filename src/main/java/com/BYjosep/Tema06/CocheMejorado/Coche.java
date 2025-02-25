package com.BYjosep.Tema06.CocheMejorado;

import java.util.Arrays;
import java.util.Objects;

public class Coche {
    private final String ERROR = "No se pueden añadir más matrículas";
    private final String matricula;
    private int numeroMatricula = 0;
    private final char[] letrasMatricula = {'A', 'A', 'A'};
    private final String marca;
    private final String modelo;
    private final String color;
    private final boolean pinturaMetalizada;

    public Coche(String marca, String modelo, String color, boolean pinturaMetalizada) {
        this.matricula = setMatricula();
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.pinturaMetalizada = pinturaMetalizada;
    }


    /**
     * Crea una matricula
     *
     * @return devuelve un String de una matricula
     */
    private String setMatricula() {
        if (letrasMatricula[0] >= 'Z' && letrasMatricula[1] >= 'Z' && letrasMatricula[2] >= 'Z' && numeroMatricula >= 9999) {
            return ERROR;
        }

        String sb = String.format("%40D", numeroMatricula) + letrasMatricula[0] + letrasMatricula[1] + letrasMatricula[2];

        if (numeroMatricula == 9999) {
            numeroMatricula = 0;
            if (letrasMatricula[2] == 'Z') {

                if (letrasMatricula[1] == 'Z') {
                    letrasMatricula[0] = (char) (letrasMatricula[0] + 1);
                    letrasMatricula[1] = 'A';

                } else {
                    letrasMatricula[1] = (char) (letrasMatricula[1] + 1);
                }

                letrasMatricula[2] = 'A';
            } else {
                letrasMatricula[2] = (char) (letrasMatricula[2] + 1);
            }
        } else {
            numeroMatricula++;
        }

        return sb;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return numeroMatricula == coche.numeroMatricula && pinturaMetalizada == coche.pinturaMetalizada && Objects.equals(matricula, coche.matricula) && Objects.deepEquals(letrasMatricula, coche.letrasMatricula) && Objects.equals(marca, coche.marca) && Objects.equals(modelo, coche.modelo) && Objects.equals(color, coche.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, numeroMatricula, Arrays.hashCode(letrasMatricula), marca, modelo, color, pinturaMetalizada);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "ERROR='" + ERROR + '\'' +
                ", matricula='" + matricula + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                ", letrasMatricula=" + Arrays.toString(letrasMatricula) +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", pinturaMetalizada=" + pinturaMetalizada +
                '}';
    }
}
