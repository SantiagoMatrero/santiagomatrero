package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {


        HashSet<Integer>auxiliar = new HashSet<>();
        ArrayList<Integer>numeros = new ArrayList<>();
        Scanner getInt = new Scanner(System.in);

        System.out.println("Cuantos numeros vas a ingresar?");
        int res = getInt.nextInt();
        for (int i = 0; i < res; i++){

            System.out.println("Ingrese un numero");
            int aux = getInt.nextInt();
            numeros.add(aux);

        }



        for (Integer ints : numeros){

            auxiliar.add(ints);

        }


        numeros.clear();
        System.out.println("Esta es la lista de numeros sin repetirse");


        for (Integer ints : auxiliar){

            numeros.add(ints);

        }




        for (Integer ints : numeros){

            System.out.println(ints);

        }


    }
}
