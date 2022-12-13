public abstract class Gericht {

    private static int verkaufteGerichte = 0;

    public Gericht() {
        verkaufteGerichte++;
    }

    public abstract double getPreis();

    public static int getGesamtAnzahl() {
        return verkaufteGerichte;
    }
}
