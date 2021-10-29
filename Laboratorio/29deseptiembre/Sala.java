package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Sala {
    private int numeroDeSala;
    private int asientos;
    private ArrayList<Visitante> historialVisitantes;
    private HashSet<Visitante>visitantesEnSala;
    public static int capacidadMax = 50;

    public Sala(int numeroDeSala, int asientos, ArrayList<Visitante> historialVisitantes, HashSet<Visitante> visitantesEnSala) {
        this.numeroDeSala = numeroDeSala;
        this.asientos = asientos;
        this.historialVisitantes = historialVisitantes;
        this.visitantesEnSala = visitantesEnSala;
    }

    public void nuevoVisitante(Visitante v){
        historialVisitantes.add(v);
        visitantesEnSala.add(v);
    }

    public int cantidadDeVisitantesPresentes(){
        return (visitantesEnSala.size());
    }

    public boolean estaLlena(){
        if (visitantesEnSala.size()==capacidadMax){
            return true;
        }
        else return false;
    }

    public boolean hayInfiltrados(){
        if (visitantesEnSala.size()>capacidadMax){
            return true;
        }
        else return false;
    }

    public int asientosDisponibles(){
        return (capacidadMax - visitantesEnSala.size());
    }

    public ArrayList<Visitante> getHistorialVisitantes() {
        return historialVisitantes;
    }

    public int getNumeroDeSala() {
        return numeroDeSala;
    }

    public void setNumeroDeSala(int numeroDeSala) {
        this.numeroDeSala = numeroDeSala;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public void setHistorialVisitantes(ArrayList<Visitante> historialVisitantes) {
        this.historialVisitantes = historialVisitantes;
    }

    public HashSet<Visitante> getVisitantesEnSala() {
        return visitantesEnSala;
    }

    public void setVisitantesEnSala(HashSet<Visitante> visitantesEnSala) {
        this.visitantesEnSala = visitantesEnSala;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        Sala.capacidadMax = capacidadMax;
    }
}
