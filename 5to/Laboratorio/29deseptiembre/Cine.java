package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Cine {
    private String nombre;
    private String direccion;
    private HashSet<Sala> salas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public HashSet<Sala> getSalas() {
        return salas;
    }

    public void setSalas(HashSet<Sala> salas) {
        this.salas = salas;
    }

    public HashSet<Integer> visitantes() {
        HashSet<Integer> idsVisitantes = new HashSet<>();
        for (Sala s : salas) {
            for (Visitante v : s.getHistorialVisitantes()) {
                idsVisitantes.add(v.getId());
            }
        }
        return idsVisitantes;
    }

    public int cantidadTotalDeVisitantes() {
        return visitantes().size();
    }

    public HashMap<Integer, Integer> visitantesConCantidadDeVisitas() {
        HashMap<Integer, Integer> visitantesVisitas = new HashMap<>();
        for (Sala a : salas) {
            for (Visitante v : a.getHistorialVisitantes()) {
                if (visitantesVisitas.containsKey(v.getId())) {
                    Integer aux = visitantesVisitas.get(v) + 1;
                    visitantesVisitas.replace(v.getId(), aux);
                } else visitantesVisitas.put(v.getId(), 1);
            }
        }
        return visitantesVisitas;
    }

    public HashSet<Sala> Salas (){
        HashSet<Sala>Salas = new HashSet<>();
        for (Sala a : salas){
            Salas.add(a);
        }
        return Salas;
    }

    public void informeActual(){
        for (Sala s : Salas()){
            System.out.println("Numero de sala: " + s.getNumeroDeSala() + "\nCantidad de asientos: " + s.getAsientos() + "\nCapacidad maxima permitida: " + s.getCapacidadMax() + "\nCantidad de visitantes presentes: " + s.cantidadDeVisitantesPresentes() + "\nCantidad de asientos disponibles: " + s.asientosDisponibles() + "\n\n");
        }
    }


}
