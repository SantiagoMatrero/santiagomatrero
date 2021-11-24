package com.company;

public abstract class ProductoAlimenticio extends ProductoDeSuper{
    private Integer cantDiasParaVencerse;
    public static Integer DESCUENTO;

    public ProductoAlimenticio(String nombre, String origen, Integer codigo, float costo, Integer cantDiasParaVencerse) {
        super(nombre, origen, codigo, costo);
        this.cantDiasParaVencerse=cantDiasParaVencerse;
        DESCUENTO = 10;
    }

    @Override
    public float calcularGananciaObtenida() {
        if (cantDiasParaVencerse<=90){
            return (this.getCosto()*10/100);
        }
        else return (this.getCosto()*25/100);
    }

    @Override
    public float calcularPrecioFinal() {
        float precioParcial = this.getCosto()+this.calcularGananciaObtenida();
        return precioParcial-(DESCUENTO*100/precioParcial);
    }

    @Override
    public String tipoDeProducto() {
        return "Producto alimenticio";
    }


}
