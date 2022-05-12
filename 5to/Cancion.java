package com.company;

public class Cancion {

    private String nombre;
    private static int precioMin = 500;



    public Cancion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
