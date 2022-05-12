package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {

    private ArrayList<Pasajero>pasajerosPresentes;
    private ArrayList<Pasajero>historialDePasajeros;
    private int linea;


    public Sistema (int linea){
        this.pasajerosPresentes = new ArrayList<>();
        this.historialDePasajeros = new ArrayList<>();
        this.linea = linea;
    }



    public void subePasajero(Pasajero pasajero){
        if(pasajero.getTarjetaEquis().getSaldo() > pasajero.getTarjetaEquis().getSaldoNegativoMaximo()){
            System.out.println("¡Bienvenido!");
            pasajerosPresentes.add(pasajero);
            if (!historialDePasajeros.contains(pasajero)){
                historialDePasajeros.add(pasajero);
            }
        }
        else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public void bajaPasajero(Pasajero pasajero){
        if (pasajerosPresentes.contains(pasajero)) {
            pasajerosPresentes.remove(pasajero);
        }
    }


    HashSet pasajerosQueSeHanSubidoAlgunaVez(){
        HashSet<Pasajero>pasajerosQueSeHanSubidoAlgunaVez = new HashSet<>();
        for (Pasajero a : historialDePasajeros){
            pasajerosQueSeHanSubidoAlgunaVez.add(a);
        }
        return pasajerosQueSeHanSubidoAlgunaVez;
    }


    HashMap pasajerosConUltimoMontoAbonado(){
        HashMap <Pasajero, Float> pasajeros = new HashMap<>();

       for (Pasajero a : historialDePasajeros){
           pasajeros.put(a, a.getTarjetaEquis().ultimoMontoAbonado());
       }
       return pasajeros;
    }


    float ultimoMontoAbonadoPorPasajero(float numeroId){
        float ultimoMontoAbonadoPorPasajeroX = 0;
        for (Pasajero a : historialDePasajeros){
            if (a.getTarjetaEquis().getNumeroId()==numeroId){
                ultimoMontoAbonadoPorPasajeroX = a.getTarjetaEquis().ultimoMontoAbonado();
            }
        }
        return ultimoMontoAbonadoPorPasajeroX;
    }



    boolean seSuperaElSaldoNegativo(TarjetaEquis tarjetaPasajero, Viaje viaje){
        if (tarjetaPasajero.getSaldo()- viaje.getPrecio() < tarjetaPasajero.getSaldoNegativoMaximo()){
            return true;
        }
        else return false;
    }



}