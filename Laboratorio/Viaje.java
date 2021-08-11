package com.company;

public class Viaje {

    private float precio;
    private String fecha;
    private String hora;


    public Viaje (Float precio, String fecha, String hora){
        this.precio = precio;
        this.fecha = fecha;
        this.hora = hora;
    }


    float getPrecio(){
        return precio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora(){
        return hora;
    }



    @Override
    public String toString() {
        return "hora: " + this.hora + " | fecha: " + this.fecha + " | precio: " + this.precio;
    }

}