package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner getString = new Scanner(System.in);
        Scanner getInt = new Scanner(System.in);

        HashSet<Programa>programas = new HashSet<>();

        System.out.println("Que accion desea realizar?");
        System.out.println("1. Cargar trabajador\n2. Cargar programa");
        int res = getInt.nextInt();

        if (res == 1){
            System.out.println("Ingrese el nombre");
            String nombre = getString.nextLine();
            System.out.println("Ingrese el apellido");
            String apellido = getString.nextLine();
            System.out.println("Ingrese el Dni");
            int dni = getInt.nextInt();
            System.out.println("Ingrese la fecha de ingreso del trabajador al programa");
            String fechaIngreso = getString.nextLine();
            System.out.println("Ingrese la funcion del trabajador en el programa(musicalizador, conductor u operador)");

            String respuesta = getString.nextLine();


        }

        else if (res == 2){
            System.out.println("Desea ingresar un programa musical?");
            String respuesta = getString.nextLine();
            if (respuesta.equals("si")){


            }
        }
    }
}
