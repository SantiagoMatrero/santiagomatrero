package com.company;

public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;


    public Persona(String nombre, int edad, int dni, int telefono, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }


    String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    int getEdad(){
        return edad;
    }

    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }

    int getDni(){
        return dni;
    }

    public void setDni(int nuevoDni){
        dni = nuevoDni;
    }

    int getTelefono(){
        return telefono;
    }

    public void setTelefono(int nuevoTelefono){
        telefono = nuevoTelefono;
    }

    String getDireccion(){
        return direccion;
    }

    public void setDireccion(String nuevaDireccion){
        direccion = nuevaDireccion;
    }
}
