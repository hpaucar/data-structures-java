public class CircularListDoble {
    NodoSong head;
    NodoSong current;
    int size;

    public CircularListDoble() {
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
            head.prev = head;
            current = head;
        } else {
            NodoSong it = head;
            while (it.next != head) {
                it = it.next;
            }
            temp.next = head;
            temp.prev = it;
            head.prev = temp;
            it.next = temp;
        }
        size++;
    }

    public String nextSong() {
        if (current == null)
            return null;        
        current = current.next;
        String name = current.name;
        return name;
    }

    public String prevSong() {
        if (current == null)
            return null;        
        current = current.prev;
        String name = current.name;
        return name;
    }

    public String getCurrentSong() {

        return current.name;
    }

    public boolean isEmpty() {
        return false;
    }
}
