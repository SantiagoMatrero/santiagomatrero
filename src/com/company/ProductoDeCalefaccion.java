package com.company;

public class ProductoDeCalefaccion extends ProductoElectrico{
    private int wattsDePotenciaMax;

    public ProductoDeCalefaccion(String nombre, String origen, int código, float costo, int cantDiasDeGarantia, int wattsDePotenciaMax) {
        super(nombre, origen, código, costo, cantDiasDeGarantia);
        this.wattsDePotenciaMax = wattsDePotenciaMax;

    }
}
