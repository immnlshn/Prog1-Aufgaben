public class Hauptgericht extends Gericht {

    private static int verkaufteHauptgerichte = 0;

    public Hauptgericht() {
        verkaufteHauptgerichte++;
    }
    @Override
    public double getPreis() {
        return 2.9;
    }

    public static int getAnzahl() {
        return verkaufteHauptgerichte;
    }
}
