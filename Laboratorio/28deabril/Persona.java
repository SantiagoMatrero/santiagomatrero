package com.company;

import java.util.ArrayList;

public class Persona{
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;


    public Persona(){
        this.nombre = "Manuel";
        this.edad = 21;
        this.dni = 44555666;
        this.telefono = 1177773333;
        this.direccion = "Av. Nazca 3333";
    }

    public Persona(String Nombre){
        this.nombre = Nombre;
        this.edad = 33;
        this.dni = 34987098;
        this.telefono = 1133332222;
        this.direccion = "Av. Nazca 1111";
    }

    public Persona(String Nombre, int Edad, int Dni, int Telefono, String Direccion) {
        this.nombre = Nombre;
        this.edad = Edad;
        this.dni = Dni;
        this.telefono = Telefono;
        this.direccion = Direccion;
    }


    String getNombre(){
        return nombre;
    }

    public void SetNombre (String nuevoNombre){
        nombre = nuevoNombre;
    }

    public int getEdad (){
        return edad;
    }

    public void SetEdad(int nuevaEdad){
        edad = nuevaEdad;
    }

    public int GetDni (){
        return dni;
    }

    public void SetDni(int nuevoDni){
        dni = nuevoDni;
    }

    public int GetTelefono(){
        return telefono;
    }

    public void SetTelefono(int nuevoTelefono){
        telefono = nuevoTelefono;
    }

    String GetDireccion(){
        return direccion;
    }

    public void SetDireccion(String nuevaDireccion){
        direccion = nuevaDireccion;
    }



    public boolean esMayorDeEdad (int nuevaEdad){
        if (nuevaEdad > 18){
            return true;
        }
        else return false;
    }

    public boolean sonLaMismaPersona (int dni1, int dni2){
        if (dni1==dni2){
            return true;
        }
        else return false;
    }

    public boolean tienenLaMismaEdad (int edad1, int edad2){
        if (edad1==edad2){
            return true;
        }
        else return false;
    }
}










