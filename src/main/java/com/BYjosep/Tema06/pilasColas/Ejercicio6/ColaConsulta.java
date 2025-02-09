package com.BYjosep.Tema06.pilasColas.Ejercicio6;

import java.time.LocalDateTime;

public class ColaConsulta {
    private int idColaconsulta= 0;
    private Consulta[] consulta;
    private Medico[] medico;
    private final int tamanoCola = 5;

    public ColaConsulta() {
        this.idColaconsulta = idColaconsulta++;
        consulta = setConsulta();
        medico = new Medico[tamanoCola];
    }

    public Consulta[] setConsulta() {
        Consulta[] consulta= new Consulta[tamanoCola];
        for (int i = 0; i < tamanoCola; i++) {
            consulta[i] = Consulta(fechaHoraConsulta, nombrePaciente, sipPaciente);
        }
        return consulta;
    }

    public Medico[] setMedico() {
        Medico[] medico= new Medico[tamanoCola];
        for (int i = 0; i < tamanoCola; i++) {
            medico[i]= Medico(String nombre, int numeroColegiado, LocalDateTime horaConsulta)
        }
    }
}
