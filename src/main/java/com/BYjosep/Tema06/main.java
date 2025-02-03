package com.BYjosep.Tema06;

import com.BYjosep.Tema06.lib.LibLocalTime;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        LocalDate fecha = LibLocalTime.IngresarFecha(
                "Ingresa una fecha", "DD-MM-YYYY");
        System.out.println(fecha);
    }
}
