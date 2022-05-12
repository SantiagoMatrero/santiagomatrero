package com.company;

public class ProductoDeRefrigeracion extends ProductoElectrico{
    private float litrosDeCapacidad;

    public ProductoDeRefrigeracion(String nombre, String origen, Integer codigo, float costo, float litrosDeCapacidad) {
        super(nombre, origen, codigo, costo);
        this.litrosDeCapacidad=litrosDeCapacidad;
    }

    @Override
    public float calcularPrecioFinal() {
        return 0;
    }

    @Override
    public float calcularGananciaObtenida() {
        return 0;
    }

    @Override
    public String tipoDeProducto() {
        return null;
    }

    public float getLitrosDeCapacidad() {
        return litrosDeCapacidad;
    }
}
