package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Hijo hijo1 = new Hijo("Nicolas", 19, 44555544, 1136477777, "mama 2131");
        Hijo hijo2 = new Hijo("Ramiro", 14, 44555544, 1136477777, "mama 2131");
        Hijo hijo3 = new Hijo("Agustin", 24, 44555544, 1136477777, "mama 2131");

        HashSet<Hijo> hijos = new HashSet<>();

        hijos.add(hijo1);
        hijos.add(hijo2);
        hijos.add(hijo3);

        Madre madre = new Madre("Andrea", 44, 34938264, 1188888888, "Nazca 3333", "Sancor", hijos);

        HashSet<Hijo>hijosMenoresEdad = madre.hijosMenores(madre.getHijos());

        System.out.println(hijosMenoresEdad);
}
    }


