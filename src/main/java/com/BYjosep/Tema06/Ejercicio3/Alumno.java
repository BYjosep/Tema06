package com.BYjosep.Tema06.Ejercicio3;

import java.time.LocalDate;

public class Alumno {
    private final int nia;
    private final String nombre, apellido;
    private final LocalDate fechaNacimiento;
    private final String grupo;
    private final int telefono;

    Alumno(int nia, String nombre, String apellido,
           LocalDate fechaNacimiento, String grupo, int telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.grupo = grupo;
        this.telefono = telefono;
    }

    Alumno() {
        this.nia = 0;
        this.nombre = null;
        this.apellido = null;
        this.fechaNacimiento = null;
        this.grupo = null;
        this.telefono = 0;
    }

    /*
     ***********
     * Getters *
     ***********
     */

    public int getNia() {
        return nia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getGrupo() {
        return grupo;
    }


    public int getTelefono() {
        return telefono;
    }





}
