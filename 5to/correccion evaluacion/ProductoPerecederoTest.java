package com.company;

import static org.junit.jupiter.api.Assertions.*;

class ProductoPerecederoTest {

    ProductoPerecedero producto = new ProductoPerecedero("AAA", "Mexico", 111, 50f, 89, 10);

    @org.junit.jupiter.api.Test
    void calcularPrecioFinal() {
        assertTrue(producto.calcularPrecioFinal()!=52.25f);
    }
}