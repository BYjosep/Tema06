package com.BYjosep.Tema06.Ejercicio6;

import com.BYjosep.Tema06.lib.LibInts;

public class Main {
    final static int MAX_SIZE = 10;


    public static void main(String[] args) {

        menu();

    }

    private static void menu() {
        Almacen almacen = new Almacen(MAX_SIZE);
        int opcion ;
        do {


            opcion = LibInts.ingresarUnNumero("""
                    ***************************
                    ** GESTIÓN DE BICICLETAS **
                    ***************************
                    1.- Añadir bicicleta
                    2.- Vender bicicleta
                    3.- Consultar bicicleta
                    4.- Mostrar stock
                    ------------------------------------
                    0.- Salir""", 0, 4, "Opcion indicada invalida");

            switch (opcion) {
                case 1 -> {
                    almacen.addBicicleta();
                }
                case 2 -> {
                    almacen.sellBicicleta();
                }
                case 3 -> {
                    almacen.consultarBicicleta();
                }
                case 4 -> {
                    System.out.println(almacen);
                }

            }
        }while (opcion != 0);
    }
}
