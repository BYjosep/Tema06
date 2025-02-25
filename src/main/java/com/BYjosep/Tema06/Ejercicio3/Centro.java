package com.BYjosep.Tema06.Ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Centro {
    private final int MAX_ALUMNOS = 100;
    Alumno[] alumnos;
    private int size;

    public Centro() {
        alumnos = new Alumno[MAX_ALUMNOS];
        size = 0;
    }

    public void crearAlumno() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un nia");
        int nia = Integer.parseInt(scanner.nextLine());

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

}
