package com.company;

import java.util.HashMap;

public class Vivienda {

    private String Direccion;
    Dueño dueño;
    HashMap<String, Double>Consumo;
    static double TARIFA_VIVIENDA = 2;

    Vivienda(String direccion, Dueño dueño){
        this.Direccion = direccion;
        this.dueño = dueño;
        this.Consumo = new HashMap<>();
    }


    public void agregarMes (String mes, Double consumo){
        if (Consumo.containsKey(mes)){
            System.out.println("Ya fue ingresado el consumo de ese mes");
        }
        else {
            Consumo.put(mes, consumo);
        }
    }

    Double precioAPagar(String mes){
        Double precio = Consumo.get(mes) * 2;
        return precio;
    }

}
