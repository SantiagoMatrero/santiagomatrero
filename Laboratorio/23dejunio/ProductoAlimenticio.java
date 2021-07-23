package com.company;

public class ProductoAlimenticio {

    private String nombre;
    private Float precio;

    public ProductoAlimenticio(String nombre, Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    Float getPrecio(){
        return precio;
    }

    public void setPrecio(Float nuevoPrecio){
        precio = nuevoPrecio;
    }



}
