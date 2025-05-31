public class Nodo {
    private Palabra dato;
    private Nodo siguiente;

    public Nodo(Palabra dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Palabra getDato() {
        return dato;
    }

    public void setDato(Palabra dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}