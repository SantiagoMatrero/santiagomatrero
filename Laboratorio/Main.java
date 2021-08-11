package com.company;

public class Main {

    public static void main(String[] args) {


        Sistema a = new Sistema(110);

        Viaje viaje = new Viaje(20f, "12/08/21", "13:43");
        Viaje viaje2 = new Viaje(15f, "11/09/21", "14:53");

        TarjetaEquis tarjeta = new TarjetaEquis(1);

        Pasajero pasajero = new Pasajero("Nicolas", "Perez", tarjeta);

        System.out.println(tarjeta.getSaldo());


        tarjeta.relizarViaje(viaje);
        tarjeta.relizarViaje(viaje2);

        System.out.println(tarjeta.getSaldo());

        a.subePasajero(pasajero);





        System.out.println(pasajero.toString());




    }
}
