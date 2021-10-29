package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.util.*;

/** url: http://localhost:8080/api/... **/

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {

    @Autowired
    private AccesoBaseDeDatos accesoABaseDeDatos;

    public Controller() {
        this.accesoABaseDeDatos = new AccesoBaseDeDatos();
    }

    @RequestMapping(value = "/datos/alumnos", method = RequestMethod.GET)
    public ResponseEntity<Object>datosAlumnos() {

        this.accesoABaseDeDatos.conectar("root","Tiger2020");

        HashMap<String, Object> datos = accesoABaseDeDatos.serializarQuery("SELECT * FROM alumnos");

        return new ResponseEntity<>(datos, HttpStatus.OK);
    }

    @RequestMapping(value = "/datos/alumnos/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object>datosAlumno(@PathVariable int id){

        this.accesoABaseDeDatos.conectar("root","Tiger2020");

        HashMap<String, Object> datos = accesoABaseDeDatos.serializarQuery("SELECT * FROM alumnos WHERE id = " + id);
        return new ResponseEntity<>(datos,HttpStatus.OK);
    }

    @RequestMapping(value = "/datos/alumnos", method = RequestMethod.POST)
    public ResponseEntity<Object>insertAlumno(@RequestBody HashMap<String,String> alumno) {

        this.accesoABaseDeDatos.conectar("root","Tiger2020");

        String nombre = alumno.get("nombre");
        String edad = alumno.get("edad");

        accesoABaseDeDatos.modificarTabla("INSERT INTO alumnos (nombre, edad) VALUES (" + "'" + nombre + "'" + ", " + edad + ")");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/datos/alumnos", method = RequestMethod.PATCH)
    public ResponseEntity<Object>updateAlumno(@RequestBody HashMap<String,String>alumno) {

        this.accesoABaseDeDatos.conectar("root","Tiger2020");

        String id = alumno.get("id");
        String nombre = alumno.get("nombre");
        String edad = alumno.get("edad");

        accesoABaseDeDatos.modificarTabla("UPDATE alumnos SET nombre = " + "'" + nombre + "'" + ", edad = " + edad + " WHERE id = " + id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/datos/alumnos/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object>deleteAlumno(@PathVariable int id){

        this.accesoABaseDeDatos.conectar("root","Tiger2020");

        accesoABaseDeDatos.modificarTabla("DELETE FROM alumnos WHERE id = " + id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    public AccesoBaseDeDatos getBD() {return accesoABaseDeDatos;}
}