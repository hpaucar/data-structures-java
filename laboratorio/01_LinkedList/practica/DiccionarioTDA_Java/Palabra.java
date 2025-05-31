public class Palabra {
    private String ingles;
    private String español;

    public Palabra(String ingles, String español) {
        this.ingles = ingles.toLowerCase();
        this.español = español.toLowerCase();
    }

    public String getIngles() {
        return ingles;
    }

    public String getEspañol() {
        return español;
    }
}