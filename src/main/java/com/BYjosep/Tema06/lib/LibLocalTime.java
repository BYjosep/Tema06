package com.BYjosep.Tema06.lib;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class LibLocalTime {

    static Scanner scanner = new Scanner(System.in);

    public static void cerrarScanner() {
        scanner.close();
    }


    public static LocalDate IngresarFecha(String texto, String formato) {
        String string;
        int [] array = new int[];
        LocalDate fecha;
        System.out.printf("%S con el formato %S", texto, formato);
        string = scanner.nextLine();


        return fecha;
    }
}
