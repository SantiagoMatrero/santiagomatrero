package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Alumno Alumno = new Alumno("Santiago", 17, 44891685, 1138553341, "Agustin Alvarez 5144", "5to computacion", new HashMap<>());

        Alumno.agregarMateria("Matematica");
        Alumno.agregarNota("Matematica", 8.5f);
        Alumno.agregarNota("Matematica", 10f);
        Alumno.agregarNota("Matematica", 6f);
        Alumno.menorNota("Matematica");
        Alumno.mayorNota("Matematica");
        Alumno.promedioNotas("Matematica");

    }
}
