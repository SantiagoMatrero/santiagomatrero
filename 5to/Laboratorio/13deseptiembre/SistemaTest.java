package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTest {

    @Test
    void casoPasajerosQueSeHanSubidoAlgunaVez() {
        Sistema S1 = new Sistema(110);
        TarjetaEquis T1 = new TarjetaEquis(1);
        Pasajero P1 = new Pasajero("Lucas", "Gonzalez", T1);
        S1.subePasajero(P1);
        assertEquals(S1.pasajerosQueSeHanSubidoAlgunaVez().size(),1);
    }

    @Test
    void casoPasajerosConUltimoMontoAbonado() {
        Sistema S1 = new Sistema(110);
        TarjetaEquis T1 = new TarjetaEquis(1);
        Pasajero P1 = new Pasajero("Lucas", "Gonzalez", T1);
        Viaje V1 = new Viaje();
        T1.relizarViaje(V1);
        S1.subePasajero(P1);
        assertTrue(S1.pasajerosConUltimoMontoAbonado().containsKey(P1));
    }

    @Test
    void casoSeSuperaElSaldoNegativo() {
        Sistema S1 = new Sistema(110);
        TarjetaEquis T1 = new TarjetaEquis(1);
        Pasajero P1 = new Pasajero("Lucas", "Gonzalez", T1);
        Viaje V1 = new Viaje();
        assertTrue(S1.seSuperaElSaldoNegativo(T1, V1));
    }
}