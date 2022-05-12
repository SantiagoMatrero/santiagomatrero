package com.company;

public class Asistencia {

    public int dia;
    public int mes;
    public String hora;

    public Asistencia(int dia, int mes, String hora) {
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
