package com.BYjosep.Tema06.pilasColas.Ejercicio3;

import com.BYjosep.Tema06.pilasColas.PilaStr;

import java.lang.reflect.Array;

public class Condicionador {
    PilaStr pila = new PilaStr(DEFAULT_PILA);
    private static char[] APERTURA = new char[]{'(', '{', '['};
    private static char[] CIERRE = new char[]{')', '}', ']'};
    private static final int DEFAULT_PILA = 10;

    public Condicionador (){
        this.pila = pila;
        this.APERTURA = APERTURA;
        this.CIERRE = CIERRE;

    }
    public Condicionador (int sizePila){
        this.pila = new PilaStr(sizePila);
        this.APERTURA = APERTURA;
        this.CIERRE = CIERRE;
    }
    private static String charToString(char c){
        return Character.toString(c);
    }
    private void apilar(char c){
        pila.push(charToString(c));
    }
    private boolean desapilar(char c){
        if (pila.isEmpty() ){
            System.err.println("No se ha podido desapilar");
            System.err.println("La pila esta vaciá");
            return false;
        }
        if (pila.top().equals(charToString(CIERRE[valorDeApertura(c)]))) {
            pila.pop();
            return true;
        }
        System.err.println("No se ha podido desapilar");
        System.err.println("Esto puede deberse a que el codigo no se ha cerrado");
        return false;
    }


    private static int valorDeApertura(char c){

        for (int i = 0; i < APERTURA.length ; i++) {
            if (c == APERTURA[i]){
                return i;
            }
        }
        return -1;
    }


    public void codigoFuenteAPila(String codigo){
        codigo = codigo.replaceAll("[a-zA-Z0-9]", "");
        codigo = codigo.trim();
        for (int i = 0; i < codigo.length(); i++) {
            for (int j = 0; j < APERTURA.length; j++) {
                if (codigo.charAt(i) == APERTURA[j] ) {
                    apilar(codigo.charAt(i));
                    break;
                }else if (codigo.charAt(i) == CIERRE[j]){
                    if (!desapilar(codigo.charAt(i))) {
                        //no se como hacer que el programa se detenga
                        break;
                    }
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return pila.toString();
    }
}
