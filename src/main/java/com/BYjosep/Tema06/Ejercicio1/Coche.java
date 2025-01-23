package com.BYjosep.Tema06.Ejercicio1;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private boolean pinturaMetalizada;
    private enum TipoCoche {
        MINI, UTILITARIO, FAMILIAR, DEPORTIVO
    }
    private TipoCoche tipoCoche;
    private int anoDeCoche;
    private enum Seguro{
        TERCEROS, A_TODO_RIESGO
    }
    private Seguro seguro;

    public Coche(String marca, String modelo, String color,
                 boolean pinturaMetalizada, TipoCoche tipoCoche,
                 int anoDeCoche, Seguro seguro) {

        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.pinturaMetalizada = pinturaMetalizada;
        this.tipoCoche = tipoCoche;
        this.anoDeCoche = anoDeCoche;
        this.seguro = seguro;
    }
    public Coche() {
        this("Toyota","Corola","Blanco",false,TipoCoche.FAMILIAR,
                1966, Seguro.TERCEROS);
    }
}
