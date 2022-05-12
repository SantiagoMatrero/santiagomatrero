package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Sistema s = new Sistema();

        Cantante c1 = new Cantante("Kanye", "West", 45, "ye");

        Cancion cancion1 = new Cancion("dondaChant");

        Album donda = new Album("Donda");

        ArrayList<Cancion>ca = new ArrayList<Cancion>();
        ca.add(cancion1);

        ArrayList<Cantante> cantantess = new ArrayList<>();
        cantantess.add(c1);

        ArrayList<Album>albumes = new ArrayList<>();
        albumes.add(donda);



        Cantante c2 = new Cantante("Mac", "Miller", 45, "MC");

        Cancion cancion2 = new Cancion("Surf");
        Cancion cancion3 = new Cancion("Surf");
        Cancion cancion4 = new Cancion("Surf");

        Album Mac = new Album("Mac");
        Album Mac2 = new Album("Mac2");
        Album Mac3 = new Album("Mac3");


        ArrayList<Cancion>macoines = new ArrayList<Cancion>();
        macoines.add(cancion2);
        macoines.add(cancion3);
        macoines.add(cancion4);


        ArrayList<Album>albumesMac = new ArrayList<>();
        albumesMac.add(Mac);
        albumesMac.add(Mac2);
        albumesMac.add(Mac3);

        cantantess.add(c2);

        Mac.setCanciones(macoines);
        Mac2.setCanciones(macoines);
        Mac3.setCanciones(macoines);

        c2.setAlbumes(albumesMac);


        donda.setCanciones(ca);
        c1.setAlbumes(albumes);
        s.setCantantes(cantantess);

        s.imprimirCantantes();

        s.cancionesCantantes();

    }
}
