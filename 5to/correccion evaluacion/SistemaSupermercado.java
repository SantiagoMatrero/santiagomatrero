package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.print.attribute.standard.JobStateReasons;

public class SistemaSupermercado {

    private String nombre;
    HashSet<ProductoDeSuper> productosALaVenta;
    ArrayList<ProductoDeSuper>productosVendidos;

    public SistemaSupermercado(String nombre) {
        this.nombre = nombre;
        this.productosALaVenta = new HashSet<>();
        this.productosVendidos = new ArrayList<>();
    }

    public void agregarProductoVendido(){
        Scanner ingreso = new Scanner(System.in);
        boolean registroRealizado = false;

        while (!registroRealizado){

            try {
                System.out.println("Ingrese el nombre, origen, codigo, costo, y si es de tipo alimenticio(1) o electrico(2)?");
                String nombre = ingreso.nextLine();
                String origen = ingreso.nextLine();
                Integer codigo = ingreso.nextInt();
                float costo = ingreso.nextFloat();
                int res = ingreso.nextInt();
                if (res==1){
                    System.out.println("Ingrese si es perecedero(1) o no perecedero(2) y cuantos dias tiene para su vencimiento");
                    int resTipo = ingreso.nextInt();
                    int cantDiasParaVencerse = ingreso.nextInt();

                    if (resTipo==1){
                        System.out.println("Ingrese la temperatura minima de frio del producto");
                        Integer temperaturaMinimaDeFrio = ingreso.nextInt();
                        ProductoPerecedero productoPerecedero = new ProductoPerecedero(nombre,origen,codigo,costo,cantDiasParaVencerse,temperaturaMinimaDeFrio);
                        productosVendidos.add(productoPerecedero);
                        registroRealizado = true;
                    }
                    else if (resTipo==2){
                        System.out.println("Ingrese los miligramos de sodio del producto");
                        Integer mgDeSodio = ingreso.nextInt();
                        ProductoNoPerecedero productoNoPerecedero = new ProductoNoPerecedero(nombre,origen,codigo,costo, cantDiasParaVencerse,mgDeSodio);
                        productosVendidos.add(productoNoPerecedero);
                        registroRealizado = true;
                    }
                }
                else if (res==2){
                    System.out.println("Ingrese si es de refrigeracion(1) o de calefaccion(2)");
                    int resTipo = ingreso.nextInt();

                    if (resTipo == 1) {
                        System.out.println("Ingrese los litros de capacidad");
                        float litrosDeCapacidad = ingreso.nextFloat();
                        ProductoDeRefrigeracion productoDeRefrigeracion = new ProductoDeRefrigeracion(nombre,origen,codigo,costo,litrosDeCapacidad);
                        productosVendidos.add(productoDeRefrigeracion);
                        registroRealizado = true;
                    }
                    else if (resTipo==2){
                        System.out.println("Ingrese los watts de potencia");
                        Integer wattsDePotencia = ingreso.nextInt();
                        ProductoDeCalefaccion productoDeCalefaccion = new ProductoDeCalefaccion(nombre,origen,codigo,costo,wattsDePotencia);
                        productosVendidos.add(productoDeCalefaccion);
                        registroRealizado = true;
                    }
                }
            }
            catch (InputMismatchException excepcion) {
                excepcion.printStackTrace();
                System.out.println("Tipos de datos incorrectos, ingrese de nuevo.");
            }
        }
    }

    public HashSet<String> aptosParaHipertensos(){
        HashSet<String>aptos = new HashSet<>();
        for (ProductoDeSuper producto : productosALaVenta){
            if (producto.tipoDeProducto().equals("Producto alimenticio")){
                ProductoNoPerecedero productoNoPerecedero = ((ProductoNoPerecedero) producto);
                if (productoNoPerecedero.getMgDeSodio()<=1500){
                    aptos.add(productoNoPerecedero.getNombre());
                }
            }
        }
        return aptos;
    }

    public HashMap<Integer,Float> productosRefrigerantesConGranCapacidad(){
        /**
         Que retorna un map cuyas claves son los códigos de los productos
         refrigerantes que tienen una capacidad mayor o igual a 300 lts y son de
         origen argentino; y sus valores son los litros correspondientes al producto
         en cuestión.
         **/
        HashMap<Integer, Float> productosRefrigerantesGrandes = new HashMap<>();
        for (ProductoDeSuper producto : productosALaVenta){
            if (producto.tipoDeProducto().equals("Producto electrico")){
                ProductoDeRefrigeracion productoDeRefrigeracion = ((ProductoDeRefrigeracion) producto);
                if (productoDeRefrigeracion.getLitrosDeCapacidad()>=300){
                    productosRefrigerantesGrandes.put(productoDeRefrigeracion.getCodigo(), productoDeRefrigeracion.getLitrosDeCapacidad());
                }
            }
        }
        return productosRefrigerantesGrandes;
    }


    public static void serializarSuper(HashSet<ProductoDeSuper>productosALaVenta){

        try{
            ObjectMapper mapper1 = new ObjectMapper();

            HashMap<String,Object> mapASerializar = new HashMap<>();

            mapASerializar.put("productos a la venta", productosALaVenta);

            String objectJson1 = mapper1.writeValueAsString(mapASerializar);

            File archivo = new File("src/com/company/super.json");
        } catch (IOException e) {
        e.printStackTrace();
            }
    }

    public static void deserializarSuper(HashSet<ProductoDeSuper>productosALaVenta){

        try{
            ObjectMapper mapper2 = new ObjectMapper();

            File archivo = new File("src/com/company/super.json");

            HashMap map = mapper2.readValue(archivo, HashMap.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
