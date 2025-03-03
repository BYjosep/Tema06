package com.BYjosep.Tema06.ejercicio7;

import java.time.LocalDate;
import java.time.LocalTime;

public class Paciente {

    public enum Sexo {
        Hombre, Mujer
    }

    private final int sip;
    private final String nombre;
    private final Sexo sexo;
    private final int edad;


    public Paciente(int sip, String nombre, Sexo sexo, int edad,
                    LocalDate fechaEntrada, LocalTime horaEntrada,
                    String sintoma) {
        this.sip = sip;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;


    }

    Paciente(Paciente paciente) {
        this.sip = paciente.sip;
        this.nombre = paciente.nombre;
        this.sexo = paciente.sexo;
        this.edad = paciente.edad;

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
        if (preRev[3] != 0) {
            sb.append(", preRev=");

            for (int i = 0; i < preRev.length; i++) {
                sb.append(Constantes.valueOf(String.valueOf(i))).append("=").append(preRev[i]);
            }
        }


        sb.append('}');

        return sb.toString();
    }


    public int getSip() {
        return sip;
    }

    public String getNombre() {
        return nombre;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public String getSintoma() {
        return sintoma;
    }

    public float[] getPreRev() {
        return preRev;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public LocalTime getHoraAlta() {
        return horaAlta;
    }

    public String getMotivoAlta() {
        return motivoAlta;
    }

    public boolean getAltaMedica() {
        return altaMedica;
    }

    public float getTemperatura() {
        return preRev[0];
    }

    public float getPpm() {
        return preRev[1];
    }

    public float getTensionSistolica() {
        return preRev[2];
    }

    public float getTensionDiastolica() {
        return preRev[3];
    }
}
