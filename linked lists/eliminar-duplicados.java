/*
 * Dada una lista enlazada ordenada, eliminar los duplicados.
 * Por ejemplo, si una lista enlazada es  1 -> 2 -> 2 -> 2 -> 5
 * la funcion debe retornar 1 -> 2 -> 5.
 * Es decir, se eliminaron los indices 1,2 o 2,3 o 1,3. Con tal que se eliminen 
 * los elementos necesario para que la lista no tenga duplicados
 * La función debe tener una complejidad de tiempo O(n). 
 */
class Node {
    int valor;
    Node siguiente;

    Node(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    void agregar(int valor) {
        Node nuevoNodo = new Node(valor);
        if (head == null) {
            head = nuevoNodo;
        } else {
            Node temp = head;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    void imprimir() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.valor + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }

    /*
     * Metodo para eliminar duplicados aqui
     * Pista: Considere que la lista este ordenadad para las pruebas
     * en caso no lo estuviera la implementacion y complejidad es distinta.
     */

}