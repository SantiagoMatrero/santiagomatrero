package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Dueño D1 = new Dueño("Manuel", "Lopez", 44555555);
        Vivienda V1 = new Vivienda("Nazca 2321", D1);

        V1.agregarMes("Julio", 20D);
        Double a = V1.precioAPagar("Julio");
        System.out.println(a);
    }
}
