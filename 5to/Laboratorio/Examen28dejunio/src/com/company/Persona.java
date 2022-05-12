package com.company;

public class Persona {

    private String nombre;
    private Integer dni;

    public Persona(String nombre, Integer dni){
     this.nombre = nombre;
     this.dni = dni;
    }


    String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    Integer getDni() {
        return dni;
    }

    public void setDni(Integer nuevoDni){
        this.dni = nuevoDni;
    }

}
