package com.company;

public class Autor extends Artista{

    private String nacionalidad;

    public Autor(String nombre, String apellido, String fechaNac, String nacionalidad) {
        super(nombre, apellido, fechaNac);
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
