package com.BYjosep.Tema06.Ejercicio2;

import java.util.Objects;

public class Asignatoras {
    private final String nombre;
    private final String curso;
    private final int codigo;

    public Asignatoras(String nombre, int codigo, String curso) {
        this.nombre = nombre;
        this.curso = curso;
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Asignatoras that = (Asignatoras) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(curso, that.curso) && Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, curso, codigo);
    }
}
