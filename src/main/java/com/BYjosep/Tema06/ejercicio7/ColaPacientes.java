package com.BYjosep.Tema06.ejercicio7;


import java.time.LocalDate;
import java.time.LocalTime;

public class ColaPacientes {

    private final int TAMANO_MAXIMO;
    Pacientes[] pacientes;
    private int size;

    ColaPacientes(int TAMANO_MAXIMO) {
        this.TAMANO_MAXIMO = TAMANO_MAXIMO;
        pacientes = new Pacientes[TAMANO_MAXIMO];
        this.size = 0;
    }


    public boolean nuevoPaciente(int sip, String nombre, char sexo, int edad,
                                 LocalDate fechaEntrada, LocalTime horaEntrada,
                                 String sintoma) {
        if (size == TAMANO_MAXIMO) {
            return false;
        }
        pacientes[size] = new Pacientes(sip, nombre, sexo, edad,
                fechaEntrada, horaEntrada, sintoma);
        size++;
        return true;
    }

    public boolean atenderPaciente(int sip, float temperatura, int ppm, float tensionSistolica,
                                   float tensionDiastolica) {
        if (size == 0) {
            return false;
        }
        for (int i = size--; i > 0; i--) {
            if (sip == pacientes[i].getSip() && pacientes[i].getFechaAlta() == null) {
                System.out.println(pacientes[i]);
                pacientes[i].setConstantes(temperatura, ppm, tensionSistolica, tensionDiastolica);
                return true;
            }
        }
        return false;
    }

    public boolean altaMedica(int sip, String motivoDelAlta) {
        if (size == 0) return false;
        for (int i = size - 1; i > 0; i--) {
            if (sip == pacientes[i].getSip() && !pacientes[i].getAltaMedica()) {
                pacientes[i].setMotivoAlta(motivoDelAlta);
                pacientes[i].setFechaAlta(LocalDate.now());
                pacientes[i].setHoraAlta(LocalTime.now());
                pacientes[i].setAltaMedica();
                return true;
            }
        }
        return false;
    }

        /*

    public Pacientes[] consultaPorSip(int sip) {
        if (size == 0) return null;

    }

    public Pacientes[] consultaPorFechas(LocalDate fecha) {
        if (size == 0) return null;

    }

    public Pacientes[] consultaHistorico(){
        if (size == 0) return null;

    }


         */

}
