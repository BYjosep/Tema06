package com.BYjosep.Tema06.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        String asignaturas = "programacion";
        int codigo = 1017;
        String curso = "Curso 1";

        Asignatoras asignatura = new Asignatoras(asignaturas, codigo, curso);

        System.out.printf("nombre %S, codigo %d, curso %S ", asignatura.getNombre(), asignatura.getCodigo(), asignatura.getCurso());
    }

}
