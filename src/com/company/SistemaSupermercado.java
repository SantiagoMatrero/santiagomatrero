package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SistemaSupermercado implements SistemaDeVentas {
    private String nombre;
    private ArrayList<ProductoDeSuper> productosALaVenta;
    private ArrayList<ProductoDeSuper> productosVendidos;

    Scanner getString = new Scanner(System.in);
    Scanner getFloat = new Scanner(System.in);

    @Override
    public float gananciaTotalObtenida() {
        float ganancia = 0f;
        for (ProductoDeSuper aux : productosVendidos) {
            ganancia = ganancia + aux.calcularGananciaObtenida();
        }
        return ganancia;
    }


    @Override
    public float ingresosTotales() {
        float ingresosTotales = 0f;
        for (ProductoDeSuper aux : productosVendidos) {
            ingresosTotales = ingresosTotales + aux.calcularPrecioFinal();
        }
        return ingresosTotales;
    }

    @Override
    public int cantidadDeProductosVendidos() {
        return productosVendidos.size();
    }


    public void agregarProductoVendido() {


        System.out.println("Ingrese los datos del producto vendido");

        String nombre = getString.nextLine();
        String origen = getString.nextLine();
        int codigo = getFloat.nextInt();
        float costo = getFloat.nextFloat();

        System.out.println("Ingrese si el producto es electrico o alimenticio");

        String res = getString.nextLine();

        if (res.equals("electrico")) {
            System.out.println("Ingrese los dias de garantia del producto");
            int diasGarantia = getFloat.nextInt();
            System.out.println("Ingrese si es un producto de calefaccion o de refrigeracion");
            String respuesta = getString.nextLine();
            if (respuesta.equals("calefaccion")) {
                System.out.println("Ingrese los watts de potencia maxima");
                int watts = getFloat.nextInt();
                ProductoDeCalefaccion ProductoDeCalefaccion = new ProductoDeCalefaccion(nombre, origen, codigo, costo, diasGarantia, watts);
                productosVendidos.add(ProductoDeCalefaccion);
            } else if (respuesta.equals("refrigeracion")) {
                System.out.println("Ingrese los litros de capacidad");
                Float litrosDeCapacidad = getFloat.nextFloat();
                ProductoDeRefrigeracion ProductoDeRefrigeracion = new ProductoDeRefrigeracion(nombre, origen, codigo, costo, diasGarantia, litrosDeCapacidad);
                productosVendidos.add(ProductoDeRefrigeracion);
            }
        } else if (res.equals("alimenticio")) {
            System.out.println("Ingrese la cantidad de dias de vencimiento");
            int diasVencimiento = getFloat.nextInt();
            System.out.println("Ingrese si es un producto perecedero o no perecedero");
            String respuesta = getString.nextLine();
            if (respuesta.equals("perecedero")) {
                System.out.println("Ingrese la temperatura minima de frio del producto");
                int temperaturaMinimaDeFrio = getFloat.nextInt();
                ProductoPerecedero ProductoPerecedero = new ProductoPerecedero(nombre, origen, codigo, costo, diasVencimiento, temperaturaMinimaDeFrio);
            } else if (respuesta.equals("no perecedero")) {
                System.out.println("ingrese los miligramos de sodio del producto");
                int mgDeSodio = getFloat.nextInt();
                ProductoNoPerecedero ProductoNoPerecedero = new ProductoNoPerecedero(nombre, origen, codigo, costo, diasVencimiento, mgDeSodio);
            }
        }


    }

    public HashSet<String> aptosParaHipertensos() {
        HashSet<String> aptos = new HashSet<>();
        for (ProductoDeSuper aux : productosALaVenta) {
            if (aux.tipoDeProducto().equals("alimenticio")) {
                ProductoNoPerecedero auxiliar = (ProductoNoPerecedero) aux;
                if (auxiliar.getMgDeSodio() <= 1500) {
                    aptos.add(auxiliar.getNombre());
                }
            }
        }
        return aptos;
    }


    public HashMap<Integer, Float> productosRefrigeranteConCapacidad() {
        /** que retorna un map cuyas claves son el código de los productos
         refrigerantes tienen una capacidad mayor o igual a 300 lts y son de
         origen argentino.
         **/

        HashMap<Integer, Float> productosGrandes = new HashMap<>();
        for (ProductoDeSuper aux : productosALaVenta) {
            if (aux.tipoDeProducto().equals("electrico")) {
                ProductoDeRefrigeracion auxiliar = (ProductoDeRefrigeracion) aux;
                if (auxiliar.getLitrosDeCapacidad() >= 300) {
                    productosGrandes.put(auxiliar.getCódigo(), auxiliar.getLitrosDeCapacidad());
                }
            }
        }
        return productosGrandes;



        /*

        una clase abstracta seria mascota con el nombre fecha de nacimiento y el dueño, un atributo que seria cantidad de veces asistidas al veterinario en toda su vida y un hashmap con los datos, ademas tendria una funcion que seria saber cuantas veces fue al veterinario en toda su vida. otra seria por ejemplo mascotas con pelo, en la cual entrarian perros y gatos con el atributo de la raza.
        una interfaz seria la de mascotas con una funcion que se fije si las distintas mascotas fueron las veces necesarias al veterinario (para los perros 4, para los gatos 2 y para las tortugas 1)
        las clases no abstractas serian perro(la cual tendria una funcion que devuelve una estructura de datos con las razas de perros que no cumplieron con la asistencia minima del año actual), gato, tortuga, los cuales deberan tener un atributo que especifique la cantidad minima de veces que tiene que asistir al veterinario en un año. Ademas de tener las funciones de la interfaz de mascota, las cuales serian si fueron la cantidad de veces necesarias al veterinario.
        una clase veterinario, en la cual habria una estructura de datos con todas las mascotas que asisten a ese veterinario. Esta clase tendria una funcion la cual iria recorriendo las mascotas y contando cual de las 3 especies tuvo mas individuos con la asistencia minima por año, y la mostraria por pantalla.

        */
    }
}