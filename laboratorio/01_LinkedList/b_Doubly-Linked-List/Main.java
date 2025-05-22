public class Main {
    public static void main(String[] args) {
        Double_Linked_List DL = new Double_Linked_List();

        // Inserción de elementos
        DL.add_head(30);
        DL.add_head(20);
        DL.add_tail(40);
        DL.insert_at_pos(25, 2); // entre 20 y 30

        System.out.println("Lista después de insertar 20, 30, 25, 40:");
        DL.print_list();

        // Eliminación de elementos
        DL.delete_first();
        System.out.println("Después de eliminar el primero:");
        DL.print_list();

        DL.delete_last();
        System.out.println("Después de eliminar el último:");
        DL.print_list();

        DL.delete_at_pos(2);
        System.out.println("Después de eliminar en posición 2:");
        DL.print_list();

        // Actualización
        DL.update_data(99, 1);
        System.out.println("Después de actualizar posición 1 a 99:");
        DL.print_list();

        // Mostrar lista en reversa
        System.out.println("Lista en reversa:");
        DL.reverse_list();
    }
}
