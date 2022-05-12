package com.company;

import java.util.ArrayList;

public class TarjetaEquis {

    private float saldo;
    private float saldoNegativoMaximo;
    private int numeroId;
    private ArrayList<Viaje>viajes;


    public TarjetaEquis(int numeroId){
        this.saldo = (100f);
        this.saldoNegativoMaximo = (-45f);
        this.numeroId = numeroId;
        viajes = new ArrayList<>();
    }



    public void cargarSube (float monto){
        saldo = saldo + monto;
    }

    public void relizarViaje (Viaje viaje){
        saldo = saldo-viaje.getPrecio();
        this.viajes.add(viaje);
    }

    float ultimoMontoAbonado(){
        return (viajes.get(viajes.size()-1).getPrecio());
    }


    float getSaldo(){
        return saldo;
    }


    ArrayList<Viaje>getViajes(){
        return viajes;
    }

    float getSaldoNegativoMaximo (){
        return saldoNegativoMaximo;
    }

    int getNumeroId() {
        return numeroId;
    }


    @Override
    public String toString(){
        String viajesRealizados = "";
        for (Viaje a : viajes){
            viajesRealizados = viajesRealizados + "\n hora: " + a.getHora() + " | fecha: " + a.getFecha() + " | precio: " + a.getPrecio() + " | saldo: " + this.getSaldo();
        }
        return viajesRealizados;
    }

}