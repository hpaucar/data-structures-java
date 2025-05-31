public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    public void agregarAlFinal(Palabra palabra) {
        Nodo nuevo = new Nodo(palabra);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public Palabra buscarPorIngles(String palabraIngles) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getDato().getIngles().equalsIgnoreCase(palabraIngles)) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public Palabra buscarPorEspanol(String palabraEspanol) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getDato().getEspañol().equalsIgnoreCase(palabraEspanol)) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }

    public void listar() {
        Nodo actual = cabeza;
        if (actual == null) {
            System.out.println("El diccionario está vacío.");
            return;
        }
        while (actual != null) {
            Palabra p = actual.getDato();
            System.out.println("Inglés: " + p.getIngles() + " → Español: " + p.getEspañol());
            actual = actual.getSiguiente();
        }
    }
}