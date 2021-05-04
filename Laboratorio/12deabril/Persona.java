package com.company;

public class persona{
    private string nombre;
    private int edad;
    private int dni;
    private int telefono;
    private string direccion;

public persona(){
    nombre : "Nicolas";
    edad : "20";
    dni : "40888888";
    telefono : "1133334444";
    direccion : "Nazca 1223";
}

public persona(string nuevoNombre){
    nombre = nuevoNombre;
    edad = "22";
    dni = "38999333";
    telefono = "1166667777";
    direccion : "Albarellos 2222";
}

public persona (string nuevoNombre, nuevaEdad, nuevoDni, nuevoTelefono, nuevaDireccion){
    nombre = nuevoNombre;
    edad = nuevaEdad;
    dni = nuevoDni;
    telefono = nuevoTelefono;
    direccion = nuevaDireccion;
}

String getNombre(String nuevoNombre){
    return nombre;
}

public void SetNombre (String nuevoNombre){
    nombre = nuevoNombre;
}

public int getEdad (int nuevaEdad){
    return edad;
}

public void SetEdad(int nuevaEdad){
    edad = nuevaEdad;
}

public int GetDni (int nuevoDni){
    return dni;
}

public void SetDni(int nuevoDni){
    dni = nuevoDni;
}

public int GetTelefono(int nuevoTelefono){
    return = telefono;
}

public void SetTelefono(int nuevoTelefono){
    telefono = nuevoTelefono;
}

String GetDireccion(String nuevaDireccion){
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


}

