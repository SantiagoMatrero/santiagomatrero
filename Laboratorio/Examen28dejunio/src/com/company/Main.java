package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cliente>visitas = new ArrayList<>();
        Banco Santander = new Banco("Santander", visitas);

        Persona p1 = new Persona("Manuel", 2222222);
        Persona p2 = new Persona("Nicolas", 1111111);


        Cliente C1 = new Cliente(p1, 10);
        Cliente C2 = new Cliente(p2, 20);



        Santander.visitas.add(C1);
        Santander.visitas.add(C2);


        Santander.imprimirCbus(Santander.cbusDeClientesVisitantes());



        HashMap<Integer,Integer>b = new HashMap<>();
        b = Santander.cantidadDeVisitasPorCliente();

        Santander.imprimirCantVisitas(b);


        HashMap<Integer,Integer>c = new HashMap<>();



    }
}
