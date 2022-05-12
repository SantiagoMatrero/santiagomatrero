package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Cancion {

    private String nombre;
    private HashSet<Artista>artistas;
    private HashSet<Autor>autores;

    public Cancion(String nombre, HashSet<Artista> artistas, HashSet<Autor>autores) {
        this.nombre = nombre;
        this.artistas = artistas;
        this.autores = autores;
    }

    public Cancion(String nombre, HashSet<Artista> artistas) {
        this.nombre = nombre;
        this.artistas = artistas;
        this.autores = new HashSet<>();
    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(HashSet<Artista> artistas) {
        this.artistas = artistas;
    }

    public HashSet<Autor> getAutores() {
        return autores;
    }

    public void setAutores(HashSet<Autor> autores) {
        this.autores = autores;
    }
}