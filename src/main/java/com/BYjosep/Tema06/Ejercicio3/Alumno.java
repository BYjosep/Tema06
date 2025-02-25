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
