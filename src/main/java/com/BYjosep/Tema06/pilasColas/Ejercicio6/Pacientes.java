package com.BYjosep.Tema06.pilasColas.Ejercicio6;

import java.time.LocalDateTime;

public class Pacientes {
    private String nombre;
    private String sip;
    private LocalDateTime fechaHoraIngreso;
    private LocalDateTime fechaHoraLlegada;

    public Pacientes(String nombre, String sip, LocalDateTime fechaHoraConsulta) {
        this.nombre = nombre;
        this.sip = setSip(sip); // Validar el SIP.
        this.fechaHoraIngreso = fechaHoraConsulta;
        this.fechaHoraLlegada = LocalDateTime.MIN;

        if (this.sip == null) { // Si el SIP es nulo, mostrar mensaje de error.
            System.err.println("Por favor, ingrese un SIP válido.");
        }
    }

    public String setSip(String sip) {
        if (sip == null || sip.length() != 9) {
            System.err.println("El SIP es incorrecto");
            return null;
        }
        // Verificar que los primeros 8 caracteres sean dígitos.
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(sip.charAt(i))) {
                System.err.println("El SIP es incorrecto");
                Main.menu();
            }
        }
        // Verificar que el último carácter sea una letra.
        if (!Character.isLetter(sip.charAt(8))) {
            System.err.println("El SIP es incorrecto");
            Main.menu();
        }
        return sip.toUpperCase(); // Retorna el SIP en mayúsculas.
    }

    public String getSip() {
        return sip;
    }

    @Override
    public String toString() {
        return "Pacientes{" +
                "nombre='" + nombre + '\'' +
                ", sip='" + sip + '\'' +
                ", fechaHoraIngreso=" + fechaHoraIngreso +
                '}';
    }
}