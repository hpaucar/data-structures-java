/*
 * Dadas dos listas enlazadas, fusionarlas en una sola lista enlazada ordenada.
 * Por ejemplo, si la lista enlazada 1 es 1 -> 3 -> 5 y la lista enlazada 2 es 2 -> 4 -> 6,
 * la función debe devolver 1 -> 2 -> 3 -> 4 -> 5 -> 6.
 * La función debe tener una complejidad de tiempo O(n).
 * Las listas enlazadas pueden ser de diferentes tamaños y pueden contener elementos duplicados.
 * La lista enlazada resultante debe contener todos los elementos de ambas listas
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
     * Método para fusionar dos listas enlazadas
     * Pista: En caso se maneje como metodo el unico input seria la segunda lista
     * con la que "Entrelazaria" la primera.
     * Es necesario considerar una lista temporal "intermedia".
     * Todo puede ser manejado dentro de 1 mismo bucle.
     */

}
