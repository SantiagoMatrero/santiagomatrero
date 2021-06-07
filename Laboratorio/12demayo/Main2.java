package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main2 {


    public static void main(String[] args) {


        HashSet<Integer> auxiliar = new HashSet<>();
        HashSet<Integer> auxiliar2 = new HashSet<>();
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();
        Scanner getInt = new Scanner(System.in);


        System.out.println("Cuantos numeros vas a ingresar?");
        int res = getInt.nextInt();
        for (int i = 0; i < res; i++) {

            System.out.println("Ingrese un numero");
            int aux = getInt.nextInt();
            numeros.add(aux);

        }

        System.out.println("Otra vez...");

        System.out.println("Cuantos numeros vas a ingresar?");
        int res2 = getInt.nextInt();
        for (int i = 0; i < res2; i++) {

            System.out.println("Ingrese un numero");
            int aux = getInt.nextInt();
            numeros2.add(aux);


        }


        for (Integer ints : numeros){
            auxiliar.add(ints);
        }

        for (Integer ints : numeros2){
            auxiliar2.add(ints);
        }




        boolean sonIguales = true;


        for (Integer ints : auxiliar){

            if (auxiliar2.contains(ints) == false){
                sonIguales = false;
            }


        }




            for (Integer ints : auxiliar2) {

                if (auxiliar.contains(ints) == false) {
                    sonIguales = false;
                }

            }


            if (sonIguales == false) {
                System.out.println("No tienen los mismos numeros");
            }
            else if (sonIguales == true){
                System.out.println("Si tienen los mismos numeros");
            }









    }
}
