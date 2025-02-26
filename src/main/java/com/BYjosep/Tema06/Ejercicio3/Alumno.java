package com.BYjosep.Tema06.Ejercicio3;

import java.time.LocalDate;
import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return nia == alumno.nia && telefono == alumno.telefono && Objects.equals(nombre, alumno.nombre) && Objects.equals(apellido, alumno.apellido) && Objects.equals(fechaNacimiento, alumno.fechaNacimiento) && Objects.equals(grupo, alumno.grupo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nia, nombre, apellido, fechaNacimiento, grupo, telefono);
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "nia=" + nia +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", grupo='" + grupo + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
