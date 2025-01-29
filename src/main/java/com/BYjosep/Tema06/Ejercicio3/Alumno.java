package com.BYjosep.Tema06.Ejercicio3;

import java.time.LocalDate;

public class Alumno {
    private int nia;
    private String nombre, apellido;
    private LocalDate fechaNacimiento;
    private char grupo;
    private int telefono;

    Alumno(int nia, String nombre, String apellido,
           LocalDate fechaNacimiento, char grupo, int telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.grupo = grupo;
        this.telefono = telefono;
    }

    Alumno() {
        nia = 000000000;
        nombre = "Nombre";
        apellido = "Apellido";
        fechaNacimiento = LocalDate.now();
        grupo = 'A';
        telefono = 000000000;
    }

    /*
     ***********
     * Setters *
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

    public char getGrupo() {
        return grupo;
    }


    public int getTelefono() {
        return telefono;
    }


    /*
       ***********
       * Setters *
       ***********
    */

    public void setNia(int nia) {
        this.nia = nia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
