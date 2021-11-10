package com.company;

public class ProductoElectrico extends ProductoDeSuper{
    private int cantDiasDeGarantia;
    private static int RECARGO_POR_ENVIO = 100;

    public ProductoElectrico(String nombre, String origen, int código, float costo, int cantDiasDeGarantia) {
        super(nombre, origen, código, costo);
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }


    public float getGanancia(){
        if(cantDiasDeGarantia==365){
            return this.getCosto()*0.45f;
        }
        else return this.getCosto()*0.15f;
    }

    public float calcularPrecioFinal(){
        return this.getCosto() + this.getGanancia() + this.RECARGO_POR_ENVIO;
    }

    public String tipoDeProducto(){
        return ("Producto electrico");
    }
}
