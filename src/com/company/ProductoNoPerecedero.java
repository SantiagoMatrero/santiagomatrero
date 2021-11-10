package com.company;

public class ProductoNoPerecedero extends ProductoAlimenticio{
    private int mgDeSodio;

    public int getMgDeSodio() {
        return mgDeSodio;
    }


    public ProductoNoPerecedero(String nombre, String origen, int código, float costo, int cantDiasParaVencerse, int mgDeSodio) {
        super(nombre, origen, código, costo, cantDiasParaVencerse);
        this.mgDeSodio = mgDeSodio;
    }


}
