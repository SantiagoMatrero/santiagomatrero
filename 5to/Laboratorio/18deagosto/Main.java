package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {



    public static void main(String[] args) {

        Scanner getFloat = new Scanner(System.in);
        JFrame ventana = new JFrame();
        ventana.setLayout(new BorderLayout());
        ventana.setSize(500, 500);

        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new GridLayout(3,3));
        panelSuperior.setBackground(Color.cyan);
        JButton boton1 = new JButton("circulo");
        JButton boton2 = new JButton("esfera");
        JButton boton3 = new JButton("cuadrado");
        JButton boton4 = new JButton("cubo");
        JButton boton5 = new JButton("triangulo");


        panelSuperior.add(boton1);
        panelSuperior.add(boton2);
        panelSuperior.add(boton3);
        panelSuperior.add(boton4);
        panelSuperior.add(boton5);


        for (int i = 0; i < panelSuperior.getComponents().length; i++) {
            JButton boton = (JButton)panelSuperior.getComponent(i);
            String texto = boton.getText();
            Point punto = panelSuperior.getComponent(i).getLocation();
        }

        ventana.add(panelSuperior,BorderLayout.NORTH);


        ventana.setVisible(true);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ingrese el valor del radio del circulo");
                float radio = getFloat.nextFloat();
                double area = radio*radio*PI;
                System.out.println(area);
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ingrese el valor del radio de la esfera");
                float radio = getFloat.nextFloat();
                double area = 4*radio*radio*PI;
                System.out.println(area);
            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ingrese el valor de los lados del cuadrado");
                float lado = getFloat.nextFloat();
                double area = lado*lado;
                System.out.println(area);
            }
        });

        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ingrese el valor de los lados del cubo");
                float lado = getFloat.nextFloat();
                double area = lado*lado*6;
                System.out.println(area);
            }
        });

        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ingrese el valor de la base y de la altura del triangulo");
                float base = getFloat.nextFloat();
                float altura = getFloat.nextFloat();
                double area = (base*altura)/2;
                System.out.println(area);
            }
        });



    }
}