package com.BYjosep.Tema06.lib;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class LibLocalTime {

    static Scanner scanner = new Scanner(System.in);

    public static void cerrarScanner() {
        scanner.close();
    }


    public static LocalDate IngresarFecha(String texto, String formato) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
        LocalDate fecha = null;
        boolean fechaValida = false;

        do {
            System.out.printf("%s con el formato %s: ", texto, formato);
            String string = scanner.nextLine();

            try {
                fecha = LocalDate.parse(string, formatter);
                fechaValida = true; // Si no lanza error, la fecha es válida
            } catch (DateTimeParseException e) {
                System.err.printf("ERROR: La fecha ingresada no es válida. Use el formato %s%n", formato);
            }

        } while (!fechaValida); // Sigue pidiendo hasta que la fecha sea válida

        return fecha;
    }
}
