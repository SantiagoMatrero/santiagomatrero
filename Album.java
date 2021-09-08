package com.company;

import java.util.ArrayList;

public class Album {

    private String nombre;
    private ArrayList<Cancion>canciones;

    public Album(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion>canciones) {
        this.canciones = canciones;
    }


}
