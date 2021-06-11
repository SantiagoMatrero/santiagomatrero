package com.company;

import java.lang.constant.Constable;

public class Libro {

    private String nombre;
    private float precio;
    private String editorial;




    public Libro (String nombre, float precio, String editorial){
        this.nombre = nombre;
        this.precio = precio;
        this.editorial = editorial;
    }



    public String getEditorial(){
        return editorial;
    }

}
