public class CircularList {
    NodoSong head;
    NodoSong current;
    int size;

    public CircularList() {
        this.head = null;
        this.current = head;
        this.size = 0;
    }

    public void add(String name) {
        // Adicionar un nodo a la lista, primero crear un temporal
        // despues verficar que la lista esté vacia
        NodoSong temp = new NodoSong(name);
        if (head == null) {
            head = temp;
            head.next = head;
            current = head;
        } else {
            NodoSong it = head;
            while (it.next != head) {
                it = it.next;
            }
            temp.next = head;
            it.next = temp;
        }
        size++;
    }

    public String nextSong() {
        if (current == null)
            return null;
        String name = current.name;
        current = current.next;
        return name;
    }

    public String getCurrentSong() {
        return "";
    }

    public boolean isEmpty() {
        return false;
    }
}
