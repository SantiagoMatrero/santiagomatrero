package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner nombreRecibido = new Scanner(System.in);
        Scanner precioRecibido = new Scanner(System.in);
        boolean salida = false;
        float respuesta;
        float importeTotal = 0;

        while(!salida){
            Producto producto = new Producto();
            System.out.print("Ingrese el nombre y el precio del producto.");
            String nombreProducto = nombreRecibido.nextLine();
            producto.SetNombre(nombreProducto);
            float precioProducto = precioRecibido.nextFloat();
            producto.SetPrecio(precioProducto);

            importeTotal += producto.getPrecio(precioProducto);
            System.out.print("El precio parcial a pagar es de " + importeTotal + " , ¿Desea ingresar otro producto?, responda con un 1 si si o un 2 si no.");
            respuesta = precioRecibido.nextFloat();;
            if (respuesta==2){
                salida=true;
            }
        }

        System.out.print("El total a pagar es de " + importeTotal);
    }

}
