import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double_Linked_List DL = new Double_Linked_List();
        boolean flag = true;
        int value, position;

        while (flag) {
            System.out.println("\nMENU DE OPCIONES:");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Insertar en posición");
            System.out.println("4. Eliminar primero");
            System.out.println("5. Eliminar último");
            System.out.println("6. Eliminar en posición");
            System.out.println("7. Actualizar nodo en posición");
            System.out.println("8. Mostrar lista en reversa");
            System.out.println("9. Ver lista");
            System.out.println("10. Salir");

            System.out.print("Ingrese una opción: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Ingrese valor: ");
                    value = sc.nextInt();
                    DL.add_head(value);
                    break;
                case 2:
                    System.out.print("Ingrese valor: ");
                    value = sc.nextInt();
                    DL.add_tail(value);
                    break;
                case 3:
                    System.out.print("Ingrese valor: ");
                    value = sc.nextInt();
                    System.out.print("Ingrese posición: ");
                    position = sc.nextInt();
                    DL.insert_at_pos(value, position);
                    break;
                case 4:
                    DL.delete_first();
                    break;
                case 5:
                    DL.delete_last();
                    break;
                case 6:
                    System.out.print("Ingrese posición: ");
                    position = sc.nextInt();
                    DL.delete_at_pos(position);
                    break;
                case 7:
                    System.out.print("Ingrese nuevo valor: ");
                    value = sc.nextInt();
                    System.out.print("Ingrese posición: ");
                    position = sc.nextInt();
                    DL.update_data(value, position);
                    break;
                case 8:
                    DL.reverse_list();
                    break;
                case 9:
                    DL.print_list();
                    break;
                case 10:
                    flag = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

        sc.close();
    }
}