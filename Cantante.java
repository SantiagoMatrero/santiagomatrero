package com.company;

import java.util.ArrayList;

public class Cantante extends Persona{

    private String nombreArtistico;
    private ArrayList<Album>albumes = new ArrayList<>();
    private int precioCanciones;


    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album>albumes) {
        this.albumes = albumes;
        this.precioCanciones = albumes.size() + 500;
    }


    public Cantante(String nombreArtistico, ArrayList<Album> albumes) {
        this.nombreArtistico = nombreArtistico;
        this.albumes = new ArrayList<>();
    }

    public Cantante(String nombre, String apellido, int edad, String nombreArtistico) {
        super(nombre, apellido, edad);
        this.nombreArtistico = nombreArtistico;
        this.albumes = new ArrayList<>();
    }

    public int cantidadDeAlbumes(){
        return albumes.size();
    }


    public int getPrecioCanciones() {
        return precioCanciones;
    }


    @Override
    public String toString() {
        return "nombre: " + nombre + '\n' +
                "apellido: " + apellido + '\n' +
                "edad: " + edad + '\n' +
                "nombre artistico: " + nombreArtistico;

    }
}
