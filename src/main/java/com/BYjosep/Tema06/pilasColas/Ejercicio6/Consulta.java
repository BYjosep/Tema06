package com.BYjosep.Tema06.pilasColas.Ejercicio6;

import java.time.LocalDateTime;

public class Consulta {
    private int idConsulta = 0;
    private Medico medico;
    private Pacientes paciente;

    public Consulta(Pacientes paciente) {
        this.idConsulta = idConsulta++;
        this.paciente = new Pacientes();
    }
    public Consulta(LocalDateTime fechaHoraConsulta,String nombrePaciente, String sipPaciente) {
        this.idConsulta = idConsulta++;
        this.paciente = new Pacientes(nombrePaciente,sipPaciente,fechaHoraConsulta);
    }


    private String getPaciente() {
        return paciente.toString();
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "idConsulta=" + idConsulta +
                ", " + getPaciente() +
                '}';
    }
}
