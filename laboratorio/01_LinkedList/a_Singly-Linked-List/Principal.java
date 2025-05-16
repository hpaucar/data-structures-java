import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        boolean continuar = true;
        int valor, posicion;

        while (continuar) {
            System.out.println("\nMENU DE OPCIONES:");
            System.out.println("1. Agregar al inicio");
            System.out.println("2. Agregar al final");
            System.out.println("3. Agregar en posicion");
            System.out.println("4. Eliminar primero");
            System.out.println("5. Eliminar ultimo");
            System.out.println("6. Eliminar en posicion");
            System.out.println("7. Actualizar valor en posicion");
            System.out.println("8. Revertir lista");
            System.out.println("9. Ver lista");
            System.out.println("10. Obtener tamaño");
            System.out.println("11. Salir");
            System.out.print("\nSeleccione una opción: ");

            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor: ");
                    valor = entrada.nextInt();
                    lista.insertarInicio(valor);
                    break;
                case 2:
                    System.out.print("Ingrese el valor: ");
                    valor = entrada.nextInt();
                    lista.insertarFinal(valor);
                    break;
                case 3:
                    System.out.print("Ingrese el valor: ");
                    valor = entrada.nextInt();
                    System.out.print("Ingrese la posición: ");
                    posicion = entrada.nextInt();
                    lista.insertarEnPosicion(valor, posicion);
                    break;
                case 4:
                    lista.eliminarInicio();
                    break;
                case 5:
                    lista.eliminarFinal();
                    break;
                case 6:
                    System.out.print("Ingrese la posición: ");
                    posicion = entrada.nextInt();
                    lista.eliminarEnPosicion(posicion);
                    break;
                case 7:
                    System.out.print("Ingrese el nuevo valor: ");
                    valor = entrada.nextInt();
                    System.out.print("Ingrese la posición: ");
                    posicion = entrada.nextInt();
                    lista.actualizarValor(valor, posicion);
                    break;
                case 8:
                    lista.revertir();
                    break;
                case 9:
                    lista.mostrar();
                    break;
                case 10:
                    System.out.println("Tamaño de la lista: " + lista.obtenerTamanio());
                    break;
                case 11:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}
