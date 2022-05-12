package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class AppParaDeposito {


    private HashMap<ProductoAlimenticio, Integer>Productos;

    public AppParaDeposito(HashMap<ProductoAlimenticio, Integer> productos) {
        Productos = productos;
    }


    public void ingresarProducto(ProductoAlimenticio producto, Integer stock){

        if (Productos.containsKey(producto)){
            Productos.replace(producto, Productos.get(producto) + stock);
        }
        else{
            Productos.put(producto, stock);
        }
        System.out.println("Producto ingresado correctamente");
    }

    public void egresarProducto(ProductoAlimenticio producto, Integer cantidadEgresada){

        if (Productos.containsKey(producto)){
            if (Productos.get(producto) >= cantidadEgresada){
                Productos.replace(producto, Productos.get(producto) - cantidadEgresada);
            }
            else {
                System.out.println("No hay suficiente stock.");
            }
        }
        else{
            System.out.println("Ese producto no se encuentra en la lista de productos");
        }
    }

    public void valorXStock () {
        float valorTotal = 0f;

        for (ProductoAlimenticio a : Productos.keySet()){
            valorTotal = valorTotal + a.getPrecio() * Productos.get(a);
        }

        System.out.println("El valor total del deposito es de " + valorTotal);
    }

    public void productosSinStock (){
        for (ProductoAlimenticio a : Productos.keySet()){
            if (Productos.get(a) == 0){
                System.out.println(a.getNombre());
            }
        }
    }

    public void stockProducto (String nombreProducto){
        boolean esta = false;
        for (ProductoAlimenticio a : Productos.keySet()){
            if (a.getNombre().equals (nombreProducto)){
                System.out.println(Productos.get(a));
                esta = true;
                break;
            }
        }
        if (esta == false) {
            System.out.println("Ese producto no se encuentra en la lista de productos");
        }
    }

    public void stocksMenoresA15u (){
        for (ProductoAlimenticio a : Productos.keySet()){
            if(Productos.get(a) < 15){
                System.out.println(a.getNombre());
            }
        }
    }




    public static void main(String[] args) {

        Scanner getInt = new Scanner(System.in);
        Scanner getString = new Scanner(System.in);
        Scanner getFloat = new Scanner(System.in);
        AppParaDeposito A = new AppParaDeposito(new HashMap<>());


        while(true){
            System.out.println("Que accion desea realizar? Ingrese el numero correspondiente a esta \n\n\n1.Ingresar un porducto \n2.Egresar un producto \n3.Ver el valor total del deposito \n4.Ver la lista de los productos sin stock \n5.Ver el stock de un producto \n6.Ver los productos que tienen un stock menor a 15 unidades \n7.Finalizar el programa");
            int accion = getInt.nextInt();

            if (accion == 1){
                System.out.println("El producto que desea ingresar ya fue ingresado antes?");
                String respuesta = getString.nextLine();
                if (respuesta.equals("Si")){
                    System.out.println("Ingrese el nombre y la cantidad del producto que desea ingresar");
                    String nombreProductoAIngresar = getString.nextLine();
                    Integer cantidadProductoAIngresar = getInt.nextInt();
                    for (ProductoAlimenticio a : A.Productos.keySet()){
                        if(a.getNombre().equals(nombreProductoAIngresar)){
                            ProductoAlimenticio productoAIngresar =  a;
                            A.ingresarProducto(productoAIngresar, cantidadProductoAIngresar);
                            break;
                        }
                    }


                }
                else if (respuesta.equals("No")){
                    System.out.println("Ingrese el nombre, el precio/u y la cantidad del producto que desea ingresar");
                    String nombreProductoAIngresar = getString.nextLine();
                    Float precioProductoAIngresar = getFloat.nextFloat();
                    Integer cantidadProductoAIngresar = getInt.nextInt();

                    ProductoAlimenticio nuevoProducto = new ProductoAlimenticio(nombreProductoAIngresar, precioProductoAIngresar);
                    A.ingresarProducto(nuevoProducto, cantidadProductoAIngresar);
                }
            }

            else if(accion == 2){
                System.out.println("Ingrese el nombre y la cantidad del producto que desea egresar");
                String nombreProductoAEgresar = getString.nextLine();
                Integer cantidadProductoAEgresar = getInt.nextInt();

                for (ProductoAlimenticio a : A.Productos.keySet()){
                    if(a.getNombre().equals(nombreProductoAEgresar)){
                        ProductoAlimenticio productoAEgresar=  a;
                        A.egresarProducto(productoAEgresar, cantidadProductoAEgresar);
                        break;
                    }
                }


            }

            else if(accion == 3){
                A.valorXStock();
            }

            else if(accion == 4){
                A.productosSinStock();
            }

            else if(accion == 5){
                System.out.println("Ingrese el nombre del producto que desea buscar");
                String productoABuscar = getString.nextLine();
                A.stockProducto(productoABuscar);
            }

            else if (accion == 6){
                A.stocksMenoresA15u();
            }

            else if (accion == 7){
                break;
            }

            System.out.println("\n-----------------------------------\n");


        }
    }
}
