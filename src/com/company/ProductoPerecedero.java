package com.company;

public class ProductoPerecedero extends ProductoAlimenticio {
    private int temperaturaMinimaDeFrio;

    public ProductoPerecedero(String nombre, String origen, int código, float costo, int cantDiasParaVencerse, int temperaturaMinimaDeFrio) {
        super(nombre, origen, código, costo, cantDiasParaVencerse);
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }

    public ProductoPerecedero(){
        super("Banana", "Brasil", 111, 50f, 40);
        this.temperaturaMinimaDeFrio = 15;
    }
}
