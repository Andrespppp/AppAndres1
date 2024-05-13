package AppAndres.Paginas;

import AppAndres.Metodos.*;
import AppAndres.Personas.CuentaPersonal;
import AppAndres.PideAndres.*;
import java.util.Scanner;
import java.util.HashMap;

public class Paginas {

  public String opcion1;
  public static String sguard1;

  // Página Principal 1
  public static void Home() {
    Scanner teclado = new Scanner(System.in);

    // Sitios ASCII
    String sitios = " _____________________________" + "     _____________________________"
        + "     _____________________________\n" +
        "|            (  ) )           |" + "   |            (  ) )           |"
        + "   |            (  ) )           | \n" +
        "|              (_)            |" + "   |              (_)            |"
        + "   |              (_)            |\n" +
        "|      ________[_]____        |" + "   |      ________[_]____        |"
        + "   |      ________[_]____        |\n" +
        "|     / \\   \\__/  \\   \\       |" + "   |     / \\   \\__/  \\   \\       |"
        + "   |     / \\   \\__/  \\   \\       |\n" +
        "|    //__\\   \\ |[]|    \\      |" + "   |    //__\\   \\ |[]|    \\      |"
        + "   |    //__\\   \\ |[]|    \\      |\n" +
        "|   //____\\   \\|__|     \\     |" + "   |   //____\\   \\|__|     \\     |"
        + "   |   //____\\   \\|__|     \\     |\n" +
        "|  /XXXXXXXX\\____________\\    |" + "   |  /XXXXXXXX\\____________\\    |"
        + "   |  /XXXXXXXX\\____________\\    |\n" +
        "|    I_II  I___________I      |" + "   |    I_II  I___________I      |"
        + "   |    I_II  I___________I      |\n" +
        "|    I_II  I__[]_|_[]__I      |" + "   |    I_II  I__[]_|_[]__I      |"
        + "   |    I_II  I__[]_|_[]__I      |\n" +
        "|    I_II__I  XXXXXXX  I      |" + "   |    I_II__I  XXXXXXX  I      |"
        + "   |    I_II__I  XXXXXXX  I      |\n" +
        "|~~~~~~~~\\ \\~~~~~~~~~~~~~~~~~~|" + "   |~~~~~~~~\\ \\~~~~~~~~~~~~~~~~~~|"
        + "   |~~~~~~~~\\ \\~~~~~~~~~~~~~~~~~~|\n" +
        "|_______1-BURGER___KING_______|" + "   |________2-CINES__YELMO_______|"
        + "   |_____3-LA__TAGLIATELLA_______|";

    // Imprimir los sitios
    System.out.println("---------------1 - HOME -----------------");
    System.out.println(sitios);
    System.out.println(sitios);
    System.out.println(sitios);
    System.out.println("  ");
    System.out.print("Escoge un sitio para ir: ");
    String opcion = teclado.nextLine();
    Paginas.MenuHome(opcion);

  }

  public static void MenuHome(String opcion) {

    Scanner teclado = new Scanner(System.in);
    boolean salir = false;

    do {
      if (opcion.equals("1")) {
        System.out.println("    1 - BURGER KING  ");
      }
      if (opcion.equals("2")) {
        System.out.println("    2 - CINES YELMO  ");
      }
      if (opcion.equals("3")) {
        System.out.println("    3 - LA TAGLIATELLA  ");
      }

      System.out.println("--------------------------------------------------------");
      System.out.printf("| %s | %s| %s  |%n", "0 -Salir", "1 -Perfil del sitio", "2 -Guardar sitio como favorito");
      System.out.println("--------------------------------------------------------");
      System.out.println(" ");
      System.out.print("Opción: ");
      String opcionmh = teclado.nextLine();

      if (opcionmh.equals("0") || opcionmh.equals("1") || opcionmh.equals("2")) {
        switch (opcionmh) {
          // 0- Salir
          case "0":
            Menu2.Menu();
            break;
          // 1- Perfil
          case "1":
            System.out.println("Perfil");
            break;
          // 2- Guardar sitio fav
          case "2":
            salir = true;
            String opcion2 = opcion;
            Paginas.comoGuardar(opcion2);

            break;
        }
      } else {

        System.out.println("Opción incorrecta");

      }
    } while (!salir);

  }

  // Pagina 3 Reels
  public static void Reels() {
    // Paisaje ASCII
    String paisaje = " __________________________________________________________________________\n" +
        "|                                 (     )                                  |\n" +
        "|                                (      )                                  |\n" +
        "|                              (     )                                     |\n" +
        "|                             (    )                                       |\n" +
        "|                              )  )                                        |\n" +
        "|                             (  (                  /\\                     |\n" +
        "|                              (_)                 /  \\  /\\                |\n" +
        "|                      ________[_]________      /\\/    \\/  \\               |\n" +
        "|             /\\      /\\        ______    \\    /   /\\/\\  /\\/\\              |\n" +
        "|            /  \\    //_\\       \\    /\\    \\  /\\/\\/    \\/    \\             |\n" +
        "|     /\\    / /\\/\\  //___\\       \\__/  \\    \\/                             |\n" +
        "|    /  \\  /\\/    \\//_____\\       \\ |[]|     \\                             |\n" +
        "|   /\\/\\/\\/       //_______\\       \\|__|      \\                            |\n" +
        "|  /      \\      /XXXXXXXXXX\\                  \\                           |\n" +
        "|          \\    /_I_II  I__I_\\__________________\\                          |\n" +
        "|                 I_I|  I__I_____[]_|_[]_____I                             |\n" +
        "|                 I_II  I__I_____[]_|_[]_____I                             |\n" +
        "|                 I II__I  I     XXXXXXX     I                             |\n" +
        "|              ~~~~~\"   \"~~~~~~~~~~~~~~~~~~~~~~~~                          |\n" +
        "|__________________________________________________________________________|\n";

    // Imprimir el paisaje
    System.out.println(paisaje);

  }

  // Pagina 3
  public static void Blog() {

    Scanner teclado = new Scanner(System.in);
    String opcion = " ";
    boolean salir = false;

    do {

      System.out.println("_______________________________________________________________________________");
      System.out.println(
          "     0 | Salir                                                                 |\n"
              + "-------------------------------------------------------------------------------|\n"
              + "Blog 1 | Descubriendo el Arte Urbano: Murales y Grafitis que Cuentan Historias |\n"
              + "-------------------------------------------------------------------------------|\n"
              + "Blog 2 | Los Mejores Platos de la Cocina Asiática en la Ciudad                 |\n"
              + "-------------------------------------------------------------------------------|\n"
              + "Blog 3 | Explorando los Secretos del Cine Independiente                        |\n"
              + "-------------------------------------------------------------------------------|\n"
              + "Blog 4 | Los Mejores Lugares para Disfrutar de la Noche en la Ciudad           |\n"
              + "-------------------------------------------------------------------------------|\n"
              + "Blog 5 | Viaje Gastronómico por los Sabores del Mediterráneo                   |\n"
              + "-------------------------------------------------------------------------------|\n"
              + "     6 | Todos los Blogs                                                       |\n"
              + "_______________________________________________________________________________|\n");

      System.out.println(" ");
      System.out.print("Opción: ");
      opcion = teclado.nextLine();

      if (opcion.equals("0") || opcion.equals("1") || opcion.equals("2") || opcion.equals("3")
          || opcion.equals("4")
          || opcion.equals("5")
          || opcion.equals("6")) {
        switch (opcion) {
          // 0- salir
          case "0":
            System.out.println("Adiós");
            salir = true;
            break;
          // 1- Blog 1
          case "1":
            System.out.println(" ");
            System.out.println(" Blog 1: \"Los Mejores Platos de la Cocina Asiática en la Ciudad\"\n" +
                "\n" +
                "Si eres un amante de la cocina asiática, estás de suerte. En nuestra ciudad, hay una gran variedad de restaurantes que ofrecen auténticos platos asiáticos que te transportarán directamente a las calles de Tokio o Bangkok. Desde sushi fresco y sabroso hasta deliciosos platos de curry tailandés, la oferta es amplia y satisfará todos los antojos. Además de la comida, muchos de estos restaurantes ofrecen una experiencia auténtica con su decoración y ambiente. ¿Qué esperas para probar el exquisito sabor del este?\n ");
            break;
          // 2- Blog 2
          case "2":
            System.out.println(" ");

            System.out.println("Blog 2: \"Explorando los Secretos del Cine Independiente\"\n" +
                "\n" +
                "El cine independiente ofrece una ventana a mundos alternativos y narrativas únicas que a menudo pasan desapercibidas en las grandes producciones de Hollywood. En este blog, nos sumergimos en la vasta y diversa colección de películas independientes que desafían las convenciones y exploran temas profundos y provocativos. Desde dramas conmovedores hasta comedias irreverentes, el cine independiente nos invita a reflexionar, sentir y cuestionar. Prepárate para descubrir joyas cinematográficas que ampliarán tus horizontes y te dejarán pensando mucho después de que termine la película.\n");
            break;
          // 3- Blog 3
          case "3":
            System.out.println(" ");
            System.out.println("Blog 3: \"Los Mejores Lugares para Disfrutar de la Noche en la Ciudad\"\n" +
                "\n" +
                "La ciudad cobra vida cuando cae la noche, y para aquellos que buscan emociones, diversión y buena compañía, hay una amplia gama de lugares para explorar. Desde bares clandestinos con cócteles artesanales hasta clubes de jazz íntimos y discotecas vibrantes, cada rincón de la ciudad ofrece una experiencia nocturna única. Únete a nosotros mientras recorremos los rincones más emocionantes de la vida nocturna urbana y descubrimos los secretos mejor guardados de la ciudad después del anochecer.\n");
            break;
          // 4- Blog 4
          case "4":
            System.out.println(" ");
            System.out.println("Blog 4: \"Viaje Gastronómico por los Sabores del Mediterráneo\"\n" +
                "\n" +
                "Sumérgete en una experiencia culinaria que te transportará a las soleadas costas del Mediterráneo. Desde platos frescos de pescado y marisco hasta deliciosas tapas y sabrosos platos de pasta, la cocina mediterránea es conocida por su simplicidad, frescura y sabor. En este blog, exploraremos los ingredientes, técnicas y tradiciones que hacen de la cocina mediterránea una de las más apreciadas del mundo. Prepara tu paladar para un viaje inolvidable a través de los sabores y aromas de esta región tan rica en historia y cultura culinaria.\n");
            break;
          // 5- Blog 5
          case "5":
            System.out.println(" ");
            System.out.println("Blog 5: \"Descubriendo el Arte Urbano: Murales y Grafitis que Cuentan Historias\"\n" +
                "\n" +
                "Las calles de nuestra ciudad son un lienzo vivo donde artistas urbanos expresan sus pensamientos, emociones y visiones a través de murales y grafitis impresionantes. En este blog, nos aventuramos en un recorrido por los barrios más vibrantes para descubrir obras de arte callejero que cuentan historias, provocan reflexiones y transforman el paisaje urbano. Desde piezas políticas y sociales hasta obras puramente estéticas, el arte urbano nos invita a mirar más allá de lo convencional y a encontrar belleza en los lugares más inesperados. Únete a nosotros en este viaje visual y emocional a través de las calles de nuestra ciudad.");
            break;
          // 6- Todos los Blogs
          case "6":
            System.out.println(" ");
            System.out.println(" Blog 1: \"Los Mejores Platos de la Cocina Asiática en la Ciudad\"\n" +
                "\n" +
                "Si eres un amante de la cocina asiática, estás de suerte. En nuestra ciudad, hay una gran variedad de restaurantes que ofrecen auténticos platos asiáticos que te transportarán directamente a las calles de Tokio o Bangkok. Desde sushi fresco y sabroso hasta deliciosos platos de curry tailandés, la oferta es amplia y satisfará todos los antojos. Además de la comida, muchos de estos restaurantes ofrecen una experiencia auténtica con su decoración y ambiente. ¿Qué esperas para probar el exquisito sabor del este?\n"
                +
                "\n" +
                "Blog 2: \"Explorando los Secretos del Cine Independiente\"\n" +
                "\n" +
                "El cine independiente ofrece una ventana a mundos alternativos y narrativas únicas que a menudo pasan desapercibidas en las grandes producciones de Hollywood. En este blog, nos sumergimos en la vasta y diversa colección de películas independientes que desafían las convenciones y exploran temas profundos y provocativos. Desde dramas conmovedores hasta comedias irreverentes, el cine independiente nos invita a reflexionar, sentir y cuestionar. Prepárate para descubrir joyas cinematográficas que ampliarán tus horizontes y te dejarán pensando mucho después de que termine la película.\n"
                +
                "\n" +
                "Blog 3: \"Los Mejores Lugares para Disfrutar de la Noche en la Ciudad\"\n" +
                "\n" +
                "La ciudad cobra vida cuando cae la noche, y para aquellos que buscan emociones, diversión y buena compañía, hay una amplia gama de lugares para explorar. Desde bares clandestinos con cócteles artesanales hasta clubes de jazz íntimos y discotecas vibrantes, cada rincón de la ciudad ofrece una experiencia nocturna única. Únete a nosotros mientras recorremos los rincones más emocionantes de la vida nocturna urbana y descubrimos los secretos mejor guardados de la ciudad después del anochecer.\n"
                +
                "\n" +
                "Blog 4: \"Viaje Gastronómico por los Sabores del Mediterráneo\"\n" +
                "\n" +
                "Sumérgete en una experiencia culinaria que te transportará a las soleadas costas del Mediterráneo. Desde platos frescos de pescado y marisco hasta deliciosas tapas y sabrosos platos de pasta, la cocina mediterránea es conocida por su simplicidad, frescura y sabor. En este blog, exploraremos los ingredientes, técnicas y tradiciones que hacen de la cocina mediterránea una de las más apreciadas del mundo. Prepara tu paladar para un viaje inolvidable a través de los sabores y aromas de esta región tan rica en historia y cultura culinaria.\n"
                +
                "\n" +
                "Blog 5: \"Descubriendo el Arte Urbano: Murales y Grafitis que Cuentan Historias\"\n" +
                "\n" +
                "Las calles de nuestra ciudad son un lienzo vivo donde artistas urbanos expresan sus pensamientos, emociones y visiones a través de murales y grafitis impresionantes. En este blog, nos aventuramos en un recorrido por los barrios más vibrantes para descubrir obras de arte callejero que cuentan historias, provocan reflexiones y transforman el paisaje urbano. Desde piezas políticas y sociales hasta obras puramente estéticas, el arte urbano nos invita a mirar más allá de lo convencional y a encontrar belleza en los lugares más inesperados. Únete a nosotros en este viaje visual y emocional a través de las calles de nuestra ciudad.");

            break;

        }
      } else {

        System.out.println("Opción incorrecta");

      }
    } while (!salir);

  }

  // en menú - opción 7
  public static void Mapa() {
    // Paisaje ASCII
    String paisaje = "         ,__                                                  _,\n" +
        " \\~\\|  ~~---___              ,                          | \\\n" +
        "  | Wash./ |   ~~~~~~~|~~~~~| ~~---,                VT_/,ME>\n" +
        " /~-_--__| |  Montana |N Dak\\ Minn/ ~\\~~/Mich.     /~| ||,'\n" +
        "|Oregon /  \\         |------|   { WI / /~)     __-NY',|_\\,NH\n" +
        "/       |Ida.|~~~~~~~~|S Dak.\\    \\   | | '~\\  |_____,|~,-'Mass.\n" +
        "|~~--__ |    | Wyoming|____  |~~~~~|--| |__ /_-Penn.{,~Conn (RI)\n" +
        "|   |  ~~|~~|        |    ~~\\ Iowa/  `-' |`~ |~_____{/NJ\n" +
        "|   |     |  '---------, Nebr.\\----| IL|IN|OH,' ~/~/,|`MD (DE)\n" +
        "',  \\ Nev.|Utah| Colo. |~~~~~~~|    \\  | ,'~\\WV/ VA |\n" +
        " |Cal\\    |    |       | Kansas| MO  \\_-~ KY /`~___--\\\n" +
        "',   \\  ,-----|-------+-------'_____/__----~/N Car.\n" +
        " '_   '\\|     |      |~~~|Okla.|    | Tenn._/-,~~-,/\n" +
        "    \\    |Ariz.| New  |   |_    |Ark./~~|~~\\    \\,/S Car.\n" +
        "     ~~~-'     | Mex. |     `~~~\\___|MS |AL | GA /\n" +
        "         '-,_  | _____|          |  /   | ,-'---~\\\n" +
        "             `~'~  \\    Texas    |LA`--,~~~~-~~,FL\\\n" +
        "                    \\/~\\      /~~~`---`         |  \\\n" +
        "                        \\    /                   \\  |\n" +
        "                         \\  |                     '\\'";

    // Imprimir el paisaje
    System.out.println("---------------6 - MAPA ESTADOS UNIDOS ----------------");
    System.out.println(paisaje);

  }

  // que se te muestre el que ya has guardado anteriormente

  public static String Guardados(String lugares) {
    String sitio1 = "     _____________________________\n"
        + "   |            (  ) )           | \n"
        + "   |              (_)            |\n"
        + "   |      ________[_]____        |\n"
        + "   |     / \\   \\__/  \\   \\       |\n"
        + "   |    //__\\   \\ |[]|    \\      |\n"
        + "   |   //____\\   \\|__|     \\     |\n"
        + "   |  /XXXXXXXX\\____________\\    |\n"
        + "   |    I_II  I___________I      |\n"
        + "   |    I_II  I__[]_|_[]__I      |\n"
        + "   |    I_II__I  XXXXXXX  I      |\n"
        + "   |~~~~~~~~\\ \\~~~~~~~~~~~~~~~~~~|\n"
        + "   |_________1-BURGER__KING________|";
    ;
    String sitio2 = "     _____________________________\n"
        + "   |            (  ) )           | \n"
        + "   |              (_)            |\n"
        + "   |      ________[_]____        |\n"
        + "   |     / \\   \\__/  \\   \\       |\n"
        + "   |    //__\\   \\ |[]|    \\      |\n"
        + "   |   //____\\   \\|__|     \\     |\n"
        + "   |  /XXXXXXXX\\____________\\    |\n"
        + "   |    I_II  I___________I      |\n"
        + "   |    I_II  I__[]_|_[]__I      |\n"
        + "   |    I_II__I  XXXXXXX  I      |\n"
        + "   |~~~~~~~~\\ \\~~~~~~~~~~~~~~~~~~|\n"
        + "   |________2-YELMO__CINES_________|";
    String sitio3 = "     _____________________________\n"
        + "   |            (  ) )           | \n"
        + "   |              (_)            |\n"
        + "   |      ________[_]____        |\n"
        + "   |     / \\   \\__/  \\   \\       |\n"
        + "   |    //__\\   \\ |[]|    \\      |\n"
        + "   |   //____\\   \\|__|     \\     |\n"
        + "   |  /XXXXXXXX\\____________\\    |\n"
        + "   |    I_II  I___________I      |\n"
        + "   |    I_II  I__[]_|_[]__I      |\n"
        + "   |    I_II__I  XXXXXXX  I      |\n"
        + "   |~~~~~~~~\\ \\~~~~~~~~~~~~~~~~~~|\n"
        + "   |_____3-LA__TAGLIATELLA_______|";

    String[] sitios = new String[2];
    sitios[0] = sitio1;
    sitios[1] = sitio2;
    sitios[2] = sitio3;

    boolean salir = false;
    // Hacer algo con el array aquí
    if (lugares.equals("2"))
      System.out.println(sitio2);

    Menu2.Menu();
    return " ";
  }

  // menu do while imprimir switch de string y ya esta, solo se puede con los de
  // la base de datos, y el usuario con cuenta personal solo puede
  // añadir los que estén en la base de datos

  // crear array y guardar num de favorto para almacenar en Guardados y mostrarlo
  // ahí
  public static String comoGuardar(String opcion2) {
    Scanner teclado = new Scanner(System.in);
    String sitio1 = "     _____________________________\n"
        + "   |            (  ) )           | \n"
        + "   |              (_)            |\n"
        + "   |      ________[_]____        |\n"
        + "   |     / \\   \\__/  \\   \\       |\n"
        + "   |    //__\\   \\ |[]|    \\      |\n"
        + "   |   //____\\   \\|__|     \\     |\n"
        + "   |  /XXXXXXXX\\____________\\    |\n"
        + "   |    I_II  I___________I      |\n"
        + "   |    I_II  I__[]_|_[]__I      |\n"
        + "   |    I_II__I  XXXXXXX  I      |\n"
        + "   |~~~~~~~~\\ \\~~~~~~~~~~~~~~~~~~|\n"
        + "   |_________1-BURGER__KING________|";
    ;
    String sitio2 = "     _____________________________\n"
        + "   |            (  ) )           | \n"
        + "   |              (_)            |\n"
        + "   |      ________[_]____        |\n"
        + "   |     / \\   \\__/  \\   \\       |\n"
        + "   |    //__\\   \\ |[]|    \\      |\n"
        + "   |   //____\\   \\|__|     \\     |\n"
        + "   |  /XXXXXXXX\\____________\\    |\n"
        + "   |    I_II  I___________I      |\n"
        + "   |    I_II  I__[]_|_[]__I      |\n"
        + "   |    I_II__I  XXXXXXX  I      |\n"
        + "   |~~~~~~~~\\ \\~~~~~~~~~~~~~~~~~~|\n"
        + "   |________2-YELMO__CINES_________|";
    String sitio3 = "     _____________________________\n"
        + "   |            (  ) )           | \n"
        + "   |              (_)            |\n"
        + "   |      ________[_]____        |\n"
        + "   |     / \\   \\__/  \\   \\       |\n"
        + "   |    //__\\   \\ |[]|    \\      |\n"
        + "   |   //____\\   \\|__|     \\     |\n"
        + "   |  /XXXXXXXX\\____________\\    |\n"
        + "   |    I_II  I___________I      |\n"
        + "   |    I_II  I__[]_|_[]__I      |\n"
        + "   |    I_II__I  XXXXXXX  I      |\n"
        + "   |~~~~~~~~\\ \\~~~~~~~~~~~~~~~~~~|\n"
        + "   |_____3-LA__TAGLIATELLA_______|";

    String[] sitios = new String[2];
    sitios[0] = sitio1;
    sitios[1] = sitio2;
    sitios[2] = sitio3;

    boolean salir = false;

    if (opcion2.equals("1") || opcion2.equals("2") || opcion2.equals("3")) {
      switch (opcion2) {
        // 1- Home
        case "1":
          System.out.println(sitio1);
          System.out.println("Se ha guardado en GUARDADOS como sitio favorito");
          System.out.println(" ");
          return sitio1;
        // sguard1=Paginas.Guardados(sitios[1]);
        // Paginas.Guardados(sguard1);

        // 2- Reels
        case "2":
          System.out.println(sitio2);
          System.out.println("Se ha guardado en GUARDADOS como sitio favorito");
          System.out.println(" ");
          // return sitio2;
          Paginas.Guardados("2");

          // 3- Blogs
        case "3":
          System.out.println(sitio3);
          System.out.println("Se ha guardado en GUARDADOS como sitio favorito");
          System.out.println(" ");
          return sitio3;
        // Paginas.Guardados(sitios[2]);

      }
      // String opcion2 = opcion;
      // return Paginas.Guardados(opcion2);
    } else {

      System.out.println("Opción incorrecta");

    }

    Menu2.Menu();
    return " ";
  }

  public static void registrarUsuario() {
    CuentaPersonal.definirHashmap();
    // ********************EROR DE HOY***************
    CuentaPersonal.crearNuevaCuenta(HashMap < Integer, CuentaPersonal > cuentas);
    // ********************EROR DE HOY*************** Hashmap cannot be resolved to
    // a variable

    CuentaPersonal.guardarEnArchivo(HashMap < Integer, CuentaPersonal > cuentas);

  }

  /*
   * public static String[] arraySitios() {
   * // Definir el array de sitios
   * String sitio1 = "     _____________________________\n"
   * + "   |            (  ) )           | \n"
   * + "   |              (_)            |\n"
   * + "   |      ________[_]____        |\n"
   * + "   |     / \\   \\__/  \\   \\       |\n"
   * + "   |    //__\\   \\ |[]|    \\      |\n"
   * + "   |   //____\\   \\|__|     \\     |\n"
   * + "   |  /XXXXXXXX\\____________\\    |\n"
   * + "   |    I_II  I___________I      |\n"
   * + "   |    I_II  I__[]_|_[]__I      |\n"
   * + "   |    I_II__I  XXXXXXX  I      |\n"
   * + "   |~~~~~~~~\\ \\~~~~~~~~~~~~~~~~~~|\n"
   * + "   |_________1-BURGER__KING________|";
   * ;
   * String sitio2 = "     _____________________________\n"
   * + "   |            (  ) )           | \n"
   * + "   |              (_)            |\n"
   * + "   |      ________[_]____        |\n"
   * + "   |     / \\   \\__/  \\   \\       |\n"
   * + "   |    //__\\   \\ |[]|    \\      |\n"
   * + "   |   //____\\   \\|__|     \\     |\n"
   * + "   |  /XXXXXXXX\\____________\\    |\n"
   * + "   |    I_II  I___________I      |\n"
   * + "   |    I_II  I__[]_|_[]__I      |\n"
   * + "   |    I_II__I  XXXXXXX  I      |\n"
   * + "   |~~~~~~~~\\ \\~~~~~~~~~~~~~~~~~~|\n"
   * + "   |________2-YELMO__CINES_________|";
   * String sitio3 = "     _____________________________\n"
   * + "   |            (  ) )           | \n"
   * + "   |              (_)            |\n"
   * + "   |      ________[_]____        |\n"
   * + "   |     / \\   \\__/  \\   \\       |\n"
   * + "   |    //__\\   \\ |[]|    \\      |\n"
   * + "   |   //____\\   \\|__|     \\     |\n"
   * + "   |  /XXXXXXXX\\____________\\    |\n"
   * + "   |    I_II  I___________I      |\n"
   * + "   |    I_II  I__[]_|_[]__I      |\n"
   * + "   |    I_II__I  XXXXXXX  I      |\n"
   * + "   |~~~~~~~~\\ \\~~~~~~~~~~~~~~~~~~|\n"
   * + "   |_____3-LA__TAGLIATELLA_______|";
   * 
   * String[] sitios = new String[2];
   * sitios[0] = sitio1;
   * sitios[1] = sitio2;
   * sitios[2] = sitio3;
   * return sitios;
   * }
   * 
   * //
   * public static String[] obtenerSitioEspecifico(String opcion2) {
   * // Obtener el array de sitios
   * String[] sitios = arraySitios();
   * 
   * // Realizar la lógica con el switch
   * switch (opcion2) {
   * case "1":
   * return new String[] { sitios[0] };
   * case "2":
   * return new String[] { sitios[1] };
   * case "3":
   * return new String[] { sitios[2] };
   * default:
   * System.out.println("Opción incorrecta");
   * return null;
   * }
   * }
   * 
   * public static void imprimirSitios(String[] sitios) {
   * // Imprimir el array de sitios recibido como argumento
   * if (sitios != null) {
   * for (String sitio : sitios) {
   * System.out.println(sitio);
   * }
   * }
   * }
   */

}
