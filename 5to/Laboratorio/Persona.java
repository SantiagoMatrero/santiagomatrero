package com.company;

public class Persona{
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Persona(){
        this.nombre = "Nicolas";
        this.edad = 20;
        this.dni = 40888888;
        this.telefono = 1133334444;
        this.direccion = "Nazca 1223";
    }

    public Persona(String nuevoNombre){
        this.nombre = nuevoNombre;
        this.edad = 22;
        this.dni = 38999333;
        this.telefono = 1166667777;
        this.direccion = "Albarellos 2222";
    }

    public Persona (String nuevoNombre, int nuevaEdad, int nuevoDni, int nuevoTelefono, String nuevaDireccion){
        this.nombre = nuevoNombre;
        this.edad = nuevaEdad;
        this.dni = nuevoDni;
        this.telefono = nuevoTelefono;
        this.direccion = nuevaDireccion;
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

    public void SetDato(String tipoDeDato, int nuevoDatoInt, String nuevoDatoString){
        if (tipoDeDato == "nombre") {
            nombre = nuevoDatoString;
        }
        if (tipoDeDato == "edad"){
            edad = nuevoDatoInt;
        }
        if (tipoDeDato == "dni"){
            dni = nuevoDatoInt;
        }
        if (tipoDeDato == "telefono"){
            telefono = nuevoDatoInt;
        }
        if (tipoDeDato == "direccion"){
            direccion = nuevoDatoString;
        }
    }


        public boolean esMayorDeEdad(int nuevaEdad){
            if (nuevaEdad > 18){
                return true;
            }
            return false;
        }

        boolean sonLaMismaPersona(int dni1, int dni2){
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
