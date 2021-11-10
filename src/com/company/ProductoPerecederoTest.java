package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ProductoPerecederoTest {


    @Test
    void calcularPrecioFinal(){
        ProductoPerecedero producto = new ProductoPerecedero();

        assertTrue(producto.calcularPrecioFinal()!=55);
    }

}