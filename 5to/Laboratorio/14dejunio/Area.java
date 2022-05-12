package com.company;

import static java.lang.Math.PI;
import static java.lang.Math.*;

public class Area {


    static double Circulo(double radio){
        double area = radio*radio*PI;
        return area;
    }

    static double Esfera(double radio){
        double area = radio*radio*PI*4;
        return area;
    }

    static double Cuadrado(double lado){
        double area = lado*lado;
        return area;
    }

    static double Cubo(double lado){
        double area = lado*lado;
        return area;
    }

    static double Triangulo(double base, double altura){
        double area = base*altura/2;
        return area;
    }

    public static void main(String[] args) {

        double a = Triangulo(3, 4);

        System.out.println(a);

    }


}
