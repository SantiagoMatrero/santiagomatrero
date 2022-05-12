package com.company;

public class Cliente extends Persona{

    private int cbu;

    public Cliente(String nombre, Integer dni, int cbu) {
        super(nombre, dni);
        this.cbu = cbu;
    }

    public Cliente(Persona p1, int cbu) {
        super(p1.getNombre(), p1.getDni());
        this.cbu = cbu;
    }


    int getCbu(){
        return cbu;
    }


}
