package com.BYjosep.Tema06.Ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Centro {
    Scanner scanner = new Scanner(System.in);
    private final int MAX_ALUMNOS = 100;
    Alumno[] alumnos;
    private int size;

    public Centro() {
        alumnos = new Alumno[MAX_ALUMNOS];
        size = 0;
    }

    /**
     * Metodo para crear un alumno nuevo
     */
    public void crearAlumno() {
        int nia;

        do {
            System.out.println("Ingresa un nia");
            nia = Integer.parseInt(scanner.nextLine());

        } while (!niaValido(nia));

        System.out.println("Ingresa nombre");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa apellido");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese una fesha");
        String fechaStr = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fechaStr, formatter);

        System.out.println("Ingrese el grupo");
        String grupo = scanner.nextLine();

        System.out.println("Ingrese el telefono");
        int telefono = Integer.parseInt(scanner.nextLine());


        alumnos[size] = new Alumno(nia, nombre, apellido, fecha, grupo, telefono);
        size++;

    }

    /**
     * si el alumno no existe da de baja al alumno
     *
     * @return devuelve un boolean para confirmar que se ha dado de baja un alumno
     */
    public boolean bajaAlumno() {
        if (size == 0) {
            return false;
        }
        int nia;
        do {
            System.out.println("Ingresa el nia del alumno (-1 para salir)");
            nia = Integer.parseInt(scanner.nextLine());
            if (nia == -1) {
                return false;
            }
        } while (niaValido(nia));
        for (int i = 0; i < size; i++) {
            if (alumnos[i].getNia() == nia) {
                for (int j = i; j < size; j++) {
                    alumnos[j] = alumnos[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public void consultarAlumnos() {

    }

    private void consultaPorGrupo() {
        StringBuilder sb = new StringBuilder();
        Alumno auxAlumno;
        Alumno[] aux = new Alumno[size];

        for (int i = 0; i < size; i++) {

        }

    }

    private void consultaPorEdad() {
        StringBuilder sb = new StringBuilder();

        Alumno auxAlumno;
        Alumno[] aux = new Alumno[size];

        for (int i = 0; i < size; i++) {

        }
    }

    private void consultaPorNia() {
        StringBuilder sb = new StringBuilder();

        Alumno auxAlumno = new Alumno();
        Alumno[] aux = new Alumno[size];
        aux[0] = alumnos[0];
        for (int i = 0; i < size; i++) {

            if (alumnos[i].getNia() < aux[i].getNia()) {
                auxAlumno = aux[i];
                aux[i - 1] = alumnos[i];
                aux[i] = auxAlumno;

            }

        }
    }

    private void consultaPorApellido() {
        StringBuilder sb = new StringBuilder();

    }


    /**
     * @param nia nia a verificar que no exista
     * @return devuelve un valor boolean para indicar si el bucle se rompe o no
     */
    private boolean niaValido(int nia) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNia() == nia) {
                return false;
            }
        }
        return true;
    }

}
