package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Banco {

    private String nombre;
    ArrayList<Cliente>visitas = new ArrayList<>();



    public Banco (String nombre, ArrayList<Cliente>visitas){
        this.nombre = nombre;
        this.visitas = visitas;
    }




    HashSet<Integer>cbusDeClientesVisitantes(){
        HashSet<Integer>aux = new HashSet<>();
        for(Cliente a : visitas){
            aux.add(a.getCbu());
        }
        return aux;
    }

    public void imprimirCbus(HashSet<Integer>cbusDeClientesVisitantes){
        for(Integer a : cbusDeClientesVisitantes){
            System.out.println(a);
        }
    }


    HashMap<Integer, Integer>cantidadDeVisitasPorCliente(){
        HashMap<Integer, Integer> aux = new HashMap<>();
        for (Cliente a : visitas){
            if(aux.containsKey(a.getCbu())){
                aux.replace(a.getCbu(), +1);
            }
            else {
                aux.put(a.getCbu(), 1);
            }
        }
        return aux;
    }


    public void imprimirCantVisitas(HashMap aux){
        for (Object a : aux.keySet()){
            System.out.println("clave:"+aux.keySet()+"- valor:"+aux.get(a));
        }
    }


}
