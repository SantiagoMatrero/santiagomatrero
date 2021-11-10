package com.company;

public abstract class ProductoDeSuper implements Producto{

    private String nombre;
    private String origen;
    private int código;
    private float costo;

    public ProductoDeSuper(String nombre, String origen, int código, float costo) {
        this.nombre = nombre;
        this.origen = origen;
        this.código = código;
        this.costo = costo;
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

    public float getCosto() {
        return costo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCódigo() {
        return código;
    }
}
