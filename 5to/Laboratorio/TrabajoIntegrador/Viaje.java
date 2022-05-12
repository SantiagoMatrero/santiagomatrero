package com.company;

public class Viaje {

    private float precio;
    private String fecha;
    private String hora;


    public Viaje (){
        this.precio = 10f;
        this.fecha = "09/08/21";
        this.hora = "16:37";
    }


    float getPrecio(){
        return precio;
    }

}