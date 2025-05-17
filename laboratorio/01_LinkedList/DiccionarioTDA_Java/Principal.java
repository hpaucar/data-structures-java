import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Diccionario diccionario = new Diccionario();
        int opcion;

        do {
            System.out.println("\n📘 MENÚ PRINCIPAL");
            System.out.println("1. Inglés → Español");
            System.out.println("2. Español → Inglés");
            System.out.println("3. Listar palabras");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese palabra en Inglés: ");
                    String palabraIngles = entrada.nextLine();
                    String traduccionEspanol = diccionario.traducirInglesAEspanol(palabraIngles);
                    if (traduccionEspanol != null) {
                        System.out.println("Traducción: " + traduccionEspanol);
                    } else {
                        System.out.print("Palabra no encontrada. Ingrese traducción en Español: ");
                        traduccionEspanol = entrada.nextLine();
                        diccionario.agregarPalabra(palabraIngles, traduccionEspanol);
                        System.out.println("Palabra agregada con éxito.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese palabra en Español: ");
                    String palabraEspanol = entrada.nextLine();
                    String traduccionIngles = diccionario.traducirEspanolAIngles(palabraEspanol);
                    if (traduccionIngles != null) {
                        System.out.println("Traducción: " + traduccionIngles);
                    } else {
                        System.out.print("Palabra no encontrada. Ingrese traducción en Inglés: ");
                        traduccionIngles = entrada.nextLine();
                        diccionario.agregarPalabra(traduccionIngles, palabraEspanol);
                        System.out.println("Palabra agregada con éxito.");
                    }
                    break;

                case 3:
                    diccionario.listarPalabras();
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        entrada.close();
    }
}