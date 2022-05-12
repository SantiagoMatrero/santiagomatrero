package com.company;

public abstract class ProductoElectrico extends ProductoDeSuper{
    private Integer cantDiasDeGarantia;
    public static Integer RECARGO_POR_ENVIO;

    public ProductoElectrico(String nombre, String origen, Integer codigo, float costo) {
        super(nombre, origen, codigo, costo);
    }

    @Override
    public float calcularGananciaObtenida() {
        if (cantDiasDeGarantia==365){
            return (this.getCosto()*100/45);
        }
        else if(cantDiasDeGarantia<=60){
            return (this.getCosto()*100/15);
        }
        else return 0;
    }

    @Override
    public float calcularPrecioFinal() {
        float precioParcial = this.getCosto()+this.calcularGananciaObtenida();
        return precioParcial+(RECARGO_POR_ENVIO*100/precioParcial);
    }

    @Override
    public String tipoDeProducto() {
        return "Producto electrico";
    }
}
