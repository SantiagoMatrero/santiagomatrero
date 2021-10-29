package com.company;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class AlbumTest {

    @org.junit.jupiter.api.Test
    void artistasEnAlbum() {
        Artista a1 = new Artista("nicolas", "manolo", "12/12/12");
        Artista a2 = new Artista("matias", "manolo", "12/12/12");
        Artista a3 = new Artista("mama", "manolo", "12/12/12");
        HashSet<Artista> artistas = new HashSet<>();
        HashSet<Artista> artistas2 = new HashSet<>();
        HashSet<Artista> artistas3 = new HashSet<>();
        HashSet<Artista> artistas4 = new HashSet<>();
        HashSet<Artista> artistas5 = new HashSet<>();
        artistas.add(a1);
        artistas2.add(a1);
        artistas2.add(a2);
        artistas3.add(a1);
        artistas3.add(a2);
        artistas3.add(a3);
        artistas4.add(a2);
        artistas5.add(a2);
        artistas5.add(a3);


        Cancion c1 = new Cancion("zzz", artistas);
        Cancion c2 = new Cancion("zzz", artistas2);
        Cancion c3 = new Cancion("zzz", artistas3);
        Cancion c4 = new Cancion("zzz", artistas4);
        Cancion c5 = new Cancion("zzz", artistas5);

        ArrayList<Cancion>canciones = new ArrayList<>();
        canciones.add(c1);
        canciones.add(c2);
        canciones.add(c3);
        canciones.add(c4);
        canciones.add(c5);
        Album album1 = new Album("donda", canciones);

        assertTrue(album1.artistasEnAlbum().size()>1);
    }

    @org.junit.jupiter.api.Test
    void artistaConMasCanciones() {
        Artista a1 = new Artista("nicolas", "manolo", "12/12/12");
        Artista a2 = new Artista("matias", "manolo", "12/12/12");
        Artista a3 = new Artista("mama", "manolo", "12/12/12");
        Autor au1 = new Autor("m", "m", "m", "Argentina");
        Autor au2 = new Autor("m", "m", "m", "Chile");
        Autor au3 = new Autor("m", "m", "m", "Uruguay");
        Autor au4 = new Autor("m", "m", "m", "Brasil");
        Autor au5 = new Autor("m", "m", "m", "Peru");
        HashSet<Artista> artistas = new HashSet<>();
        HashSet<Artista> artistas2 = new HashSet<>();
        HashSet<Artista> artistas3 = new HashSet<>();
        HashSet<Artista> artistas4 = new HashSet<>();
        HashSet<Artista> artistas5 = new HashSet<>();
        artistas.add(a1);
        artistas2.add(a1);
        artistas2.add(a2);
        artistas3.add(a1);
        artistas3.add(a2);
        artistas3.add(a3);
        artistas4.add(a2);
        artistas5.add(a2);
        artistas5.add(a3);


        Cancion c1 = new Cancion("zzz", artistas);
        Cancion c2 = new Cancion("zzz", artistas2);
        Cancion c3 = new Cancion("zzz", artistas3);
        Cancion c4 = new Cancion("zzz", artistas4);
        Cancion c5 = new Cancion("zzz", artistas5);

        ArrayList<Cancion>canciones = new ArrayList<>();
        canciones.add(c1);
        canciones.add(c2);
        canciones.add(c3);
        canciones.add(c4);
        canciones.add(c5);
        Album album1 = new Album("donda", canciones);

        System.out.println(a2);
        System.out.println(album1.artistaConMasCanciones());
    }
}