package com.BYjosep.Tema06.pilasColas.Ejercicio6;

import java.time.LocalDateTime;

public class Pacientes {
    public String nombre;
    public String sip;
    public LocalDateTime fechaHoraIngreso;
    public LocalDateTime fechaHoraLlegada;
    private static final String SIP_INCORRECT = "El SIP es  incorrecto";

    public Pacientes() {
        this.nombre = null;
        this.sip = null;
        this.fechaHoraIngreso = null;
        this.fechaHoraLlegada = null;
    }

    public Pacientes(String nombre, String sip, LocalDateTime fechaHoraConsulta) {

        this.nombre = nombre;
        this.sip = setSip(sip);
        this.fechaHoraIngreso = fechaHoraConsulta;
        this.fechaHoraLlegada = LocalDateTime.MIN;
        if (sip == null) {
            System.err.println("Porfavor ingrese un sip valido");
            System.err.println("Para ello use el metodo setSip");
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaHoraIngreso(LocalDateTime fechaHoraIngreso) {
        this.fechaHoraIngreso = fechaHoraIngreso;
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


    public void setFechaHoraLlegada(LocalDateTime fechaHoraLlegada) {
        this.fechaHoraLlegada = fechaHoraLlegada;
    }

    @Override
    public String toString() {
        return "Pacientes{" +
                "nombre='" + nombre + '\'' +
                ", sip='" + sip + '\'' +
                ", fechaHoraIngreso=" + fechaHoraIngreso +
                ", fechaHoraLlegada=" + fechaHoraLlegada +
                '}';
    }
}
