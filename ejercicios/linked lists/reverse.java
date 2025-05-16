/*
 * Dada una lista enlazada,
 * escribe una función que invierta la lista enlazada y devuelva la nueva cabeza
 * de la lista.
 * Por ejemplo, si la lista enlazada es 1 -> 2 -> 3 -> 4 -> 5,
 * la función debe devolver 5 -> 4 -> 3 -> 2 -> 1.
 * La función debe tener una complejidad de tiempo O(n).
 * La lista enlazada puede ser vacía o contener un solo nodo.
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
     * Método para invertir la lista enlazada debajo
     * Pista: El metodo se puede declarar como Node reverse(Node head)
     */

}