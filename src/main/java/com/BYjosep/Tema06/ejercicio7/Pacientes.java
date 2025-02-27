package com.BYjosep.Tema06.ejercicio7;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pacientes {
    public enum constantes {
        TEMPERATURA, PPM, TENSION_SISTOLICA, TENSIOM_DIASTOLICA
    }

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
    private boolean altaMedica;

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
        this.altaMedica = false;

    }

    /**
     * setter para hacer la medicion con las constantes vitales
     *
     * @param temperatura       se usa un float
     * @param ppm               se usa un int
     * @param tensionSistolica  se usa un float
     * @param tensionDiastolica se usa un float
     * @return en caso de no poder añadir un valor devuelve false
     */
    public boolean setConstantes(float temperatura, int ppm, float tensionSistolica, float tensionDiastolica) {
        boolean check;
        check = setTemperatura(temperatura);
        if (!check) return false;
        check = setPpm(ppm);
        if (!check) return false;
        check = setTensionSistolica(tensionSistolica);
        if (!check) return false;

        check = setTensionDiastolica(tensionDiastolica);

        return check;

    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setHoraAlta(LocalTime horaAlta) {
        this.horaAlta = horaAlta;
    }

    public void setAltaMedica() {
        this.altaMedica = true;
    }

    public void setMotivoAlta(String motivoAlta) {
        this.motivoAlta = motivoAlta;
    }

    private boolean setTemperatura(float temperatura) {
        if (preRev[0] == 0 && temperatura == 0) return false;
        preRev[0] = temperatura;
        return true;
    }

    private boolean setPpm(int ppm) {
        if (preRev[1] == 0 && ppm == 0)return false;
        preRev[1] = ppm;
        return true;
    }

    private boolean setTensionSistolica(float tensionSistolica) {
        if (preRev[2] == 0 && tensionSistolica == 0) return false;
        preRev[2] = tensionSistolica;
        return true;
    }

    private boolean setTensionDiastolica(float tensionDiastolica) {
        if (preRev[3] == 0 && tensionDiastolica == 0)return false;
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
        if (preRev != null) {
            sb.append(", preRev=");

            for (int i = 0; i < preRev.length; i++) {
                sb.append(constantes.valueOf(String.valueOf(i))).append("=").append(preRev[i]);
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

    public char getSexo() {
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
}
