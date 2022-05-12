package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SistemaTest {

    @Test
    void cancionesPorNacionalidad() {

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

        HashSet<Autor>autores = new HashSet<>();
        autores.add(au1);
        autores.add(au2);
        autores.add(au3);
        HashSet<Autor>autores2 = new HashSet<>();
        autores2.add(au2);
        autores2.add(au5);



        Cancion c1 = new Cancion("zzz", artistas, autores);
        Cancion c2 = new Cancion("zzz", artistas2, autores);
        Cancion c3 = new Cancion("zzz", artistas3, autores);
        Cancion c4 = new Cancion("zzz", artistas4, autores2);
        Cancion c5 = new Cancion("zzz", artistas5, autores);

        ArrayList<Cancion> canciones = new ArrayList<>();
        ArrayList<Cancion> canciones2 = new ArrayList<>();
        canciones.add(c1);
        canciones.add(c2);
        canciones2.add(c3);
        canciones2.add(c4);
        canciones2.add(c5);
        Album album1 = new Album("donda", canciones);
        Album album2 = new Album("CLB", canciones2);

        ArrayList<Album>albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);

        Sistema s1 = new Sistema("Sistema", albums);


        assertTrue(s1.cancionesPorNacionalidad("Argentina").size()==4);
    }
}