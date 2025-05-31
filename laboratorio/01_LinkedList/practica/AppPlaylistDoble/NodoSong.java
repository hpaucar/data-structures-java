public class NodoSong {
    String name;
    NodoSong next;
    NodoSong prev;

    public NodoSong(String name) {
        this.name = name;
        this.next = null;
        this.prev = null;
    }
}