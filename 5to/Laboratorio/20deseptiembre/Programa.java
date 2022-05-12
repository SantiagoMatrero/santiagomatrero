package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Programa {

    private HashMap<String, String>emisiones;
    private String nombre;
    private ArrayList<Trabajador>conductores;
    private Trabajador operadorTecnico;
    private String categoria;


    public Programa(HashMap<String, String> emisiones, String nombre, ArrayList<Trabajador> conductores, Trabajador operadorTecnico, String categoria) {
        this.emisiones = emisiones;
        this.nombre = nombre;
        this.conductores = conductores;
        this.operadorTecnico = operadorTecnico;
        this.categoria = categoria;
    }

    public Programa(HashMap<String, String> emisiones, String nombre, ArrayList<Trabajador> conductores, Trabajador operadorTecnico) {
        this.emisiones = emisiones;
        this.nombre = nombre;
        this.conductores = conductores;
        this.operadorTecnico = operadorTecnico;
        this.categoria = "musica";
    }
}
