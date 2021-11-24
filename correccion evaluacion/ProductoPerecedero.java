package com.company;

public class ProductoPerecedero extends ProductoAlimenticio{
    private Integer temperaturaMinimaDeFrio;

    public ProductoPerecedero(String nombre, String origen, Integer codigo, float costo, Integer cantDiasParaVencerse, Integer temperaturaMinimaDeFrio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
        this.temperaturaMinimaDeFrio=temperaturaMinimaDeFrio;
    }


    public Integer getTemperaturaMinimaDeFrio() {
        return temperaturaMinimaDeFrio;
    }


}
