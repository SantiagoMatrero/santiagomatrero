package com.company;

import java.util.HashSet;

public class Hijo extends Persona{

    private String escuela;
    private String juegoFavorito;

    public Hijo(String nombre, int edad, int dni, int telefono, String direccion){
        super(nombre, edad, dni, telefono, direccion);
        this.escuela="Politecnico";
        this.juegoFavorito="Counter-Strike";
    }


    public Hijo(String nombre, int edad, int dni, int telefono, String direccion, String escuela, String juegoFavorito) {
        super(nombre, edad, dni, telefono, direccion);
        this.escuela = escuela;
        this.juegoFavorito = juegoFavorito;
    }


}
