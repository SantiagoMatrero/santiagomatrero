package com.company;

import java.util.HashMap;

public class Empresa {

    private String Direccion;
    Dueño dueño;
    private String RazonSocial;
    HashMap<String, Double>Consumo;
    static double TARIFA_EMPRESA = 3;


    Empresa(String direccion, Dueño dueño, HashMap<String, Double> Consumo){
        this.Direccion = direccion;
        this.dueño = dueño;
        this.Consumo = Consumo;
    }


    Double precioAPagar(String mes){
        Double precio = Consumo.get(mes) * 3;
        return precio;
    }
}
