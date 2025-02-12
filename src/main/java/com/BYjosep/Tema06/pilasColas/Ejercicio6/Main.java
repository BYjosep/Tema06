package com.BYjosep.Tema06.pilasColas.Ejercicio6;

import com.BYjosep.Tema06.lib.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear el hospital con 5 consultas y médicos asignados.
        Hospital hospital = new Hospital();

        // Inicializar el escáner para leer entradas del usuario.
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Ciclo principal del programa: mostrar el menú hasta que el usuario elija salir.
        do {
            opcion=LibInts.ingresarUnNumero("""
                    === HOSPITAL ===
                    1. Añadir paciente
                    2. Atender siguiente paciente
                    3. Mostrar estado de las colas
                    4. Salir
                    Elige una opcion:
                    """,1,4,"Opción no válida.");

            // Procesar la opción seleccionada por el usuario.
            switch (opcion) {
                case 1:
                    // Opción 1: Añadir un paciente a una consulta específica.
                    hospital.anadirPaciente(scanner);
                    break;
                case 2:
                    // Opción 2: Atender al siguiente paciente en una consulta específica.
                    hospital.atenderPaciente(scanner);
                    break;
                case 3:
                    // Opción 3: Mostrar el estado de todas las colas.
                    hospital.mostrarColas();
                    break;
                case 4:
                    // Opción 4: Salir del programa.
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (opcion != 4); // Repetir mientras el usuario no elija salir.

        LibInts.cerrarScaner(); // Cerrar el escáner al finalizar.
    }
}