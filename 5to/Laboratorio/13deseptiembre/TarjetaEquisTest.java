package com.company;

import static org.junit.jupiter.api.Assertions.*;

class TarjetaEquisTest {

    @org.junit.jupiter.api.Test
    void casoCargarSube() {
        TarjetaEquis T1 = new TarjetaEquis(1);
        T1.cargarSube(100);
        assertTrue(T1.getSaldo()==200);
    }

    @org.junit.jupiter.api.Test
    void casoUltimoMontoAbonado() {
        TarjetaEquis T1 = new TarjetaEquis(1);
        Viaje V1 = new Viaje();
        T1.relizarViaje(V1);
        assertEquals(T1.ultimoMontoAbonado(), 10f);
    }
}