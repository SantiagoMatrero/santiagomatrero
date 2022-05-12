package com.company;

import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.HashSet;

public class Sistema {

    private String nombre;
    private ArrayList<Album>albumes;

    public Sistema(String nombre, ArrayList<Album> albumes) {
        this.nombre = nombre;
        this.albumes = albumes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    public HashSet cancionesPorNacionalidad(String nacionalidad){
        HashSet<Cancion>canciones = new HashSet<>();
        for (Album albumActual : albumes){
            for (Cancion cancionActual : albumActual.getCanciones()){
                for (Autor autorActual : cancionActual.getAutores()){
                    if (autorActual.getNacionalidad() == nacionalidad){
                        canciones.add(cancionActual);
                    }
                }
            }
        }
        return canciones;
    }
}