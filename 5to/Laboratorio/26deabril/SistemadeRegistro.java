package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemadeRegistro {

    private ArrayList<Producto>productos = new ArrayList<>();
    private Scanner getFloat = new Scanner(System.in);
    private Scanner getString = new Scanner(System.in);
    boolean terminar = false;



    public void iniciarSistema(){
        while(!terminar){
        System.out.println("Ingrese que es lo que quiere hacer (registrar producto, ver importe parcial o ver importe total)");
        String respuesta = getString.nextLine();
        if (respuesta.equals("registrar producto")){
            registrarProducto();
        }

        if (respuesta.equals("ver importe parcial")){
            verImporteParcial();
        }

        if (respuesta.equals("ver importe total")){
            verImporteTotal();
             terminar = true;
        }

    }
     }



    private void registrarProducto(){

        boolean finalizar = false;

        while(!finalizar) {

            Producto producto = new Producto();
            System.out.println("Ingrese el nombre y el precio del producto");
            String nombre = getString.nextLine();
            float precio = getFloat.nextFloat();
            producto.SetNombre(nombre);
            producto.SetPrecio(precio);
            productos.add(producto);

            System.out.println("Desea registrar otro producto?");
            String res = getString.nextLine();

            if (res.equals("no")){
                finalizar = true;
            }

        }

    }



    private void verImporteParcial(){

        float precioParcial = 0;
        float aux = 0;

        for (int i = 0; i < productos.size(); i++){

            aux = productos.get(i).getPrecio();
            precioParcial = precioParcial + aux;

        }

        System.out.println("El precio parcial es de " + precioParcial);

    }




    private void verImporteTotal(){

        float precioTotal = 0;
        float aux = 0;

        for (int i = 0; i < productos.size(); i++){

            aux = productos.get(i).getPrecio();
            precioTotal = precioTotal = aux;

        }

        System.out.println("El precio parcial es de " + precioTotal);

    }




}
