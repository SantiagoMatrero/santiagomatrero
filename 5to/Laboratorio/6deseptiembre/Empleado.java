package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Empleado {

    public String nombre;
    public String apellido;
    public int telefono;
    public String fechaNac;
    public String diasLaborales;
    public ArrayList<Asistencia>asistencias = new ArrayList<>();

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Empleado(String nombre, String apellido, int telefono, String fechaNac, String diasLaborales) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
        this.diasLaborales = diasLaborales;
        this.asistencias = new ArrayList<>();
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDiasLaborales() {
        return diasLaborales;
    }

    public void setDiasLaborales(String diasLaborales) {
        this.diasLaborales = diasLaborales;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void ingreso(int dia, int mes, String hora){
        Asistencia a = new Asistencia(dia, mes, hora);
        asistencias.add(a);
    }


    public int porcentajeAsistencia(int mes){
        int diasAsistidos = 0;
        for (Asistencia a:asistencias){
            if (a.getMes()==mes){
                diasAsistidos = diasAsistidos + 1;
            }
        }
        return (diasAsistidos*100/30);
    }



}
