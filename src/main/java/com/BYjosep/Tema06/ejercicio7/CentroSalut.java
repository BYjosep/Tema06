package com.BYjosep.Tema06.ejercicio7;


import java.time.LocalDate;
import java.time.LocalTime;

public class CentroSalut {

    private final int TAMANO_MAXIMO;
    Paciente[] pacientes;
    private int size;

    CentroSalut(int TAMANO_MAXIMO) {
        this.TAMANO_MAXIMO = TAMANO_MAXIMO;
        pacientes = new Paciente[TAMANO_MAXIMO];
        this.size = 0;
    }


    public boolean nuevoPaciente(int sip, String nombre, Paciente.Sexo sexo, int edad,
                                 LocalDate fechaEntrada, LocalTime horaEntrada,
                                 String sintoma) {
        if (size == TAMANO_MAXIMO) {
            return false;
        }
        pacientes[size] = new Paciente(sip, nombre, sexo, edad,
                fechaEntrada, horaEntrada, sintoma);
        size++;
        return true;
    }

    /*
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

     */

    /*
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


     */


    public Paciente[] consultaPorSip(int sip) {
        if (size == 0) return null;
        Paciente[] consulta = new Paciente[size];
        for (int i = 0; i < size; i++) {
            if (pacientes[i].getSip() == sip) {
                consulta[i] = new Paciente(pacientes[i]);
            }
        }

        return consulta;
    }

    public Paciente[] consultaPorFechas(LocalDate fecha) {
        if (size == 0) return null;
        Paciente[] consulta = new Paciente[size];
        for (int i = 0; i < size; i++) {
            if (pacientes[i].getFechaEntrada() == fecha || pacientes[i].getFechaAlta() == fecha) {
                consulta[i] = pacientes[i];
            }

        }

        return consulta;
    }

    public Paciente[] consultaHistorico() {
        if (size == 0) return null;
        Paciente[] consulta = new Paciente[size];
        for (int i = 0; i < size; i++) {
            consulta[i] = new Paciente(pacientes[i]);
        }
        return consulta;
    }


    public String estadisticas() {
        float aux = 0;
        int hombres = 0, mujeres = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("Media de temperatura: ");
        for (int i = 0; i < size; i++) {
            aux = +pacientes[i].getTemperatura();
        }
        sb.append((aux / size)).append("\n");
        aux = 0;

        sb.append("Media de pulsaciones: ");

        for (int i = 0; i < size; i++) {
            aux = +pacientes[i].getPpm();
        }
        sb.append((aux / size)).append("\n");
        aux = 0;

        sb.append("Media de tension sistolica: ");
        for (int i = 0; i < size; i++) {
            aux = +pacientes[i].getTensionSistolica();
        }
        sb.append((aux / size)).append("\n");
        aux = 0;

        sb.append("Media de tension diastolica: ");
        for (int i = 0; i < size; i++) {
            aux = +pacientes[i].getPpm();
        }
        sb.append((aux / size)).append("\n");
        aux = 0;

        sb.append("Media de edad: ");
        for (int i = 0; i < size; i++) {
            aux = +pacientes[i].getEdad();
        }
        sb.append((aux / size)).append("\n");


        for (int i = 0; i < size; i++) {
            if (pacientes[i].getSexo().equals(Paciente.Sexo.Hombre)) {
                ++hombres;
            } else if (pacientes[i].getSexo().equals(Paciente.Sexo.Mujer)) {
                ++mujeres;
            }
        }

        sb.append("Porcentaje de hombres: ");
        sb.append(((hombres * size) / 100)).append("\n");
        sb.append("Porcentaje de mujeres: ");
        sb.append(((mujeres * size) / 100)).append("\n");
        return sb.toString();
    }


}
