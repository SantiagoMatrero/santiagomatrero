package com.company;


import java.util.HashMap;
import java.util.HashSet;

public class Madre extends Persona{

    private String empresa;
    private HashSet<Hijo>hijos = new HashSet<>();

    public Madre(String nombre, int edad, int dni, int telefono, String direccion) {
        super(nombre, edad, dni, telefono, direccion);
        this.empresa = "Sancor";
        this.hijos = new HashSet<>();
    }


    public Madre(String nombre, int edad, int dni, int telefono, String direccion, String empresa, HashSet<Hijo>hijos) {
        super(nombre, edad, dni, telefono, direccion);
        this.empresa = empresa;
        this.hijos = hijos;


    }

    HashSet<Hijo>getHijos(){
        return hijos;
    }



    HashSet<Hijo>hijosMenores(HashSet<Hijo>hijos){
        HashSet<Hijo>hijosMenores = new HashSet<>();

        for (Hijo i : hijos){
            if(i.getEdad()>18){
                hijosMenores.add(i);
            }
        }
        return hijosMenores;
    }





}
