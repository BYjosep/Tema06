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

    //  getters
    public String getColor() {
        return color;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAnoDeCoche() {
        return anoDeCoche;
    }
    public TipoCoche getTipoCoche() {
        return tipoCoche;
    }
    public Seguro getSeguro() {
        return seguro;
    }

    public boolean isPinturaMetalizada() {
        return pinturaMetalizada;
    }

    // Setters
    public void setTipoCoche(TipoCoche tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    public void setAnoDeCoche(int anoDeCoche) {
        this.anoDeCoche = anoDeCoche;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public void setPinturaMetalizada(boolean pinturaMetalizada) {
        this.pinturaMetalizada = pinturaMetalizada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }



    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ",\nmodelo='" + modelo + '\'' +
                ",\ncolor='" + color + '\'' +
                ",\npinturaMetalizada=" + pinturaMetalizada +
                ",\ntipoCoche=" + tipoCoche +
                ",\nanoDeCoche=" + anoDeCoche +
                ",\nseguro=" + seguro +
                '}';
    }
}
