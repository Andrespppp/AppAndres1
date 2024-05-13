package AppAndres.PideAndres;

import AppAndres.*;

import java.util.Scanner;

public class Menu {
    public static int menu() { // meter parametro para metodo
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("0- Salir");
        System.out.println("1- Primo");
        System.out.println("2- esCapicua");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.print("Elija opcion: ");
        opcion = teclado.nextInt();
        return (opcion);

    }

}
