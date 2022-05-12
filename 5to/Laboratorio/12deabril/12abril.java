import java.util.Scanner;

public class Main(String[] args){

    Scanner ingreso1 = new Scanner(System.in);
    Scanner ingreso2 = new Scanner(System.in);
    Scanner ingreso3 = new Scanner(System.in);
    Scanner ingreso4 = new Scanner(System.in);
    Scanner ingreso5 = new Scanner(System.in);
    Scanner tipoDeDato = new Scanner(System.in);
    Scanner nuevoIntIngresado = new Scanner(System.in);
    Scanner nuevoStringIngresado = new Scanner(System.in);

    System.out.println("Ingrese un nombre");
    String primerIngreso = ingreso1.nextline();

    System.out.println("Ingrese una edad");
    int segundoIngreso = ingreso2.nextint();

    System.out.println("Ingrese un DNI");
    int tercerIngreso = ingreso3.nextint();

    System.out.println("Ingrese un telefono");
    int cuartoIngreso = ingreso4.nextint();

    System.out.println("Ingrese una direccion");
    String quintoIngreso = ingreso5.nextline();



    Persona persona = new persona (primerIngreso, segundoIngreso, tercerIngreso, cuartoIngreso, quintoIngreso);

    String n = persona.GetNombre();
    int e = persona.GetEdad();
    int d = persona.GetDni();
    int t = persona.GetTelefono();
    String x = persona.GetDireccion();

    System.out.println (n);
    System.out.println (e);
    System.out.println (d);
    System.out.println (t);
    System.out.println (x);


    System.out.println("Ingrese el tipo de dato que desea cambiar");
    String datoACambiar = tipoDeDator.nextline();

    System.out.println("Ingrese el dato int que quiere cambiar");
    int intACambiar = nuevoIntIngresado.nextint();

    System.out.println("Ingrese el dato string que quiere cambiar");
    String StringACambiar = nuevoStringIngresado.nextline();

    persona.SetDato(datoACambiar, intACambiar, StringACambiar);

}