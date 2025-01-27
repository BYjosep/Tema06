package com.BYjosep.Tema06.Ejercicio1;

public class Principal{
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();

        coche1.setColor("azul");
        coche1.setMarca("Nisan");
        coche1.setModelo("Terrani");
        coche1.setPinturaMetalizada(false);

        System.out.println("Coche 1:\n\n");
        System.out.println(coche1);
        System.out.println("\n\nCoche2:\n\n");
        System.out.println(coche2);

    }
}
