package com.BYjosep.Tema06.CocheMejorado;

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


    private String setMatricula() {
        if (letrasMatricula[0] >= 'Z' && numeroMatricula >= 9999) {
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
}
