public class Artikel {

    private final String name;
    private final double preis;
    private int anzahl;

    public Artikel(String name, double preis, int anzahl) {
        this.name = name;
        this.preis = preis;
        this.anzahl = anzahl;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}
