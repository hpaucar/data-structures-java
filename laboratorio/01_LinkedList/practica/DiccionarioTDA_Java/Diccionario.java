public class Diccionario {
    private ListaEnlazada listaPalabras;

    public Diccionario() {
        listaPalabras = new ListaEnlazada();
    }

    public String traducirInglesAEspanol(String palabra) {
        Palabra resultado = listaPalabras.buscarPorIngles(palabra);
        return (resultado != null) ? resultado.getEspañol() : null;
    }

    public String traducirEspanolAIngles(String palabra) {
        Palabra resultado = listaPalabras.buscarPorEspanol(palabra);
        return (resultado != null) ? resultado.getIngles() : null;
    }

    public void agregarPalabra(String ingles, String español) {
        listaPalabras.agregarAlFinal(new Palabra(ingles, español));
    }

    public void listarPalabras() {
        listaPalabras.listar();
    }
}