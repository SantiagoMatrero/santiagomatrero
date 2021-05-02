package com.company;

public static void main (String[] args){

        Persona p1=new persona("Nicolas","18","40333444","1122221111","Nazca 2222");
        Persona p2=new persona("Carlos","37","30222888","1199999999","Mosconi 6789");
        Persona p3=new persona("Sebastian","22","37666333","1134563748","Albarellos 3233");

        p1.SetEdad(p1.GetEdad()*2);

        p2.SetTelefono("1137655647");

        System.out.print(p3.GetNombre() + ", " + p3.GetEdad() + ", " + p3.GetDni(), ", " + p3.GetTelefono() + ", " + p3.GetDireccion());

        }