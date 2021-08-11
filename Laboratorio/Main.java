package com.company;

import java.util.Scanner;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

    public static void main (String[] args){


        Scanner tipoDeDato = new Scanner(System.in);
        Scanner nuevoIntIngresado = new Scanner(System.in);
        Scanner nuevoStringIngresado = new Scanner(System.in);



        JFrame ventana = new JFrame();
        ventana.setLayout(null);
        ventana.setSize(1000, 1000);

        JLabel texto = new JLabel();
        texto.setText("Ingrese su nombre");
        texto.setSize(300, 25);
        texto.setLocation(25, 25);

        JTextField campoDeTexto = new JTextField();
        campoDeTexto.setSize(500,25);
        campoDeTexto.setLocation(25,60);

        JLabel texto2 = new JLabel();
        texto2.setText("Ingrese su edad");
        texto2.setSize(300, 25);
        texto2.setLocation(25, 125);

        JTextField campoDeTexto2 = new JTextField();
        campoDeTexto2.setSize(500,25);
        campoDeTexto2.setLocation(25,160);

        JLabel texto3 = new JLabel();
        texto3.setText("Ingrese su dni");
        texto3.setSize(300, 25);
        texto3.setLocation(25, 225);

        JTextField campoDeTexto3 = new JTextField();
        campoDeTexto3.setSize(500,25);
        campoDeTexto3.setLocation(25,260);

        JLabel texto4 = new JLabel();
        texto4.setText("Ingrese su telefono");
        texto4.setSize(300, 25);
        texto4.setLocation(25, 325);

        JTextField campoDeTexto4 = new JTextField();
        campoDeTexto4.setSize(500,25);
        campoDeTexto4.setLocation(25,360);

        JLabel texto5 = new JLabel();
        texto5.setText("Ingrese su direccion");
        texto5.setSize(300, 25);
        texto5.setLocation(25, 425);

        JTextField campoDeTexto5 = new JTextField();
        campoDeTexto5.setSize(500,25);
        campoDeTexto5.setLocation(25,460);

        JButton boton = new JButton("Ingresar");
        boton.setSize(100, 33);
        boton.setLocation(25,525);

        JLabel respuesta = new JLabel();
        respuesta.setSize(500,25);
        respuesta.setLocation(30,560);

        ventana.add(texto);
        ventana.add(campoDeTexto);
        ventana.add(texto2);
        ventana.add(campoDeTexto2);
        ventana.add(texto3);
        ventana.add(campoDeTexto3);
        ventana.add(texto4);
        ventana.add(campoDeTexto4);
        ventana.add(texto5);
        ventana.add(campoDeTexto5);
        ventana.add(boton);
        ventana.add(respuesta);

        ventana.setVisible(true);

        boton.addMouseListener(

                new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        String nombre = campoDeTexto.getText();
                        int edad = campoDeTexto2.getColumns();
                        int dni = campoDeTexto3.getColumns();
                        int telefono = campoDeTexto4.getColumns();
                        String direccion = campoDeTexto5.getText();
                        Persona persona = new Persona(nombre, edad, dni, telefono, direccion);
                        respuesta.setText("Hola " + persona.getNombre() + ", sabemos donde vivis..." + persona.GetDireccion() + "...");
                        }
                });
    }
}
