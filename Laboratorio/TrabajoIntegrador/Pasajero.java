package com.company;

public class Pasajero {

    private String nombre;
    private String apellido;
    private TarjetaEquis tarjeta;


    public Pasajero (String nombre, String apellido, TarjetaEquis tarjeta){
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = tarjeta;
    }


    TarjetaEquis getTarjetaEquis(){
        return tarjeta;
    }





    }