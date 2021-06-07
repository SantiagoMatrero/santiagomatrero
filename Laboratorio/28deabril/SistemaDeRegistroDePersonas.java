package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeRegistroDePersonas {

    private ArrayList <Persona> personas = new ArrayList<Persona>();
    private Scanner GetString = new Scanner(System.in);
    private Scanner GetInt = new Scanner(System.in);



    public void Registro(){
        boolean terminar = false;
        while (!terminar){
            System.out.println("Que es lo que quiere hacer/ver (A, B, M, mayores o registrados)");
            String respuesta = GetInt.nextLine();
            if(respuesta == "A"){
                Persona personaIngresada = new Persona();
                System.out.println("Ingrese los datos de la persona");

                String nuevoNombre = GetString.nextLine();
                int nuevaEdad = GetInt.nextInt();
                int nuevoDni = GetInt.nextInt();
                int nuevoTelefono = GetInt.nextInt();
                String nuevaDireccion = GetString.nextLine();

                personaIngresada.SetNombre(nuevoNombre);
                personaIngresada.SetEdad(nuevaEdad);
                personaIngresada.SetDni(nuevoDni);
                personaIngresada.SetTelefono(nuevoTelefono);
                personaIngresada.SetDireccion(nuevaDireccion);

                personas.add(personaIngresada);

            }

            else if(respuesta == "B"){

                System.out.println("Ingrese el DNI de la persona a la que quiera dar de baja");
                int personaAEliminar = GetInt.nextInt();
                personas.removeIf(dni -> dni.equals(personaAEliminar));

            }

            else if(respuesta == "M"){

                System.out.println("Ingrese el DNI de la persona a la que quiera modificar y el atributo que quiera cambiar");
                int personaAModificar = GetInt.nextInt();
                String datoAModificar = GetString.nextLine();

                for (int i = 0; i >= personas.size(); i ++){
                    Persona aux = new Persona();
                    aux = personas.get(i);

                    if(aux.GetDni() == personaAModificar){

                        if (datoAModificar == "nombre"){

                            System.out.println("Ingrese el nuevo nombre de la persona");
                            String nuevoNombre = GetString.nextLine();
                            aux.SetNombre(nuevoNombre);

                        }

                        else if (datoAModificar == "edad"){

                            System.out.println("Ingrese la nueva edad de la persona");
                            int nuevaEdad = GetInt.nextInt();
                            aux.SetEdad(nuevaEdad);

                        }

                        else if (datoAModificar == "dni"){

                            System.out.println("Ingrese el nuevo DNI de la persona");
                            int nuevoDni = GetInt.nextInt();
                            aux.SetDni(nuevoDni);

                        }

                        else if (datoAModificar == "telefono"){

                            System.out.println("Ingrese el nuevo telefono de la persona");
                            int nuevoTelefono = GetInt.nextInt();
                            aux.SetTelefono(nuevoTelefono);

                        }

                        else if (datoAModificar == "direccion"){

                            System.out.println("Ingrese la nueva direccion de la persona");
                            String nuevaDireccion = GetString.nextLine();
                            aux.SetDireccion(nuevaDireccion);

                        };

                    }
                }

            }

            else if(respuesta == "mayores"){

                for (int i = 0; i >= personas.size(); i++){

                    int edadAComparar = personas.get(i).getEdad();
                    if (edadAComparar >= 18){
                        System.out.println(personas.get(i).getNombre());
                    }

                }

            }

            else if(respuesta == "registrados"){

                for (int i = 0; i >= personas.size(); i++){

                    System.out.println(personas.get(i));

                    }

            }

            System.out.println("Quiere salir del sistema?");
            String res = GetString.nextLine();
            if (res == "si"){
                terminar = true;
            }

        }

    }

}

