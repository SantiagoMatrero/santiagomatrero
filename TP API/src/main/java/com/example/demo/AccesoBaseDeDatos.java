package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.validation.ObjectError;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

@Service
public class AccesoBaseDeDatos {

    private Connection conexion;
    private final String nombreBaseDeDatos;
    private final String nombreTabla;

    public AccesoBaseDeDatos(){
        this.nombreBaseDeDatos = "mydb";
        this.nombreTabla = "alumnos";
    }

    public AccesoBaseDeDatos(String nombreBaseDeDatos, String nombreTabla){
        this.nombreBaseDeDatos = nombreBaseDeDatos;
        this.nombreTabla = nombreTabla;
    }


    public void conectar(String user, String password) {


        String url = "jdbc:mysql://localhost:3306/" + this.nombreBaseDeDatos + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        try {

            this.conexion = DriverManager.getConnection(url, user, password);

            if (conexion != null) {
                System.out.println("Se ha conectado exitosamente con la base de datos");
            } else {
                System.out.println("No se ha podido conectar con la base de datos");
            }

        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
    }

    public ResultSet obtenerResultado(String consulta){

        ResultSet resultado = null;

        try {

            Statement sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(consulta);


        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return resultado;
    }


    public HashMap<String, Object> serializarQuery(String consulta){

        ResultSet resultado = this.obtenerResultado(consulta);
        HashMap<String, Object>alumnosaux = new HashMap<>();
        ArrayList<Alumno>alumnos = new ArrayList<>();

        try {

            while (resultado.next()){

                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");

                Alumno alumnoActual = new Alumno(id, nombre, edad);
                alumnos.add(alumnoActual);
            }
            alumnosaux.put("", alumnos);
        }

        catch (SQLException e) {
            e.printStackTrace();
        }

        return alumnosaux;
    }



    public void modificarTabla(String consulta) {
        /* INSERT, UPDATE, DELETE */
        try {
            Statement sentencia = this.conexion.createStatement();
            sentencia.executeUpdate(consulta);
            sentencia.close();

        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
    }


    /* dudas con este

    public void imprimirDatos() {

        ResultSet resultado = this.seleccionarTodo();

        try {

            while (resultado.next()) {

                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                int edad = resultado.getInt("edad");

                System.out.println(id + " " + nombre + " " + apellido + " " + edad);
            }

            resultado.close();

        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
    }
    */




    public ResultSet mostrarColumnas(){
        String consulta = "SHOW COLUMNS FROM " + this.nombreTabla;
        ResultSet resultado = this.obtenerResultado(consulta);
        return resultado;
    }

    public ArrayList<String> colocarCamposEnLista() {

        ArrayList<String> nombresDeCampos = new ArrayList<>();
        ResultSet resultado = this.mostrarColumnas();

        try {

            while (resultado.next()) {
                String nombreDeColumna = resultado.getString("field");
                nombresDeCampos.add(nombreDeColumna);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return nombresDeCampos;
    }

    /*   dudas con este ejercicio
    public HashMap<String,Object> obtenerDatos(){
        HashMap<String,Object> datos = new HashMap<>();
        datos.put("mensaje","holaa!");
         completar
        return datos;
    }
    */

    public void agregarAlumno(Alumno alumno) {
        String nombre = alumno.getNombre();
        int edad = alumno.getEdad();
        try {
            Statement sentencia = this.conexion.createStatement();
            sentencia.executeUpdate("INSERT INTO alumnos VALUES (nombre, edad);");
            sentencia.close();

        } catch (SQLException excepcion) {
            excepcion.printStackTrace();
        }
    }



    public Connection getConexion() {
        return conexion;
    }
    public String getNombreBaseDeDatos() {
        return nombreBaseDeDatos;
    }
    public String getNombreTabla() {
        return nombreTabla;
    }
}
