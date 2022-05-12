package com.company;

import java.util.ArrayList;

public class Sistema {

    public ArrayList<Empleado>empleados;

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Sistema(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }


    public void empleadosXMes(int mes){
        String datos = "";

        for (Empleado empleadoActual : this.empleados){
            datos = datos + "\nNombre: " + empleadoActual.getNombre() + "  |  Asistencia: " + empleadoActual.porcentajeAsistencia(mes) + "%";
        }

        System.out.println(datos);
    }


}
