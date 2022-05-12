package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Album {

    private String nombre;
    private ArrayList<Cancion>canciones;

    public Album(String nombre, ArrayList<Cancion> canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

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


    public HashSet artistasEnAlbum(){
        HashSet<Artista>artistas = new HashSet<>();
        for (Cancion cancionActual : canciones){
            for (Artista artistaActual : cancionActual.getArtistas()){
                artistas.add(artistaActual);
            }
        }
        return artistas;
    }

    public Artista artistaConMasCanciones(){
        ArrayList<Artista>artistasAux = new ArrayList<>();
        for (Cancion cancionActual : canciones){
            for (Artista artistaActual : cancionActual.getArtistas()){
                artistasAux.add(artistaActual);
            }
        }
        HashMap<Artista, Integer>apariciones = new HashMap<Artista, Integer>();
        for (Artista artistaActual : artistasAux){
            if (!(apariciones.containsKey(artistaActual))){
                apariciones.put(artistaActual, 1);
            }
            else {
                Integer aux = apariciones.get(artistaActual) + 1;
                apariciones.replace(artistaActual, aux);
            }
        }
        int max = Collections.max(apariciones.values());
        Artista artista = new Artista("a","a","a");
        for (Artista artistaActual : apariciones.keySet()){
            if (apariciones.get(artistaActual)==max){
                artista = artistaActual;
            }
        }
        return artista;
    }





}