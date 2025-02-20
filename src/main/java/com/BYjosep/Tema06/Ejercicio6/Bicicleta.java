package com.BYjosep.Tema06.Ejercicio6;

import java.util.GregorianCalendar;

public class Bicicleta {
    private int referencia = 0;
    private final String marca;
    private final String modelo;
    private final float peso;
    private final boolean tieneMotor;
    private final GregorianCalendar fechaFabricacion;
    private final float precio;
    private int existencias;


    public Bicicleta(String marca, String modelo, float peso,
                     boolean tieneMotor, GregorianCalendar fechaFabricacion,
                     float precio, int existencias) {
        this.referencia = referencia++;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.tieneMotor = tieneMotor;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
        this.existencias = existencias;
    }


    public Bicicleta() {

        this.referencia = referencia++;
        this.marca = null;
        this.modelo = null;
        this.peso = 0;
        this.tieneMotor = false;
        this.fechaFabricacion = null;
        this.precio = 0;
        this.existencias = 0;

    }


    @Override
    public String toString() {
        return "Bicicleta{" +
                "referencia=" + referencia +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", tieneMotor=" + tieneMotor +
                ", fechaFabricacion=" + fechaFabricacion +
                ", precio=" + precio +
                ", existencias=" + existencias +
                '}';
    }

    public int getReferencia() {
        return referencia;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int i) {
        ++existencias;
    }

}
