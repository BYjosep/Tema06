package com.BYjosep.Tema06.pilasColas.Ejercicio6;

import java.time.LocalDateTime;
import java.util.Scanner;
import com.BYjosep.Tema06.pilasColas.Generics.Cola;

public class Hospital {
    private ColaConsulta[] consultas; // Array de consultas.

    // Constructor: crea 5 consultas con médicos y pacientes aleatorios.
    public Hospital() {
        consultas = new ColaConsulta[5];

        // Crear 5 médicos con datos aleatorios.
        Medico[] medicos = new Medico[5];
        for (int i = 0; i < 5; i++) {
            medicos[i] = new Medico("Médico " + (i + 1), 100000 + i, LocalDateTime.now());
        }

        // Asignar un médico a cada consulta y rellenar las colas con pacientes aleatorios.
        for (int i = 0; i < 5; i++) {
            consultas[i] = new ColaConsulta(medicos[i]);
            for (int j = 0; j < 5; j++) {
                String sip = generarSIPAleatorio(); // Generar un SIP válido.
                Pacientes paciente = new Pacientes(
                        "Paciente " + (j + 1),
                        sip,
                        LocalDateTime.now().minusHours(j)
                );
                if (paciente.getSip() == null) { // Verificar si el SIP es válido.
                    System.err.println("Error: No se pudo crear el paciente con SIP " + sip);
                } else {
                    consultas[i].getCola().add(paciente); // Añadir el paciente a la cola.
                }
            }
        }
    }

    // Método para añadir un paciente a una consulta específica.
    public void anadirPaciente(Scanner scanner) {
        // Mostrar el estado actual de las colas.
        mostrarColas();

        System.out.print("Elige una consulta (1-5): ");
        int indiceConsulta = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpiar el buffer

        // Validar que el índice de la consulta sea válido.
        if (indiceConsulta < 0 || indiceConsulta >= 5) {
            System.out.println("El número de consulta debe estar entre 1 y 5.");
            return;
        }

        // Validar que la cola no sea nula.
        if (consultas[indiceConsulta] == null || consultas[indiceConsulta].getCola() == null) {
            System.out.println("La cola de esta consulta no está inicializada correctamente.");
            return;
        }

        // Solicitar los datos del paciente.
        System.out.print("Nombre del paciente: ");
        String nombre = scanner.nextLine();
        System.out.print("SIP del paciente: ");
        String sip = scanner.nextLine();

        // Crear el paciente y añadirlo a la cola correspondiente.
        Pacientes paciente = new Pacientes(nombre, sip, LocalDateTime.now());
        if (paciente.getSip() == null) { // Verificar si el SIP es válido.
            System.err.println("Error: El SIP ingresado no es válido.");
            return;
        }
        consultas[indiceConsulta].getCola().add(paciente); // Añadir el paciente a la cola.
        System.out.println("Paciente añadido correctamente.");
        System.out.println(consultas[indiceConsulta].toString()); // Mostrar la cola actualizada.
    }

    // Método para atender al siguiente paciente en una consulta específica.
    public void atenderPaciente(Scanner scanner) {
        // Mostrar el estado actual de las colas.
        mostrarColas();

        System.out.print("Elige una consulta (1-5): ");
        int indiceConsulta = scanner.nextInt() - 1;

        // Validar que el índice de la consulta sea válido.
        if (indiceConsulta < 0 || indiceConsulta >= 5) {
            System.out.println("El número de consulta debe estar entre 1 y 5.");
            return;
        }

        // Validar que la cola no sea nula.
        if (consultas[indiceConsulta] == null || consultas[indiceConsulta].getCola() == null) {
            System.out.println("La cola de esta consulta no está inicializada correctamente.");
            return;
        }

        Cola<Pacientes> cola = consultas[indiceConsulta].getCola();
        if (!cola.isEmpty()) { // Verificar si hay pacientes en la cola.
            Pacientes pacienteAtendido = cola.remove(); // Atender al siguiente paciente.
            if (pacienteAtendido != null) { // Verificar que el paciente no sea nulo.
                System.out.println("Paciente atendido: " + pacienteAtendido);
            } else {
                System.out.println("No se pudo atender al paciente.");
            }
            System.out.println(consultas[indiceConsulta].toString());
        } else {
            System.out.println("No hay pacientes en esta consulta.");
        }
    }

    // Método para mostrar el estado de todas las colas.
    public void mostrarColas() {
        for (int i = 0; i < 5; i++) {
            if (consultas[i] != null) {
                System.out.println("Consulta " + (i + 1) + ": " + consultas[i].toString());
            } else {
                System.out.println("Consulta " + (i + 1) + ": No inicializada.");
            }
        }
    }

    // Genera un número SIP aleatorio con formato válido.
    private String generarSIPAleatorio() {
        StringBuilder sip = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sip.append((int) (Math.random() * 10)); // Agregar dígitos numéricos.
        }
        sip.append((char) ('A' + (int) (Math.random() * 26))); // Agregar letra al final.
        return sip.toString();
    }
}