package com.company;

public abstract class ProductoDeSuper implements Producto{
    private String nombre;
    private String origen;
    private Integer codigo;
    private float costo;

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public float getCosto() {
        return costo;
    }

    public ProductoDeSuper(String nombre, String origen, Integer codigo, float costo) {
        this.nombre = nombre;
        this.origen = origen;
        this.codigo = codigo;
        this.costo = costo;
    }
}
