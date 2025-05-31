public class ListaPersona {
    NodoPersona head;
    int size;

    public ListaPersona() {
        this.head = null;
        this.size = 0;
    }

    public void adicionarPersonaInicio(Persona p) {
        NodoPersona temp = new NodoPersona(p);
        if (head == null) {
            head = temp;
        } else {
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void adicionarPersonaFinal(Persona p) {
        NodoPersona temp = new NodoPersona(p);
        if (head == null) {
            head = temp;

        } else {
            NodoPersona it = head;
            while (it.next != null) {
                it = it.next;
            }
            it.next = temp;
            temp.prev = it;
        }

        size++;
    }

    public String imprimirLista() {
        NodoPersona it = head;
        String cadena = "";
        while (it != null) {
            cadena += it.toString();
            it = it.next;
        }
        return cadena;
    }

    public Persona obtenerpersonaListapos(int pos){
        NodoPersona it = head;
        int cont = 0;
        while (it != null){
            if(cont == pos){
                return it.persona;
            } 
            it = it.next;
            cont++;
        }
        return null;
    }
}
