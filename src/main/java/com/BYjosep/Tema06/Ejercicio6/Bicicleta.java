package com.BYjosep.Tema06.Ejercicio6;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Bicicleta {
    private int referencia = 0;
    private final String marca;
    private final String modelo;
    private final float peso;
    private final boolean tieneMotor;
    private final GregorianCalendar fechaFabricacion;
    private final float precio;
    private final float tamanoDeLaRueda;
    private int existencias;


    public Bicicleta(String marca, String modelo, float peso, float tamanoDeLaRueda,
                     boolean tieneMotor, GregorianCalendar fechaFabricacion,
                     float precio, int existencias) {
        this.referencia = referencia++;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.tieneMotor = tieneMotor;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
        this.tamanoDeLaRueda = tamanoDeLaRueda;
        this.existencias = existencias;
    }


    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = sdf.format(fechaFabricacion.getTime());
        return "Bicicleta{" +
                "referencia=" + referencia +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", tamño de la rueda= " + tamanoDeLaRueda + '\'' +
                ", tieneMotor= " + tieneMotor +
                ", fechaFabricacion= " + fechaFormateada +
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

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setExistencias(int i) {
        ++existencias;
    }

}
