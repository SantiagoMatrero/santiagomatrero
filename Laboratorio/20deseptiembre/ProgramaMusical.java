package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ProgramaMusical extends Programa{

    private Musicalizador musicalizador;
    private HashSet<String> estilosDeMusica;


    public ProgramaMusical(HashMap<String, String> emisiones, String nombre, ArrayList<Conductor> conductores, Operador operadorTecnico, Musicalizador musicalizador, HashSet<String> estilosDeMusica) {
        super(emisiones, nombre, conductores, operadorTecnico);
        this.musicalizador = musicalizador;
        this.estilosDeMusica = estilosDeMusica;
    }
}
