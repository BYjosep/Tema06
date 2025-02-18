package com.BYjosep.Tema06.pilasColas.Hospital;

import com.BYjosep.Tema06.pilasColas.Generics.Cola;

public class ColaConsulta {
    private final Medico medico; // Médico asignado a la consulta.
    private final Cola<Pacientes> cola; // Cola de pacientes.

    // Constructor: inicializa el médico y la cola.
    public ColaConsulta(Medico medico) {
        this.medico = medico;
        this.cola = new Cola<>();
    }

    public Medico getMedico() {
        return medico;
    }

    public Cola<Pacientes> getCola() {
        return cola;
    }

    @Override
    public String toString() {
        return "Médico: " + medico.getNombre() + ", Cola: " + cola.toString();
    }
}