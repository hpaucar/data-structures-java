/*
 * Dada una lista enlazada, remover cada k elemento de la lista.
 * Por ejemplo, si la lista enlazada es 1 -> 2 -> 3 -> 4 -> 5 y k = 2,
 * la función debe devolver 1 -> 3 -> 5.
 * Es decir se eliminaron los nodos 2 y 4. Por que se eliminaron cada 2 nodos.
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
     * Método para remover cada k elemento de la lista enlazada
     * Pista: El metodo se puede declarar como Node removeKthNode(Node head, int k)
     */

}