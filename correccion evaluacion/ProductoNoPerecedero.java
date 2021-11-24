package com.company;

public class ProductoNoPerecedero extends ProductoAlimenticio{
    private Integer mgDeSodio;

    public ProductoNoPerecedero(String nombre, String origen, Integer codigo, float costo, Integer cantDiasParaVencerse, Integer mgDeSodio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
        this.mgDeSodio=mgDeSodio;
    }


    public Integer getMgDeSodio() {
        return mgDeSodio;
    }
}
