package AppAndres.PideAndres;

import java.util.Scanner;
import AppAndres.Metodos.*;
import AppAndres.Paginas.*;
import AppAndres.Personas.CuentaPersonal;

public class Menu2 {

  public static void Menu() { // meter parametro para metodo

    Scanner teclado = new Scanner(System.in);
    String opcion = " ";
    boolean salir = false;

    do {

      System.out.println(
          "--------------------------------------------------------------------------------------------------------------------------------------");
      System.out.printf("| %s | %s | %s | %s | %s | %s | %s | %s | %s | %s | %s |%n",
          "0- Salir", "1- Home", "2- Reels", "3- Blogs", "4- Mis Viajes", "5- Perfil",
          "6- Guardados", "7- Mapa", "8- Buscar", "9- Log In", "10- Ajustes");
      System.out.println(
          "--------------------------------------------------------------------------------------------------------------------------------------");
      System.out.println(" ");
      System.out.print("Opción: ");
      opcion = teclado.nextLine();

      if (opcion.equals("0") || opcion.equals("1") || opcion.equals("2") || opcion.equals("3")
          || opcion.equals("4")
          || opcion.equals("5")
          || opcion.equals("6")
          || opcion.equals("7")
          || opcion.equals("8")
          || opcion.equals("9")
          || opcion.equals("10")) {
        switch (opcion) {
          // 0- salir
          case "0":
            System.out.println("Adiós");
            salir = true;
            break;
          // 1- Home
          case "1":
            Paginas.Home();
            System.out.println(" ");
            break;
          // 2- Reels
          case "2":
            Paginas.Reels();
            break;
          // 3- Blogs
          case "3":
            Paginas.Blog();

            break;
          // 4- Mis Viajes
          case "4":
            System.out.println("1-Home");
            break;
          // 5- Perfil

          // *****************ERROR DE HOY 12 05 24***************************
          case "5":
            Paginas.registrarUsuario();

            break;
          // 6- Guardados
          case "6":

            break;
          // 7- Mapa
          case "7":
            Paginas.Mapa();
            break;
          // 8- Buscar
          case "8":
            System.out.println("1-Home");
            break;
          // 9- Log In
          case "9":
            // *************************ERROR DE HOY */
            CuentaPersonal.crearNuevaCuenta(HashMap < Integer, CuentaPersonal > cuentas);
            break;

          // 9- Ajustes
          case "10":
            System.out.println("1-Home");
            break;

        }
      } else {

        System.out.println("Opción incorrecta");

      }
    } while (!salir);
  }
}