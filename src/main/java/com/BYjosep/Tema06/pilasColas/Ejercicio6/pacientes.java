package com.BYjosep.Tema06.pilasColas.Ejercicio6;

import com.BYjosep.Tema06.lib.LibInStrings;

import java.time.LocalDateTime;

public class pacientes {
    public String nombre;
    public String sip;
    public LocalDateTime fechaHoraIngreso;
    public LocalDateTime fechaHoraLlegada;
    private static final String SIP_INCORRECT = "El SIP es  incorrecto";

    public pacientes(String nombre, String sip) {
        if (sip == null) {
            System.err.println("Porfavor ingrese un sip valido");
        }

        this.nombre = nombre;
        this.sip = setSip(sip);

    }


    /**
     *
     * @param sip parametro de entrada que necesita verificar que todos los caracteres
     * del String menos el último son numeros y comprobando que el último caracter es
     * una letra
     * @return en caso de estar bien retorna el sip, de lo contrario retorna null
     */
    public String setSip(String sip) {
        sip = sip.toUpperCase();
        if (sip.length() == 9) {
            for (int i = 0; i < sip.length() - 1; i++) {
                if (!Character.toString(sip.charAt(i)).equals("[0-1]")) {
                    System.err.println(SIP_INCORRECT);
                    return null;
                }
            }
            if (Character.toString(sip.charAt(sip.length() - 1)).equals("[A-Z]")) {
                return sip;
            }
        } else {
            System.err.println(SIP_INCORRECT);
            return null;
        }
        return null;
    }



}
