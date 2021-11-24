package com.company;

public class ProductoDeCalefaccion extends ProductoElectrico{
    private Integer wattsDePotenciaMax;

    public ProductoDeCalefaccion(String nombre, String origen, Integer codigo, float costo, Integer wattsDePotenciaMax) {
        super(nombre, origen, codigo, costo);
        this.wattsDePotenciaMax=wattsDePotenciaMax;
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
}
