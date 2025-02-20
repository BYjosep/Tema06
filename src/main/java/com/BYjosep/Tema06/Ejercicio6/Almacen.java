package com.BYjosep.Tema06.Ejercicio6;

import com.BYjosep.Tema06.lib.LibInts;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;



public class Almacen {

    Scanner scanner = new Scanner(System.in);
    Bicicleta[] bicicletas;
    private int size;
    private final int maxSize;

    public Almacen(int maxSize) {
        this.maxSize = maxSize;
        bicicletas = new Bicicleta[maxSize];
        size = 0;
    }

    public void addBicicleta() {

        if (size < 0) {
            throw new ArrayStoreException("No se ha podido añadir mas bicicletas");
        } else if (size == maxSize) {
            return;
        }


        if (size == 0) {
            crearBicicleta();
            return;
        }
        if (size < maxSize) {
            System.out.println("Desea añadir una bicicleta nueva? S/n default n");
            if (scanner.next().equalsIgnoreCase("n")) {
                System.out.println(this);
                System.out.println("Ingrese el id de la Bicicleta: ");
                int idBicicleta = Integer.parseInt(scanner.next());
                for (int i = 0; i < size; i++) {
                    if (bicicletas[i].getReferencia() == idBicicleta) {
                        System.out.println("Ingrese la cantidad de bicicletas que desea añadir");
                        bicicletas[i].setExistencias(Integer.parseInt(scanner.next()));
                    }
                }
            } else {
                crearBicicleta();
            }
        }

    }


    public void sellBicicleta() {
        int referencia = LibInts.ingresarUnNumero("Ingrese la referencia del bicicleta: ");
        if (size == 0 || size > maxSize) {
            throw new ArrayStoreException("No se pueden quitar bicicletas");
        }

        for (int i = 0; i < size; i++) {
            if (referencia == bicicletas[i].getReferencia()) {
                System.out.println("Ingrese cuantas bicicletas desea eliminar");
                bicicletas[i].setExistencias(bicicletas[i].getExistencias() - Integer.parseInt(scanner.next()));
                break;
            }
        }

    }

    public void consultarBicicleta() {
        if (size >= 0 || size > maxSize) {
            throw new ArrayStoreException("No se pueden consultar la bicicleta");
        }
        int opcopn = LibInts.ingresarUnNumero("""
                ************************
                ** CONSULTA BICICLETA **
                ************************
                1.- Consultar por referencia
                2.- Consultar por marca
                3.- Consultar por modelo
                ---------------------------------
                0.- Volver al menú principal
                """, 0, 4, "Opcion indicada invalida");
        boolean status = false;
        switch (opcopn) {

            case 0 -> {
            }

            case 1 -> {
                System.out.println("Ingrese el referencia que desea consultar");
                int referencia = Integer.parseInt(scanner.next());
                for (int i = 0; i < size; i++) {
                    if (referencia == bicicletas[i].getReferencia()) {
                        System.out.println(bicicletas[i].toString());
                        status = true;
                        break;
                    }
                    if (!status) {
                        System.out.println("La referencia no existe");
                    }
                }
            }
            case 2 -> {
                System.out.println("Ingreseso la marca que desea consultar");
                String marca = scanner.nextLine();
                for (int i = 0; i < size; i++) {
                    if (marca.equalsIgnoreCase(bicicletas[i].getMarca()))
                        System.out.println(bicicletas[i].toString());
                    status = true;
                    break;
                }
                if (!status) {
                    System.out.println("La marca no existe");
                }
            }
            case 3 -> {
                System.out.println("Ingreseso la modelo que desea consultar");
                String modelo = scanner.nextLine();
                for (int i = 0; i < size; i++) {
                    if (modelo.equalsIgnoreCase(bicicletas[i].getModelo()))
                        System.out.println(bicicletas[i].toString());
                    status = true;
                    break;
                }
                if (!status) {
                    System.out.println("El modelo no existe");
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Almacén").append("{\n");
        for (int i = 0; i < size; i++) {
            sb.append(bicicletas[i].toString()).append("\n");
        }
        sb.append("}\n");

        return sb.toString();
    }


    private void crearBicicleta() {
        String marca, modelo;
        float precio, peso;
        boolean tieneMotor;
        GregorianCalendar fechaFabricacion;
        int existencias;

        System.out.println("Ingrese la marca");
        marca = scanner.nextLine();

        System.out.println("Ingrese la modelo");
        modelo = scanner.nextLine();

        System.out.println("Ingrese la peso");
        peso = Float.parseFloat(scanner.nextLine());

        System.out.println("Ingrese la fecha de fabricacion en formato DD/MM/YYYY");
        String aux = scanner.nextLine();
        fechaFabricacion = new GregorianCalendar(TimeZone.getTimeZone(aux));

        System.out.println("La bicicleta tiene motor S/n default n");
        tieneMotor = scanner.nextLine().equalsIgnoreCase("S");

        System.out.println("Ingresse el numero de existencias que desea añadir");
        existencias = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el precio de la bicicleta");
        precio = Float.parseFloat(scanner.nextLine());

        bicicletas[size] = new Bicicleta(marca, modelo, peso, tieneMotor, fechaFabricacion, precio, existencias);
        size++;
    }



}


