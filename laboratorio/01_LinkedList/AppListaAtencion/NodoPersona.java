public class NodoPersona {
    public Persona persona;
    public NodoPersona next;
    public NodoPersona prev;

    public NodoPersona(Persona p){
        this.persona = p;
        this.next = null;
        this.prev = null;
    }

    public NodoPersona(){
        this.next = null;
        this.prev = null;
    }
}
