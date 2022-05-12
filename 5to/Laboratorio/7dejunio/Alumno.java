package com.company;

import java.util.HashMap;
import java.util.ArrayList;

public class Alumno extends Persona {

    private String curso;
    private HashMap<String, ArrayList<Float>> notasPorMateria;


    public Alumno(String nombre, int edad, int dni, int telefono, String direccion, String curso, HashMap<String, ArrayList<Float>> notasPorMateria) {
        super(nombre, edad, dni, telefono, direccion);
        this.curso = curso;
        this.notasPorMateria = notasPorMateria;
    }


    public void agregarNota(String materia, Float nota) {
        ArrayList<Float> auxiliar = notasPorMateria.get(materia);
        auxiliar.add(nota);
        notasPorMateria.replace(materia, auxiliar);
    }

    public void menorNota(String materia) {
        Float menorNota = notasPorMateria.get(materia).get(0);
        for (Float i : notasPorMateria.get(materia)) {
            if (i < menorNota) {
                menorNota = i;
            }
        }
        System.out.println("La menor nota de " + materia + " es " + menorNota);
    }

    public void mayorNota(String materia) {
        Float mayorNota = notasPorMateria.get(materia).get(0);
        for (Float i : notasPorMateria.get(materia)) {
            if (i > mayorNota) {
                mayorNota = i;
            }
        }
        System.out.println("La mayor nota de " + materia + " es " + mayorNota);
    }

    public void promedioNotas(String materia) {
        Float promedio = 0f;
        for (Float i : notasPorMateria.get(materia)) {
            promedio = promedio + i;
        }
        System.out.println(promedio);
        promedio = promedio / notasPorMateria.get(materia).size();
        System.out.println("El promedio de las notas de " + materia + " es " + promedio);
    }

    public void agregarMateria(String nombreDeMateria){
        ArrayList<Float>notas = new ArrayList<>();
        notasPorMateria.put(nombreDeMateria, notas);
    }



}
