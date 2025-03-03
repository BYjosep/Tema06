package com.BYjosep.Tema06.ejercicio7;

import java.time.LocalDate;
import java.time.LocalTime;

public class AtencionPaciente {
    public enum Constantes {
        TEMPERATURA, PPM, TENSION_SISTOLICA, TENSIOM_DIASTOLICA
    }

    private final Paciente paciente;

    private final LocalDate fechaEntrada;
    private final LocalTime horaEntrada;
    private final String sintoma;
    private final float[] preRev;
    private LocalDate fechaAlta;
    private LocalTime horaAlta;
    private String motivoAlta;
    private boolean altaMedica;

    public AtencionPaciente(Paciente paciente, LocalDate fechaEntrada,
                            LocalTime horaEntrada, String sintoma,
                            float[] preRev, LocalDate fechaAlta,
                            LocalTime horaAlta, String motivoAlta, boolean altaMedica) {

        this.paciente = paciente;
        this.fechaEntrada = fechaEntrada;
        this.horaEntrada = horaEntrada;
        this.sintoma = sintoma;
        this.preRev = preRev;
        this.fechaAlta = fechaAlta;
        this.horaAlta = horaAlta;
        this.motivoAlta = motivoAlta;
        this.altaMedica = altaMedica;
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
        if (preRev[1] == 0 && ppm == 0) return false;
        preRev[1] = ppm;
        return true;
    }

    private boolean setTensionSistolica(float tensionSistolica) {
        if (preRev[2] == 0 && tensionSistolica == 0) return false;
        preRev[2] = tensionSistolica;
        return true;
    }

    private boolean setTensionDiastolica(float tensionDiastolica) {
        if (preRev[3] == 0 && tensionDiastolica == 0) return false;
        preRev[3] = tensionDiastolica;
        return true;
    }

}
