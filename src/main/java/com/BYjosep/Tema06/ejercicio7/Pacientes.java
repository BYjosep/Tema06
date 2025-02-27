package com.BYjosep.Tema06.ejercicio7;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pacientes {
    private final int sip;
    private final String nombre;
    private final char sexo;
    private final int edad;
    private final LocalDate fechaEntrada;
    private final LocalTime horaEntrada;
    private final String sintoma;
    private final float[] preRev;
    private LocalDate fechaAlta;
    private LocalTime horaAlta;
    private String motivoAlta;
    public Pacientes(int sip, String nombre, char sexo, int edad,
                     LocalDate fechaEntrada, LocalTime horaEntrada,
                     String sintoma) {
        this.sip = sip;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.fechaEntrada = fechaEntrada;
        this.horaEntrada = horaEntrada;
        this.sintoma = sintoma;
        this.preRev = new float[4];
        this.fechaAlta = null;
        this.horaAlta = null;
        this.motivoAlta = null;
    }

    public boolean setTemperatura(float temperatura) {
        preRev[0] = temperatura;
        return true;
    }

    public boolean setPpm(int ppm) {
        preRev[1] = ppm;
        return true;
    }

    public boolean setTensionSistolica(float tensionsiStolica) {
        preRev[2] = tensionsiStolica;
        return true;
    }

    public boolean setTensionDiastolica(float tensionDiastolica) {
        preRev[3] = tensionDiastolica;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Pacientes{").append("sip=").append(sip);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", sexo=").append(sexo);
        sb.append(", edad=").append(edad);
        sb.append(", fechaEntrada=").append(fechaEntrada);
        sb.append(", horaEntrada=").append(horaEntrada);
        sb.append(", sintoma=").append(sintoma);
        sb.append(", preRev=");

        for (int i = 0; i < preRev.length; i++) {
            sb.append(constantes.valueOf(String.valueOf(i))).append("=").append(preRev[i]);
        }

        sb.append('}');

        return sb.toString();
    }

    public enum constantes {
        TEMPERATURA, PPM, TENSION_SISTOLICA, TENSIOM_DIASTOLICA
    }
}
