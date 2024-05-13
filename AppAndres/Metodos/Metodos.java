package AppAndres.Metodos;

import AppAndres.*;
import AppAndres.PideAndres.*;

import java.util.Scanner;

public class Metodos {

  public static void bienvenida() {
    int personasparti;
    String fecha;
    // Scanner importado para elegir opciones en el menú que vamos a crear
    Scanner teclado = new Scanner(System.in);

    System.out
        .println("Bienvenido a *nombre de la aplicación*, cuál es el plan de hoy?? Veamos que puedes eligir!! :))");
    // Escribir cuantas personas son
    System.out.println("¿Cuántas personas vais a participar?");
    personasparti = Integer.parseInt(teclado.nextLine());
    // La fecha de la actividad
    System.out.println("¿Qué día? (Escribir como en el ejemplo:dd/mm/aa)");
    fecha = teclado.nextLine();
    // Elegir entre

  }

  /*
   * public static void menu() {
   * Scanner teclado = new Scanner(System.in);
   * String eleccion;
   * int numplan;
   * 
   * do {
   * System.out.
   * println("Preferís un viaje más duradero o un plan improvisado? Escribir viaje o plan: "
   * );
   * eleccion = teclado.nextLine();
   * 
   * if ("viaje".equals(eleccion)) {
   * System.out.println("Donde quieres viajar? Escribe el país: ");
   * eleccion = teclado.nextLine();
   * System.out.println(
   * "De momento no tenemos la opcion de buscar viaje,pero guardamos sus preferencias de viajar a "
   * + eleccion);
   * 
   * } else {
   * System.out.
   * println("Escriba de nuevo entre plan o viaje para elejir una actividad");
   * }
   * 
   * if ("plan".equals(eleccion)) {
   * System.out.println("Escogamos un viaje entonces");
   * System.out.println("Veamos que planes tenemos para el dia de hoy");
   * System.out.println("Elije la opción que desees: ");
   * System.out.println("____________________________ ");
   * System.out.println("1.Plan en la naturaleza");
   * System.out.println("2.Plan de ocio ");
   * System.out.println("3.Plan por la ciudad");
   * System.out.println("4.Plan en casa");
   * 
   * numplan = Integer.parseInt(teclado.nextLine());
   * switch (numplan) {
   * case 1:
   * System.out.println("Has elegido plan en la naturaleza");
   * break;
   * case 2:
   * System.out.println("Has elegido de ocio ");
   * break;
   * case 3:
   * System.out.println("Has elegido un plan por la ciudad");
   * break;
   * case 4:
   * System.out.println("Has elegido un plan en casa");
   * break;
   * }
   * break;
   * 
   * } else {
   * }
   * 
   * } while (("plan".equals(eleccion)) || ("viaje".equals(eleccion)));
   * }
   */

}
