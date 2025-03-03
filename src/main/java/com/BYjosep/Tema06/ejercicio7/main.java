package com.BYjosep.Tema06.ejercicio7;

import com.BYjosep.Tema06.lib.LibInts;

public class main {
    private static final String mensajeError = "Has introducido una opcion que no existe. Introduzca una opcion valida";

    public static void main(String[] args) {

        boolean salir = false;

        do {
            switch (LibInts.ingresarUnNumero("""
                    ********************
                    **    URGENCIAS   **
                    ********************
                    1. Nuevo paciente
                    2. Atender paciente
                    3. Consultas
                    4. Alta médica
                    -----------------------------
                    0. Salir
                    """, 0, 4, mensajeError)) {

                case 1 -> ;
                case 2 -> ;
                case 3 -> ;
                case 4 -> ;
                case 0 -> salir = true;
            }
        } while (!salir);
    }

    private void menuConsultas() {
        switch (LibInts.ingresarUnNumero("""
                ***************
                ** CONSULTAS **
                ***************
                1. Por Sip …
                2. Por fechas …
                3. Estadísticas
                3. Mostrar histórico mensual
                --------------------------------
                0. Volver al menú principal
                """, 0, 3, mensajeError))
    }
}
