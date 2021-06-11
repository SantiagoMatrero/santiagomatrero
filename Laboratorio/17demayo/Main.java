package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        ArrayList<Libro>librosVendidos = new ArrayList<>();
        HashMap<String, Integer>vendidos = new HashMap<>();
        Scanner getInt = new Scanner(System.in);
        Scanner getFloat = new Scanner(System.in);
        Scanner getString = new Scanner(System.in);
        boolean aux = true;

        vendidos.put("Kapelusaz", 0);
        vendidos.put("Sudamericana", 0);
        vendidos.put("Atlantida", 0);
        vendidos.put("ElAteneo", 0);
        vendidos.put("Interzona", 0);
        vendidos.put("Sur", 0);
        vendidos.put("Alianza", 0);


        while (aux){
            System.out.println("Ingrese el nombre, precio y el numero asociado a la editorial del libro vendido");
            System.out.println("");
            System.out.println("1.Kapelusz     2.Sudamericana     3.Atlantida     4.ElAteneo    5.Interzona     6.Sur     7.Alianza");
            String nombre = getString.nextLine();
            float precio = getFloat.nextFloat();
            String editorial = "";
            int auxEditorial = getInt.nextInt();
            if (auxEditorial==1){
                editorial = "Kapelusz";
            }
            else if (auxEditorial==2){
                editorial="Sudamericana";
            }
            else if (auxEditorial == 3) {
                editorial="Atlantida";
            }
            else if (auxEditorial==4){
                editorial="ElAteneo";
            }
            else if (auxEditorial==5){
                editorial="Interzona";
            }
            else if (auxEditorial==6){
                editorial="Sur";
            }
            else if (auxEditorial==7){
                editorial="Alianza";
            }

            Libro libroVendido = new Libro(nombre, precio, editorial);
            librosVendidos.add(libroVendido);

            System.out.println("Desea ingresar otro libro?");
            String res = getString.nextLine();

            if (res.equals("no")){
                aux = false;
            }

        }

        for (Libro libro : librosVendidos){
            int currentValue = vendidos.get(libro.getEditorial());
            vendidos.replace(libro.getEditorial(), currentValue, currentValue+1);
        }




    }
}
