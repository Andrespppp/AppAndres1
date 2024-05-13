package AppAndres.Personas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class CuentaPersonal {
    // importar constructor
    // crear objeto hashmap
    // Constructor

    private static int nextId = 1;
    private int id;
    private String nombre;
    private String nickname;
    private int fechanac;

    // Constructor vacío
    public CuentaPersonal() {

    }

    // Constructor con atributos
    public CuentaPersonal(String nickname, String nombre, int fechanac) {
        this.id = nextId++;
        this.nickname = nickname;
        this.nombre = nombre;
        this.fechanac = fechanac;

    }

    // definicion de Hashmap
    public static void definirHashmap() {
        HashMap<Integer, CuentaPersonal> cuentas = new HashMap<>();
        crearNuevaCuenta(cuentas);
    }

    // se crea nuevo usuario
    public static void crearNuevaCuenta(HashMap<Integer, CuentaPersonal> cuentas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Creación de nueva cuenta personal:");
        System.out.print("nickname: ");
        String nickname = scanner.nextLine();
        System.out.print("nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("fechanac: ");
        int fechanac = scanner.nextInt();
        CuentaPersonal nuevaCuenta = new CuentaPersonal(nickname, nombre, fechanac);
        cuentas.put(nuevaCuenta.getId(), nuevaCuenta);
        guardarEnArchivo(cuentas);
    }

    // se guarda en fichero como base de datos
    public static void guardarEnArchivo(HashMap<Integer, CuentaPersonal> cuentas) {
        try (FileWriter writer = new FileWriter("basedatospersonal.txt")) {
            for (CuentaPersonal cuenta : cuentas.values()) {
                writer.write("ID: " + cuenta.getId() + ", Nombre: " + cuenta.getNickname() +
                        ", Sexo: " + cuenta.getNombre() + ", Seguidores: " + cuenta.getFechanac() + "\n");
            }
            System.out.println("Datos guardados correctamente en basedatospersonal.txt");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechanac() {
        return fechanac;
    }

    public void setFechanac(int fechanac) {
        this.fechanac = fechanac;
    }
}
