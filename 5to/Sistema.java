package com.company;

import java.util.ArrayList;

public class Sistema {

    ArrayList<Cantante>cantantes = new ArrayList<>();

    public ArrayList<Cantante> getCantantes() {
        return cantantes;
    }

    public void setCantantes(ArrayList<Cantante>cantantes) {
        this.cantantes = cantantes;
    }

    public void cancionesCantantes(){
        for (Cantante cantanteActual : cantantes){
            System.out.println(cantanteActual.getNombreArtistico());
            for (Album albumActual : cantanteActual.getAlbumes()){
                for (Cancion cancionActual : albumActual.getCanciones()){
                    System.out.println("Nombre: " + cancionActual.getNombre() + " | Precio: " + cantanteActual.getPrecioCanciones());
                }
            }
        }
    }

    public void cantanesConMasDe3Albumes(){
        for (Cantante cantanteActual : cantantes){
            if (cantanteActual.cantidadDeAlbumes() >= 3){
                System.out.println(cantanteActual.getNombreArtistico());
            }
        }
    }

    public void imprimirCantantes(){
        for (Cantante cantanteActual : cantantes){
            System.out.println(cantanteActual.toString());
            for (Album albumActual : cantanteActual.getAlbumes()){
                System.out.println("-Album " + albumActual.getNombre());
                for (Cancion cancionActual : albumActual.getCanciones()){
                    System.out.println(cancionActual.getNombre());
                }
            }
        }
    }

    public Sistema() {
        this.cantantes = new ArrayList<>();
    }
}
