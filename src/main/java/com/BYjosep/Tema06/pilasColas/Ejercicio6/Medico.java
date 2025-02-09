package com.BYjosep.Tema06.pilasColas.Ejercicio6;

import java.time.LocalDateTime;


public class Medico {

    private String nombre;
    private String numeroColegiado;
    private LocalDateTime horaConsulta;
    private final String NUMERO_COLEGIADO_DEFAULT = "012345";

    Medico(String nombre, int numeroColegiado, LocalDateTime horaConsulta) {
        this.nombre = nombre;
        this.numeroColegiado = intToString(numeroColegiado);
        this.horaConsulta = horaConsulta;
    }
    Medico() {
        this.nombre = "Medico";
        numeroColegiado = NUMERO_COLEGIADO_DEFAULT;
        horaConsulta = LocalDateTime.now();
    }

    private static String intToString(int numero) {

        if (Integer.toString(numero).length() > 6) {
            return null;
        }else {
        return String.format("%06d",numero);
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", numeroColegiado='" + numeroColegiado + '\'' +
                ", horaConsulta=" + horaConsulta +
                ", NUMERO_COLEGIADO_DEFAULT='" + NUMERO_COLEGIADO_DEFAULT + '\'' +
                '}';
    }

}

