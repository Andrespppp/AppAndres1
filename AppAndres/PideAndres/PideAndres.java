package AppAndres.PideAndres;

import java.util.Scanner;

/*public class Pide {
    public static String Scanner(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un " +mensaje);

        String palabra=teclado.nextLine();
        teclado.nextLine();
        return (palabra);
    }

}*/
public class PideAndres {

  /**
   * Pide al usuario un n�mero entero y devuelve el n�mero introducido
   *
   * @param mensaje el mensaje mostrado en la petici�n del dato al usuario
   * @return numero entero introducido por teclado
   */
  public static int numero(String mensaje) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("\n" + mensaje + ": ");
    return teclado.nextInt();
  }

  /**
   * Pide al usuario un n�mero entero y devuelve el n�mero introducido
   *
   * @param mensaje el mensaje mostrado en la petici�n del dato al usuario
   * @return cadena introducida por teclado
   */
  public static String cadena(String mensaje) {

    Scanner teclado = new Scanner(System.in);
    System.out.print("\n" + mensaje + ": ");
    return teclado.nextLine();
  }

  /**
   * Pide al usuario un n�mero entero y devuelve el n�mero introducido
   *
   * @param mensaje el mensaje mostrado en la petici�n del dato al usuario
   * @return cadena introducida por teclado
   */
  public static char caracter(String mensaje) {

    Scanner teclado = new Scanner(System.in);
    System.out.print("\n" + mensaje + ": ");
    return teclado.nextLine().charAt(0);
  }

}
