package com.company;

public class ProductoAlimenticio extends ProductoDeSuper{
    private int cantDiasParaVencerse;
    private static int DESCUENTO;

    public ProductoAlimenticio(String nombre, String origen, int código, float costo, int cantDiasParaVencerse) {
        super(nombre, origen, código, costo);
        this.cantDiasParaVencerse = cantDiasParaVencerse;
    }


    public int getCantDiasParaVencerse() {
        return cantDiasParaVencerse;
    }

    public float getGanancia(){
        if (cantDiasParaVencerse<=90){
            return this.getCosto()*0.10f;
        }
        else return this.getCosto()*0.25f;
    }


    public String tipoDeProducto(){
        return ("Producto alimenticio");
    }
}
