package com.BYjosep.Tema06.Ejercicio6;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class almacenBicicletas {

    Scanner scanner = new Scanner(System.in);
    Bicicleta[] bicicletas;
    private int size;
    private int maxSize;

    public almacenBicicletas(int maxSize) {
        bicicletas = new Bicicleta[maxSize];
        size = 0;
    }

    public boolean addBicicleta(Bicicleta bicicleta) {

        int existencias;

        if (size < 0 || size > maxSize) {
            throw new ArrayStoreException("No se ha podido añadir mas bicicletas");
        }

        if (size == 0) {
            crearBicicleta();
            return true;
        }
        if (size < maxSize) {
            System.out.println(verAlmacen());
            System.out.println("Desea añadir una bicicleta nueva? S/n default n");
            if (scanner.next().equalsIgnoreCase("S")) {
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

        return true;
    }


    public void sellBicicleta(int referencia) {
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

    public String verAlmacen() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(bicicletas[i].toString());
        }
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
