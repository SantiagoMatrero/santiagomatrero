package com.company;

public class ProductoDeRefrigeracion extends ProductoElectrico{
    private Float litrosDeCapacidad;

    public ProductoDeRefrigeracion(String nombre, String origen, int código, float costo, int cantDiasDeGarantia, Float litrosDeCapacidad) {
        super(nombre, origen, código, costo, cantDiasDeGarantia);
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    public Float getLitrosDeCapacidad() {
        return litrosDeCapacidad;
    }
}
